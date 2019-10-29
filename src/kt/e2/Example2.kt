package kt.e2

interface Foo2 {
    companion object {
//      @JvmStatic
        fun bar(): Int = 42
    }
}

fun main() {
    println(Foo2.bar())
}

