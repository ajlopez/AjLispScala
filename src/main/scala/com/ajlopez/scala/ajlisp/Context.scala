
package com.ajlopez.scala.ajlisp

import collection.mutable.Map

class Context {
    var values: Map[String,Any] = Map()
    
    def setValue(name: String, value: Any) { 
        values(name) = value
    }
    
    def getValue(name: String): Any = values get name
}
