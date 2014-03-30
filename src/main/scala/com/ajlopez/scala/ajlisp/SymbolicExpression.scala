
package com.ajlopez.scala.ajlisp

trait SymbolicExpression {
    def evaluate(context: Context): Any
}

