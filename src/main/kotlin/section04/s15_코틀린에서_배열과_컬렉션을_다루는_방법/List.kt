package section04.s15_코틀린에서_배열과_컬렉션을_다루는_방법

fun main() {
    val emptyList = emptyList<Int>()    // 타입 명시 필요
    val numbers = listOf(100, 200)

    println(numbers[0])
    for (num in numbers) {
        println(num)
    }

    for((idx, value) in numbers.withIndex()) {
        println("${idx} ${value}")
    }

    val numbers2 = mutableListOf(100, 200)      // 가변으로 생성하고 싶다면 mutableListOf로 생성해야함
    numbers2.add(300)

    for (num in numbers2) {
        println(num)
    }

    for((idx, value) in numbers2.withIndex()) {
        println("${idx} ${value}")
    }
}
