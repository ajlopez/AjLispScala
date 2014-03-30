
package com.ajlopez.scala.ajlisp

class Atom(name: String) extends SymbolicExpression {
    def evaluate(context: Context): Any = context.getValue(name)
}

