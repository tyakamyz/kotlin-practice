package section03.s12_코틀린에서_object_키워드를_다루는_방법

import com.lannstark.lec12.Movable

fun main() {
    /*
    * 익명 클래스 사용 시 object를 통해 구현
    * 자바에서는 new Movable() {@Override public void move() {.....} .......} 으로 구현. 문법만 조금 다를뿐 사용법은 같음.
    * */
    moveSomthing(object : Movable{
        override fun move() {
            println("동작1")
        }
        override fun fly() {
            println("동작2")
        }
    })
}

private fun moveSomthing(movable: Movable) {
    movable.move()
    movable.fly()
}
