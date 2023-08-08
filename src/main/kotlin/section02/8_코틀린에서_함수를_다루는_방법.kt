package section02

fun max(a: Int, b: Int): Int {
    return if (a > b) {
        a
    } else {
        b
    }
}

/* 함수의 결과값이 하나라면 block 대신 = 사용 가능 */
fun max2(a: Int, b: Int): Int =
    if (a > b) {
        a
    } else {
        b
    }

/* 리턴 타입을 추론할 수 있기 때문에 리턴 타입을 생략할 수 있음. block{} 대신 =을 사용하였기 때문에 가능 */
fun max3(a: Int, b: Int) =
    if (a > b) {
        a
    } else {
        b
    }

/* 한줄로 작성 */
fun max4(a: Int, b: Int) = if (a > b) { a } else { b }

/* 중괄호 생략 가능 */
fun max5(a: Int, b: Int) = if (a > b) a else b

/* 매개변수에 default 값을 넣을 수 있음. 매개 변수를 넣지 않아도 기본값을 통해 기능이 동작함
* 자바에서 오버로딩을 통해 함수를 매개변수별로 생성해야하는 단점을 커버
* 코틀린에서도 똑같이 오버로딩도 가능함
*
* 만약 a는 기본값을 사용하고 b만 값을 지정하고 싶다면
* max6(b=5)와 같이 호출이 가능하다
* 이 기능을 통해 builder를 따로 사용하지 않고도 같은 효과로 사용이 가능하다
* */
fun max6(a: Int = 2, b: Int = 3) = if (a > b) a else b

/*
* vararg를 통해 가변인자를 넣을 수 있다
*
* printAll("A","B","C")
*
* val array = arrayOf("A", "B", "C")
* printAll(*array)  // 배열을 넣을 때는 *를 붙여줘야함
* */
fun printAll(vararg strings: String) {
    for (str in strings) {
        println(str)
    }
}
