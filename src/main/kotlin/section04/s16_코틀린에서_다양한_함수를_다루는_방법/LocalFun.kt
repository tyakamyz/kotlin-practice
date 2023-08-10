package section04.s16_코틀린에서_다양한_함수를_다루는_방법

import com.lannstark.lec16.Person

/*fun createPerson(firstName: String, lastName: String): Person {
    if (firstName.isEmpty()) {
        throw IllegalArgumentException("firstName 값이 비어있습니다. 현재 값: ${firstName}")
    }

    if (lastName.isEmpty()) {
        throw IllegalArgumentException("lastName 값이 비어있습니다.  현재 값: ${lastName}")
    }

    return Person(firstName, lastName, 1)
}*/

fun createPerson(firstName: String, lastName: String): Person {
    fun validateName(name: String, fieldName: String) {
        if (name.isEmpty()) {
            throw IllegalArgumentException("${fieldName} 값이 비어있습니다. 현재 값: ${name}")
        }
    }

    validateName(firstName, "firstName")
    validateName(lastName, "lastName")

    return Person(firstName, lastName, 1)
}
