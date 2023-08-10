package section04.s16_코틀린에서_다양한_함수를_다루는_방법

import com.lannstark.lec16.Person

fun Person.nextYearAge(): Int {
    println("확장 함수")
    return this.age + 1
}

fun main() {
    val person = Person("A", "B", 100)
    person.nextYearAge()
}
