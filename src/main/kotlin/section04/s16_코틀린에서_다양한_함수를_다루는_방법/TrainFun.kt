package section04.s16_코틀린에서_다양한_함수를_다루는_방법

open class Train(
    val name: String = "무궁화호",
    val price: Int = 5_000
)

fun Train.isExpensive(): Boolean {
    println("Train 확장 함수")
    return this.price >= 10000
}

class Ktx : Train("Ktx", 40_000)

fun Ktx.isExpensive(): Boolean {
    println("Ktx의 확장 함수")
    return this.price >= 10000
}

fun main() {
    val train: Train = Train()
    train.isExpensive()

    val ktx1: Train = Ktx()
    ktx1.isExpensive()

    val ktx2: Ktx = Ktx()
    ktx2.isExpensive()
}
