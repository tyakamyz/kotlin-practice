package section03.s11_코틀린에서_접근_제어를_다루는_방법

/* 파일 최상단에 선언하면 static 메서드로 사용할 수 있도록 생성됨
* util 함수를 생성할 때 사용하면 편리함 */
fun isDirectoryPath(path: String): Boolean {
    return path.endsWith("/")
}
