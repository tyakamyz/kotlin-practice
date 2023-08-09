package section03.s10_코틀린에서_상속을_다루는_방법

class Cat(
    species: String
) : Animal(species, 4) {    // 상속은 :을 사용. 변수 타입 선언과 다르게 한칸 띄고 :를 사용. ()를 통해 상속과 동시에 super를 호출할 수 있음

    override fun move() {
        println("고양이 걸음")
    }
}
