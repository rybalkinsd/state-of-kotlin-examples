package kt.e1

interface Foo {
    fun bar(): Int = 42
}

class Baz: Foo

fun main() {
    println(Baz().bar())
}

