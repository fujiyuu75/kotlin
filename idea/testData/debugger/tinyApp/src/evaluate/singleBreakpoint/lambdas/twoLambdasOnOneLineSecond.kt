package twoLambdasOnOneLineSecond

fun main(args: Array<String>) {
    val a = A()
    // EXPRESSION: it
    // RESULT: Unresolved reference: it
    //Breakpoint! (lambdaOrdinal = 1)
    a.foo(1) { a }.foo(2) { a }
}

class A {
    fun foo(i: Int, f: (Int) -> A): A {
        return f(i)
    }
}
