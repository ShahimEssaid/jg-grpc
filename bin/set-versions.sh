#!/usr/bin/env bash
#set -x
set -e
set -u
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

# https://stackoverflow.com/questions/148451/how-to-use-sed-to-replace-only-the-first-occurrence-in-a-file
# sed '0,/Apple/{s/Apple/Banana/}' input_filename
pwd
. .versions

sed -i "0,/<\/version>/{s/<version>.*<\/version>/<version>${MVN_VER}<\/version>/}" java/pom.xml
sed -i "0,/description/{s/version = \".*\"/version = \"${PY_VER}\"/}" python/pyproject.toml
sed -i "0,/description/{s/version\": \".*\"/version\": \"${PY_VER}\"/}" js/package.json
