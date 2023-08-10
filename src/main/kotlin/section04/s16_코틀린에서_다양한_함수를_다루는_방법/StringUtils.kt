package section04.s16_코틀린에서_다양한_함수를_다루는_방법

fun main() {
    val str = "ABC"
    println(str.lastChar())
}

fun String.lastChar(): Char {
    return this[this.length - 1]
}

val String.lastChar: Char
    get() = this[this.length - 1]
