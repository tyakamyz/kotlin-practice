package section03.s14_코틀린에서_다양한_클래스를_다루는_방법

enum class Country(
    private val code: String
) {
    KOREA("KO"),
    AMERICA("US")
    ;
}

/* when을 함께 사용하면 가독성 좋은 코드를 작성할 수 있음 */
fun handleCountry(country: Country) {
    when (country) {
        Country.KOREA -> TODO()
        Country.AMERICA -> TODO()
    }
}
