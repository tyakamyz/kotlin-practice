package section03.s14_코틀린에서_다양한_클래스를_다루는_방법

/*
* data를 붙여주면 equals, hashCode, toString을 자동으로 생성해줌
* */
data class PersonDto(
    val name: String,
    val age: Int,
)
