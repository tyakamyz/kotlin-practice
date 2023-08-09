package section03.s12_코틀린에서_object_키워드를_다루는_방법

class Person private constructor (
    private var name: String,
    private var age: Int
){
    /* 코틀린에서는 static 대신 companion object 사용
    * companion object를 사용하여 static 선언 */
    //companion object {                // Companion이라는 이름이 생략되어 있음.
    companion object Factory : Log{     // object에 이름을 부여할 수 있으며, 인터페이스 구현도 가능.
        private const val MIN_AGE = 1   // 상수 선언 시 const 예약어 사용. 컴파일 시 로딩됨
        fun newBaby(name: String): Person {
            return Person(name, MIN_AGE)
        }

        override fun log() {
            println("오버라이드 구현")
        }
    }
}

/* 싱글톤 구현. object만 붙여주면 됨 */
object Singleton {
    var a: Int = 0
}
