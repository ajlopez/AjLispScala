
package com.ajlopez.scala.ajlisp

import org.scalatest._

class ContextSpec extends org.scalatest.FlatSpec {
    "A Context" should "return None when value is undefined" in {
        val context = new Context()
        assert(context.getValue("foo") == None)
    }

    it should "set and get value" in {
        val context = new Context()
        context.setValue("foo", "bar")
        assert(context.getValue("foo") == Some("bar"))
        context.setValue("answer", 42)
        assert(context.getValue("answer") == Some(42))
    }
}


