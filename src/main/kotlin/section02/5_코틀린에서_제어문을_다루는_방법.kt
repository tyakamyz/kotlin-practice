package section02

// unit(void) 생략
fun validateScoreIsNotNegative(score: Int) {
    if (score < 0) {
        throw IllegalArgumentException("{$score}는 0보다 작을 수 없습니다")
    }
}

fun validateScoreIsNotNegative2(score: Int) {
    if (score !in 0..100) {
        throw IllegalArgumentException("{$score}의 범위는 0부터 100입니다")
    }
}

fun validateScore(score: Int) {
    if (score in 0..100) {
        println("정상 범위 입니다")
    }
}

/* 코틀린에서는 if문이 Expression으로 사용할 수 있다
* 즉, if문을 바로 값으로 리턴이 가능함
* 자바의 경우 if문은 값이 아닌 Statement로 취급하기 때문에 불가. 대신 삼항연산자를 제공
* 코틀린은 따라서 삼항영산자가 존재하지 않는다 */
fun getPassOrFail(score: Int): String {
    return if (score >= 50) {
        "P"
    } else {
        "F"
    }
}

/* 자바의 swich문을 대신하는 함수 when
* 사용법이 더 편하며, 범위로도 지정이 가능
* 또한 조건부에는 어떠한 Expression이든 사용 가능. is 등*/
fun getGradeWithSwitch(score: Int): String {
    when (score / 10) {
        9 -> "A"
        8 -> "B"
        7 -> "C"
        else -> "D"
    }

    return when (score) {
        in 90..99 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "D"
    }
}

/* 범위 값 표현 */
fun judgeNumber(number: Int) {
    when (number) {
        1, 0, -1 -> true
        else -> false
    }
}

/* 값 자체가 없어도 동작함 */
fun judgeNumber2(number: Int) {
    when {
        number == 0 -> true
        number % 2 == 0 -> true
        else -> false
    }
}
