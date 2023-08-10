package section04.s15_코틀린에서_배열과_컬렉션을_다루는_방법

fun main() {
    var array = arrayOf(100, 200)

    array.plus(300)             // 추가 안됨
    array = array.plus(400)     // 다시 담아줘야 추가됨

    for (i in array.indices) {
        println("${i} ${array[i]}")
    }

    for (value in array) {
        println(value)
    }

    for ((idx, value) in array.withIndex()) {
        println("${idx} ${value}")
    }
}
