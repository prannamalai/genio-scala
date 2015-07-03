# genio-scala
An attempt to learn scala by creating a simple library that can 

* Create I/O Stubs in Java and Scala based on Google Discovery Format Spec
* Options to integrate with some of the client transport libraries
* Generate ScalaCheck generators for the Stubs
* Small DSL for people to invoke APIs

#In memory template: 

##Service: (Object)
* baseURL
* basePath
* schemas
* resources

##Schemas: (HashMap)
* Key: SchemaName
* Value: Schema

##Schema: (Object)
* id: {String id}
* type: [string, number, integer, boolean, object, array]
* description:
* required: {boolean}
* format: [int32, uint32, double, float, byte, date, date-time, int64, uint64]
* enum: {List of values}
* location: [path, query]
* properties: (HashMap)
	* Key: propertyName
	* Value: Schema
* items: (Link ref - could be string representing the schema key)
	* Value: Schema

#Resources: (HashMap)
* Key: ResourceName
* Value: Resource

#Resource: (Object)
* path: {String}
* resources: (HashMap)
	* Key: resourceName
	* Value: Resource
* methods: (HashMap)
	* Key: methodName
	* Value: Method

#Method: (Object)
* id: {String}
* path: {String}
* httpMethod: [GET, POST, PUT, DELETE,PATCH]
* parameters: (HashMap)
	* Key: ParameterName
	* Value: Parameter
* request:
	* Value: Schema
* response:
	* Value: Schema

#Parameter: (Object)
	alias to Schema
	
	
