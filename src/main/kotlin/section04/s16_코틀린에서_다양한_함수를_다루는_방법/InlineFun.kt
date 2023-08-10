package section04.s16_코틀린에서_다양한_함수를_다루는_방법

inline fun Int.add3(other: Int): Int {
    return this + other
}

fun main() {
    3.add3(4)
}
