
package com.ajlopez.scala.ajlisp

import com.ajlopez.scala.ajlisp.Machine
import org.scalatest._

class MachineSpec extends FlatSpec {
    "A Machine" should "evaluate simple values" in {
        val machine = new Machine()
        assert(machine.evaluate(1) == 1)
        assert(machine.evaluate("foo") == "foo")
        assert(machine.evaluate(null) == null)
    }
}