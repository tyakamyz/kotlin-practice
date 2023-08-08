package section02

/*
    코틀린에서 for문은 내부적으로 등차수열을 생성하여 처리
    while, do while문은 자바와 동일하여 생략
* */
fun main() {
    val numbers = listOf(1L, 2L, 3L)
    for (number in numbers) {
        println(number)
    }

    for (i in 1..3) {
        println(i)
    }

    for (i in 3 downTo 1) {
        println(i)
    }

    for (i in 1..5 step 2) {
        println(i)
    }
}
