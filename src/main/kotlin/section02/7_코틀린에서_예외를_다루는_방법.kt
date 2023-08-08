package section02

import java.io.BufferedReader
import java.io.FileReader

private fun parseIntOrThrow(str: String): Int {
    try {
        return str.toInt()
    } catch (e: NumberFormatException) {
        throw IllegalArgumentException("주어진 ${str}는 숫자가 아닙니다")
    }
}

/* try-catch 역시 Expression이기 때문에 바로 리턴이 가능 */
private fun parseIntOrThrowV2(str: String): Int? {
    return try {
        str.toInt()
    } catch (e: NumberFormatException) {
        null
    }
}

/* 코틀린에서는 try-with-resources 구문이 따로 존재하지 않음
* 대신 .use를 통해 구현이 가능하다 */
fun readFile(path: String) {
    BufferedReader(FileReader(path)).use { reader ->
        println(reader.readLine())
    }
}
