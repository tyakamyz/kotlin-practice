package section01

import com.lannstark.lec04.JavaMoney

fun main() {
    val money1 = JavaMoney(2_000L)
    val money2= JavaMoney(1_000L)

    /*@Override
    public int compareTo(@NotNull JavaMoney o) {
        return Long.compare(this.amount, o.amount);
    }*/

    // 객체를 비교할 때 비교연산자를 사용해도 compareTo를 자동으로 호출해준다
    if (money1 > money2) {
        println("Money1이 Money2보다 금액이 큽니다")
    }
}

fun compareEx() {
    val money3= JavaMoney(1_000L)
    val money4= money3
    val money5= JavaMoney(1_000L)

    /* 동일성 비교. java에서 ==과 같음. 객체의 주소값 비교 */
    println(money3 === money4)  // true
    println(money3 === money5)  // false

    /* 동등성 비교. java에서 equals()와 같음. 객체의 값 비교 */
    println(money3 == money5)   // true
}
