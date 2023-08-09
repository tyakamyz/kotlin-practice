package section03.s13_코틀린에서_중첩_클래스를_다루는_방법

fun main() {

}

class House(
    private val address: String,
    private val livingRoom: LivingRoom
) {
    /*
    * 권장되는 내부 클래스 방식
    * 외부 클래스와 연결되지 않음. 자바에서 static 내부 클래스와 같음.
    * 권장되는 이유: 내부 클래스가 외부 클래스를 참조할 경우 메모리 누수 등의 문제가 발생할 수 있으며, 디버깅이 어렵다
    **/
    class LivingRoom(
        private val area: Double
    )

    /* 권장되지 않는 방식
    * 외부 클래스를 굳이 사용해야겠다면 아래와 같이 선언하여 사용 가능 */
    inner class LivingRoom2(
        private val area: Double
    ) {
        val address: String
            get() = this@House.address
    }
}
