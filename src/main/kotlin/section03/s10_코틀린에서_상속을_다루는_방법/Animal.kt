package section03.s10_코틀린에서_상속을_다루는_방법

abstract class Animal(
    protected val species: String,
    protected open val legCount: Int
) {
    abstract fun move()
}
