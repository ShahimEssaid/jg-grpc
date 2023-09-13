#!/usr/bin/env bash
#set -x
set -e
#set -u
set -o pipefail
set -o noclobber
shopt -s nullglob

# stack overflow #59895
SOURCE="${BASH_SOURCE[0]}"
while [ -h "$SOURCE" ]; do
    DIR="$(cd -P "$(dirname "$SOURCE")" && pwd)"
    SOURCE="$(readlink "$SOURCE")"
    [[ $SOURCE != /* ]] && SOURCE="$DIR/$SOURCE"
done
DIR="$(cd -P "$(dirname "$SOURCE")" && pwd)"

cd "$DIR"/..

shopt -s globstar

PATH="${DIR}:${PATH}"
export PATH


function java_compile() {
    mkdir -p java/src/main/java
    bin/protoc \
      -Iproto-import \
      -Iproto \
      --java_out=java/src/main/java \
      proto/**/*.proto

    bin/protoc \
      -Iproto-import \
      -Iproto \
      --plugin=protoc-gen-grpc-java=bin/protoc-gen-grpc-java-1.58.0-linux-x86_64.exe \
      --grpc-java_out=java/src/main/java \
      proto/**/*.proto
}

# https://grpc.io/docs/languages/python/quickstart/

function python_compile() {
    bin/setup.sh
    . .venv/bin/activate

    mkdir -p python/src
    python3 \
      -m grpc_tools.protoc \
      -Iproto-import \
      -Iproto \
      --python_out=python/src \
      --pyi_out=python/src \
      --grpc_python_out=python/src \
      proto/**/*.proto

    deactivate
}

function python_help() {
    python3 -m grpc_tools.protoc -h
}

function js_compile(){
  # https://github.com/grpc/grpc-node/tree/master/examples/helloworld/static_codegen
  # https://grpc.io/docs/platforms/web/basics/
    mkdir -p js/src
    bin/protoc \
      -Iproto-import \
      -Iproto \
      --js_out=import_style=commonjs:js/src \
      proto/**/*.proto

    bin/protoc \
        -Iproto-import \
        -Iproto \
        --grpc-web_out=import_style=commonjs,mode=grpcwebtext:js/src \
        proto/**/*.proto
}


java_compile
python_compile
js_compile



