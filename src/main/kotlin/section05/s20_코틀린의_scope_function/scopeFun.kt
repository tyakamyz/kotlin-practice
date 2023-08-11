package section05.s20_코틀린의_scope_function

import section05.s19_코틀린의_이모저모.Person

fun printPerson(person: Person?) {
    if (person != null) {
        println(person.name)
        println(person.age)
    }
}

/* scope function: 람다를 사용하여 일시적인 영역 생성하여 코드를 더 간결하게 만들거나, method chaining 활용하는 함수를 scope function이라 함
* safe call(?.)을 사용하여 person이 null이 아닐 때 let을 호출
* let: scope function의 한 종류. 람다를 받아, 람다 결과를 반환하는 함수
*/
fun refactoryPrintPerson(person: Person?) {
    person?.let {
        println(it.name)
        println(it.age)
    }
}

fun main() {
    val person = Person("홍길동", 20)

    val value1 = person.let {
        it.age
    }

    val value2 = person.run {
        this.age
    }

    val value3 = person.also {
        it.age
    }

    val value4 = person.apply {
        this.age
    }

    val value5 = person.let { p ->
        p.age
    }

    val value6 = person.run {
        age
    }

    with(person) {
        println(this.name)
        println(this.age)
    }

    val strings = listOf("APPLE", "CAR")
    strings.map {it.length }
        .filter { it > 3 }
        .let { lengths -> println(lengths) }

    val numbers = listOf("one", "two", "three", "four")
    val modifiedFirstItem = numbers.first()
        .let { firstItem ->
            if (firstItem.length >= 5) {
                firstItem
            } else {
                "!${firstItem}!"
            }
        }.uppercase()
    println(modifiedFirstItem)

    mutableListOf("one", "two", "three")
        .also { println("four 추가 이전 지금 값: ${it}") }
        .add("four")
}


