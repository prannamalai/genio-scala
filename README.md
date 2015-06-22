# genio-scala
An attempt to learn scala by creating a simple library that can 

* Create I/O Stubs in Java and Scala based on Google Discovery Format Spec
* Options to integrate with some of the client transport libraries
* Generate ScalaCheck generators for the Stubs
* Small DSL for people to invoke APIs

In memory representation:
   
		 * Property:
			 * Name
			 * Type(Enum)
				 * String
                 * Integer
                 * Object
                 * Array
                 * ...

		 * Paths:  
			 * Path:  
				 * List[Method]  
				 * List[Path]  

		 * Method:  
			 * verb/httpMethod  
			 * Params(Hashmap)
			 	 * Query
			 	 	 * List[Param]  
				 * Path
				 	 * List[Param]  

		 * Request Body:  
			 * $ref: Schema ref (Schema name as string)  

		 * Responses(Hashmap)
		 	 * 200 - $ref schema ref (Schema name as string)  
             * 400 - ....  

		 * Schemas(Hashmap):  
			 * name 
			 	* schema(Hashmap):  
                	 * objects
                	 	 * List[Property]  
                	 *arrays
                	 	 * List[Property]  

		 * Param:  
			 * Name  
			 * Type
			 	 * String  
        		 * Integer  
        		 * ....  
