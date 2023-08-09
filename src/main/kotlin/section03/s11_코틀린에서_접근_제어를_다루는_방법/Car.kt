package section03.s11_코틀린에서_접근_제어를_다루는_방법

class Car(
    internal val name: String,  // getter, setter 접근자 동시에 제어
    private var owner: String,
    _price: Int
) {
    var price = _price
        private set             // setter만 private으로 제어
}
