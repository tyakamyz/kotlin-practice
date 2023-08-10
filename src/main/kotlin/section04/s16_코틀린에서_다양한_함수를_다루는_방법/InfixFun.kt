package section04.s16_코틀린에서_다양한_함수를_다루는_방법

fun Int.add(other: Int): Int {
    return this + other
}

infix fun Int.add2(other: Int): Int {
    return this + other
}

fun main() {
    3.add(4)
    3.add2(4)
    3 add2 4
}
