# jg-grpc

This is a setup to write protobuf/gRPC files and generate and publish Java, JS, and Python libraries to use in various projects. Setups for other languages will be added when needed.  Projects are published to the usual repositories. See each project's README for more information.

Layout:
* `/bin` various scripts and binaries to run the tooling.
* `/proto` the source protobuf files that will be compiled.
* `/proto-import` any protobuf needed imports. These are not compiled as of now. You should have a package in your language from third parties or another setup like this for another independent project.
* `/java` a Maven project to build and publish the compiled source.
* `/js` a NPM project to ...
* `/python` a Poetry project to ...


# gRPC tools setup
* protoc
  * Download from:: https://github.com/protocolbuffers/protobuf
    * For Linux x86 64: https://github.com/protocolbuffers/protobuf/releases/download/v24.3/protoc-24.3-linux-x86_64.zip
    * Unpack `protoc` to `/bin` and `include/google` to `/proto-imports`
* gRPC Java
  * Download plugin from: https://repo1.maven.org/maven2/io/grpc/protoc-gen-grpc-java/
    * For Linux x86 64: https://repo1.maven.org/maven2/io/grpc/protoc-gen-grpc-java/1.58.0/protoc-gen-grpc-java-1.58.0-linux-x86_64.exe
    * Place in `/bin` and do not rename.
* gRPC JS
  * Download JS plugin from: https://github.com/protocolbuffers/protobuf-javascript
    * For Linux x86 64: https://github.com/protocolbuffers/protobuf-javascript/releases/download/v3.21.2/protobuf-javascript-3.21.2-linux-x86_64.tar.gz
    * Unpack `bin/proto-gen-js` to `/bin`
  * Download gGRP plugin from: https://github.com/grpc/grpc-web
    * For Linux x86 64: https://github.com/grpc/grpc-web/releases/download/1.4.2/protoc-gen-grpc-web-1.4.2-darwin-x86_64
    * Save to `/bin` and rename to `protoc-gen-grpc-web`
* Make `/bin` files executable
* See `*.sh` scripts in `/bin` to see how the above binaries are used.
  * Some are called directly. Others are looked up from the updated PATH.
  * TODO: this needs some more work to understand why we can't use all from the updated PATH that includes `/bin`.
  * 