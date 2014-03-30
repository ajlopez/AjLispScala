
package com.ajlopez.scala.ajlisp

import org.scalatest._

class MachineSpec extends org.scalatest.FlatSpec {
    "A Machine" should "evaluate simple values" in {
        val machine = new com.ajlopez.scala.ajlisp.Machine()
        assert(machine.evaluate(1) == 1)
        assert(machine.evaluate("foo") == "foo")
        assert(machine.evaluate(null) == null)
    }
}
