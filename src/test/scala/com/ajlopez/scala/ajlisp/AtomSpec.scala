
package com.ajlopez.scala.ajlisp

import org.scalatest._

class AtomSpec extends org.scalatest.FlatSpec {
    "An Atom" should "evaluate to None when is undefined in context" in {
        val context = new Context()
        val atom = new Atom("foo")
        assert(atom.evaluate(context) == None)
    }

    it should "evaluate to its context value" in {
        val context = new Context()
        val atom = new Atom("foo")
        context.setValue("foo", "bar")
        assert(atom.evaluate(context) == Some("bar"))
    }
    
    it should "return its name as toString" in {
        val atom = new Atom("foo")
        assert(atom.toString() equals "foo")
    }
}


