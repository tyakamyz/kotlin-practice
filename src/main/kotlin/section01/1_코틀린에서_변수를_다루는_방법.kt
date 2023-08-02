import sample.Person

fun main() {
    /* 1. var, val 차이 */
    var number1: Long = 10L
    number1 = 5L

    val number2: Long = 10L
    // number2 = 5L     // val은 불변 (final)


    /* 2. 원시형, 참조 객체 선언 방법
    * 코틀린에서는 따로 구분이 있지 않음.
    * 표현식은 Long으로 되어있지만, 실제로 사용시에는 long으로 선언
    * 필요에 따라 알아서 참조 객체 형태로 변경하여 사용됨 */
    var number3: Long = 10L
    var number4: Long = 1_000L


    /* 3. nullable */
    //var number5: Long= null   // 컴파일 오류 발생
    var number6: Long? = null   // ? 추가를 통해 null의 삽입 여부를 결정할 수 있음


    /* 4. 객체 인스턴스 생성 */
    val person = Person("홍길동")  // 코틀린에서는 new를 사용하지 않음
}
