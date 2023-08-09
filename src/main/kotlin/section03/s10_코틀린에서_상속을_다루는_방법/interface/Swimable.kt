package section03.s10_코틀린에서_상속을_다루는_방법.`interface`

interface Swimable {

    val swimAbility: Int    // 상속받은 객체에서 getter 구현을 원한다는 의미

    fun act() {
        println("어푸 어푸")
    }
}
