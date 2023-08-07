package section01

/*
- String.startsWith: 특정 문자로 시작하는지 확인
- String.endsWith: 특정 문자로 종료하는지 확인

- 코틀린에서 null이 들어갈 수 있는 타입은 완전히 다르게 간주된다
    - 한 번 null 검사를 하면 non-null임을 컴파일러가 알 수 있다
- null이 아닌 경우에만 호출되는 Safe Call (?.)이 있다
- null인 경우에만 호출되는 Elvis 연산자 (?:)가 있다
- null이 절대 아닐 때 사용할 수 있는 null 아님 단언 (!!)이 있다
- 코틀린에서 자바 코드를 사용할 때 플랫폼 타입 사용에 유의해야 한다
    - 자바 코드를 읽으며 null 가능성 확인 / 코틀린으로 wrapping
*/

fun main() {
    var str: String? = null
    //println(str.length)       // 실행 불가
    println(str?.length)        // Safe Call: null이 아닐 경우 실행. null일 경우 null 값 반환
    println(str?.length ?: 0)   // Elvis 연산자: null 값일 경우 0을 반환
}

fun startsWithA1(str: String?): Boolean {
    /*if(str == null) {
        throw IllegalArgumentException("null이 들어왔습니다")
    }
    return str.startsWith("A")*/

    return str?.startsWith("A")
        ?: throw IllegalArgumentException("null이 들어왔습니다")
}

fun startWithA2(str: String?): Boolean? {
    /*if(str == null) {
        return null
    }
    return str.startsWith("A")*/

    return str?.startsWith("A")
}

fun startWithA3(str: String?): Boolean {
    /*if(str == null) {
        return false
    }
    return str.startsWith("A")*/

    return str?.startsWith("A") ?: false
}

fun startsWithA4(str: String?): Boolean {
    return str!!.startsWith("A")    // 절대 null이 아니라는 것을 명시할 때 !! 사용
}
