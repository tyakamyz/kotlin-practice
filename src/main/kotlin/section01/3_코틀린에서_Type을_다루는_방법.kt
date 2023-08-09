package section01

import sample.Person

fun main() {
    /* 기본 타입 캐스팅*/
    val number1 = 3
    val number2: Long = number1.toLong()
    val result = number1 / number2.toDouble()

    /* 세이프 콜을 통한 기본 타입 캐스팅 */
    val number4: Int? = 3
    val number5: Long = number4?.toLong() ?: 0L
}

/* 일반 타입 캐스팅 */
fun printAgeIfPerson1(obj: Any) {
    if (obj is Person) {            // if (obj instabceif)
        //val person = obj as Person  // (Person) obj
        val person = obj            // as Person 생략 가능. 스마트 캐스트
        println(person.name)
        println(obj.name)          // 바로 호출도 가능
    }

    // Person 타입이 아닐 경우를 체크하고 싶을 때
    if (obj !is Person) {

    }
}

/* null이 존재하는 일반 타입일 경우 */
fun printAgeIfPerson2(obj: Any?) {
    val person: Person? = obj as? Person    // ? 연산자를 통해 세이프 콜
    println(person?.name)
}
