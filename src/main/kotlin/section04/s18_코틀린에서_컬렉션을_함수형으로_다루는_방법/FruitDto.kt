package section04.s18_코틀린에서_컬렉션을_함수형으로_다루는_방법

data class FruitDto(
    val id: Long,
    val name: String,
    val factoryPrice: Long,
    val currentPrice: Long,
) {
    /* custom getter 추가 */
    val isSamePrice: Boolean
        get() = this.factoryPrice == this.currentPrice
}

val List<FruitDto>.samePriceFilter: List<FruitDto>
    get() = this.filter(FruitDto::isSamePrice)
