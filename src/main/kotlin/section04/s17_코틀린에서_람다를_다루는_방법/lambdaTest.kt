package section04.s17_코틀린에서_람다를_다루는_방법

import com.lannstark.lec17.Fruit

/*
* 자바와 코틀린은 근본적으로 다른 한 가지가 있다
* 코틀린에서는 함수가 그 자체로 값이 될 수 있다
* 변수에 할당할수도, 파마리터로 넘길 수도 있다
* 자바의 경우 함수는 2급시민으로 분류되어 직접적으로 변수에 담거나 파라미터로 넘길 수 없다
* (익명 함수를 사용하거나, 람다를 사용해야함)
* */
fun main() {
    val fruits = listOf(
        Fruit("사과", 1_000),
        Fruit("사과", 1_200),
        Fruit("사과", 1_300),
        Fruit("사과", 1_500),
        Fruit("바나나", 3_000),
        Fruit("바나나", 3_200),
        Fruit("바나나", 3_300),
        Fruit("수박", 10_000),
    )

    val isApple = fun(fruit: Fruit): Boolean {
        return fruit.name == "사과"
    }

    val isApple2 = {fruit: Fruit -> fruit.name == "사과"}

    isApple(fruits[0])
    isApple.invoke(fruits[0])

    isApple2(fruits[0])
    isApple2.invoke(fruits[0])

    // 함수의 타입: (파라미터 타입) -> 반환 타입
    // 파라미터 타입이 여러개라면 (파라미터 타입, 파라미터 타입,...) 콤마로 구분
    val isApple3: (Fruit) -> Boolean = fun(fruit: Fruit): Boolean {
        return fruit.name == "사과"
    }

    val isApple4: (Fruit) -> Boolean = {fruit: Fruit -> fruit.name == "사과"}

    /* 필터 처리를 위한 함수를 파라미터로 넘길 수 있음 */
    filterFruits(fruits, isApple)

    /* 함수 자체를 넘길 수도 있음 */
    filterFruits(fruits, {fruit: Fruit -> fruit.name == "사과"})
    /* 중괄호를 밖으로 빼면 마지막 파라미터로 인식 */
    filterFruits(fruits) { fruit: Fruit -> fruit.name == "사과" }
    /* fruit: Fruit의 경우 받는 쪽에서 이미 타입이 정의되어 있기 때문에 타입 추론이 가능하여 타입 생략 가능 */
    filterFruits(fruits) { fruit -> fruit.name == "사과" }
    /* 파라미터가 하나일 경우는 it으로 생략이 가능 */
    filterFruits(fruits) { it.name == "사과" }
    /* 람다에 여러줄이 작성될 수 있으며, 마지막 줄의 결과가 반환 값이 된다 */
    filterFruits(fruits) {
        println("사과사과사과")
        it.name == "사과"
    }
}

private fun filterFruits(fruits: List<Fruit>, filter: (Fruit) -> Boolean): List<Fruit> {
    val results = mutableListOf<Fruit>()
    for (fruit in fruits){
        if (filter(fruit)) {
            results.add(fruit)
        }
    }

    return results
}
