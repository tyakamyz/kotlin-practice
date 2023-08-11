package section05.s19_코틀린의_이모저모

import com.lannstark.lec17.Fruit

/* type Alias
* 타입을 미리 정의하고 변수처럼 사용 */
typealias USGTMap = Map<String, String>
typealias FruitFilter = (Fruit) -> Boolean

fun filterFruits(fruits: List<Fruit>, filter: FruitFilter) {

}

fun main() {
    /* componentN 함수
    * 구조분해를 통해 변수가 차례로 들어간다
    * data 객체에서 자동으로 componentN 함수가 동작 */
    val person = Person("홍길동", 20)
    val (value1, value2) = person
    println("이름: ${value1}, 나이: ${value2}")
}

/* TakeIf, TakUnless */
fun getNumberOrNull(number: Int): Int? {
    /*return if (number <= 0) {
        null
    } else {
        number
    }*/

    // takeif를 사용하여 위 코드를 아래와 같이 변경할 수 있음
    // 반대로 조건에 만족할 때 null을 반환하고 싶다면 takUnless 사용
    return number.takeIf { it > 0 }
}
