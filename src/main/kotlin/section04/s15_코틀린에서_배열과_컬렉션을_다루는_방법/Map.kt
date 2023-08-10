package section04.s15_코틀린에서_배열과_컬렉션을_다루는_방법

fun main() {
    val oldMap = mutableMapOf<Int, String>()
    oldMap.put(1, "첫번째")
    oldMap[2] = "두번째"       // 이런 방식으로도 put이 가능함

    val newMap = mapOf(1 to "첫번째", 2 to "두번째")      // 생성시 초기화 방법

    for (key in oldMap.keys) {
        println(key)
        println(oldMap[key])
    }

    for ((key, value) in oldMap.entries) {
        println(key)
        println(value)
    }
}
