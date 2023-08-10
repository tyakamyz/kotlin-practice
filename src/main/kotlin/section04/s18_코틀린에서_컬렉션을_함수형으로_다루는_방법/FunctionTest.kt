package section04.s18_코틀린에서_컬렉션을_함수형으로_다루는_방법

import com.lannstark.lec17.Fruit

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

    filterFruits(fruits) { fruit -> fruit.name == "사과" }

    /*var samePriceFruits = fruitsInList.flatMap { list ->
        list.filter { fruit -> fruit.factoryPrice == fruit.currentPrice }
    }*/

    var samePriceFruits = fruitsInList.flatMap { list -> list.samePriceFilter }
}

private fun filterFruits(fruits: List<Fruit>, filter: (Fruit) -> Boolean): List<Fruit> {
    return fruits.filter(filter)
}

val fruitsInList: List<List<FruitDto>> = listOf(
    listOf(
        FruitDto(1L, "사과", 1_000, 1_500),
        FruitDto(2L, "사과", 1_200, 1_500),
        FruitDto(3L, "사과", 1_500, 1_500),
    ),
    listOf(
        FruitDto(4L, "바나나", 1_000, 1_500),
        FruitDto(5L, "바나나", 1_200, 1_500),
        FruitDto(6L, "바나나", 1_500, 1_500),
    ),
    listOf(
        FruitDto(7L, "수박", 1_000, 1_500),
    )
)


