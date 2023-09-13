/**
 * @fileoverview gRPC-Web generated client stub for essaid.jg.proto.v1
 * @enhanceable
 * @public
 */

// Code generated by protoc-gen-grpc-web. DO NOT EDIT.
// versions:
// 	protoc-gen-grpc-web v1.4.2
// 	protoc              v4.24.3
// source: essaid/jg/proto/v1/hello.proto


/* eslint-disable */
// @ts-nocheck



const grpc = {};
grpc.web = require('grpc-web');

const proto = {};
proto.essaid = {};
proto.essaid.jg = {};
proto.essaid.jg.proto = {};
proto.essaid.jg.proto.v1 = require('./hello_pb.js');

/**
 * @param {string} hostname
 * @param {?Object} credentials
 * @param {?grpc.web.ClientOptions} options
 * @constructor
 * @struct
 * @final
 */
proto.essaid.jg.proto.v1.HelloServiceClient =
    function(hostname, credentials, options) {
  if (!options) options = {};
  options.format = 'text';

  /**
   * @private @const {!grpc.web.GrpcWebClientBase} The client
   */
  this.client_ = new grpc.web.GrpcWebClientBase(options);

  /**
   * @private @const {string} The hostname
   */
  this.hostname_ = hostname.replace(/\/+$/, '');

};


/**
 * @param {string} hostname
 * @param {?Object} credentials
 * @param {?grpc.web.ClientOptions} options
 * @constructor
 * @struct
 * @final
 */
proto.essaid.jg.proto.v1.HelloServicePromiseClient =
    function(hostname, credentials, options) {
  if (!options) options = {};
  options.format = 'text';

  /**
   * @private @const {!grpc.web.GrpcWebClientBase} The client
   */
  this.client_ = new grpc.web.GrpcWebClientBase(options);

  /**
   * @private @const {string} The hostname
   */
  this.hostname_ = hostname.replace(/\/+$/, '');

};


/**
 * @const
 * @type {!grpc.web.MethodDescriptor<
 *   !proto.essaid.jg.proto.v1.HelloRequest,
 *   !proto.essaid.jg.proto.v1.HelloResponse>}
 */
const methodDescriptor_HelloService_Hello = new grpc.web.MethodDescriptor(
  '/essaid.jg.proto.v1.HelloService/Hello',
  grpc.web.MethodType.UNARY,
  proto.essaid.jg.proto.v1.HelloRequest,
  proto.essaid.jg.proto.v1.HelloResponse,
  /**
   * @param {!proto.essaid.jg.proto.v1.HelloRequest} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.essaid.jg.proto.v1.HelloResponse.deserializeBinary
);


/**
 * @param {!proto.essaid.jg.proto.v1.HelloRequest} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @param {function(?grpc.web.RpcError, ?proto.essaid.jg.proto.v1.HelloResponse)}
 *     callback The callback function(error, response)
 * @return {!grpc.web.ClientReadableStream<!proto.essaid.jg.proto.v1.HelloResponse>|undefined}
 *     The XHR Node Readable Stream
 */
proto.essaid.jg.proto.v1.HelloServiceClient.prototype.hello =
    function(request, metadata, callback) {
  return this.client_.rpcCall(this.hostname_ +
      '/essaid.jg.proto.v1.HelloService/Hello',
      request,
      metadata || {},
      methodDescriptor_HelloService_Hello,
      callback);
};


/**
 * @param {!proto.essaid.jg.proto.v1.HelloRequest} request The
 *     request proto
 * @param {?Object<string, string>=} metadata User defined
 *     call metadata
 * @return {!Promise<!proto.essaid.jg.proto.v1.HelloResponse>}
 *     Promise that resolves to the response
 */
proto.essaid.jg.proto.v1.HelloServicePromiseClient.prototype.hello =
    function(request, metadata) {
  return this.client_.unaryCall(this.hostname_ +
      '/essaid.jg.proto.v1.HelloService/Hello',
      request,
      metadata || {},
      methodDescriptor_HelloService_Hello);
};


module.exports = proto.essaid.jg.proto.v1;
