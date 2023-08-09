package section03.s10_코틀린에서_상속을_다루는_방법

import section03.s10_코틀린에서_상속을_다루는_방법.`interface`.Flyable
import section03.s10_코틀린에서_상속을_다루는_방법.`interface`.Swimable

class Penguin(
    species: String
) : Animal(species, 2), Swimable, Flyable {

    private val wingCount: Int = 2

    override fun move() {
        println("펭귄 걸음")
    }

    override val legCount: Int
        get() = super.legCount + this.wingCount

    override fun act() {
        super<Swimable>.act()
        super<Flyable>.act()
    }

    override val swimAbility: Int
        get() = 3
}
