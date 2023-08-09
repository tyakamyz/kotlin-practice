package section03.s9_코틀린에서_클래스를_다루는_방법

/*class Person constructor(name: String, age: Int){
    val name: String = name
    var age: Int = age
}*/

/*
* 생성자 선언 constructor는 생략 가능.
* 필드 생성과 생성자 생성을 동시에 선언이 가능하여 body에 내용없이 생성자로만 선언이 가능
*
* body 역시 내용이 없으면 생략 가능
* class Person(val name: String, var age: Int)
*
* 코틀린은 getter와 setter를 자동으로 생성해주기때문에 별도로 구현할 필요가 없음
* */
class Person(
    val name: String,       // getter와 setter를 자동으로 생성해주기 때문에 프로퍼티라고 부름
    customName: String,
    var age: Int
) {
    // custom getter를 선언하기 위해 주생성자에 val 제거 후 선언해야함. body에 custom getter 선언.
    // 무한루프 방지를 위해 field 예약어 사용. backing field라 부름. 실무에선 잘 사용하지 않음
    /* val name = name
        get() = field.uppercase() */

    fun getUppercaseName(): String {
        return this.name.uppercase()
    }

    val uppercateName: String
        get() = this.name.uppercase()


    // custom setter 사용법
    // Setter는 지양하기 때문에 실무에선 거의 사용하지 않음
    // 무한루프 방지를 위해 field 예약어 사용
    var customName: String = customName
        set(value) {
            field = value.uppercase()
        }

    // 생성자 검증을 위한 구현 방법
    init {
        if (age < 0) {
            throw IllegalArgumentException("나이는 ${age}일 수 없습니다")
        }
    }

    // 부생성자를 추가하고 싶을 경우 constructor를 사용하여 선언 가능
    // this 사용 시 주생성자(클래스 생성 시 선언한 생성자) 사용
    // 부생성자는 최종적으로 주생성자를 호출해야함
    // 코틀린에서는 부생성자 사용을 권장하지 않음
    constructor(name: String): this(name, "name",1) {
        println("부생성자 1")
    }

    constructor(): this("무명") {
        println("부생성자 2")
    }

    // 함수, 프로퍼티 선언 방법
    // 객체의 속성을 표현한다면 custom getter
    // 그렇지 않다면 함수를 권장
    // ex) 사람이 성인인가? 라는 속성을 표현하는 정의에 가까우므로, 해당 코드는 custom getter를 활용하여 프로퍼티처럼 보이게하는 것을 권장
    fun isAdultFuntionType(): Boolean {
        return this.age >= 20
    }

    val isAdultPropertyType1: Boolean
        get() = this.age >= 20

    val isAdultPropertyType2: Boolean
        get() {
            return this.age >= 20
        }
}

fun main() {
    val person = Person("홍길동", "honggildong", 20)
    println(person.name)
    person.age = 10
    println(person.age)
}
