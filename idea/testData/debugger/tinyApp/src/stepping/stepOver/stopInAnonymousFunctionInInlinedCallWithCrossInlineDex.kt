package stopInAnonymousFunctionInInlinedCallWithCrossInlineDex

// KT-15282

fun main(args: Array<String>) {
    foo(fun () {
        //Breakpoint!
        12
    })
}

fun bar(f: () -> Unit) {
    f()
}

inline fun foo(crossinline func: () -> Int) {
    bar {
        func()
    }
}