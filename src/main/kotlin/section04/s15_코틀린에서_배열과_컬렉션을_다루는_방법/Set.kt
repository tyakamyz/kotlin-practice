package section04.s15_코틀린에서_배열과_컬렉션을_다루는_방법

fun main() {
    val numbers = setOf(100, 200)   // 가변으로 생성하고 싶다면 mutableSetOf 사용

    for (num in numbers) {
        println(num)
    }

    for((idx, value) in numbers.withIndex()) {
        println("${idx} ${value}")
    }
}
