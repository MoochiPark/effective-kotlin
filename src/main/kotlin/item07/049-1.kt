package item07

//import item05.Person
//
//inline fun <reified T> String.readObjectOrNull(): T? {
//    // ...
//    if (incorrectSign) {
//        return null
//    }
//
//    return result
//}
//
//inline fun <reified T> String.readObject(): Result {
//    // ...
//    if (incorrectSign) {
//        return Failure(JsonParsingException())
//    }
//    // ...
//    return Success(result)
//}
//
//
//sealed class Result<out T>
//class Success<out T>(val result: T) : Result<T>()
//class Failure(val throwable: Throwable): Result<Nothing>()
//
//class JsonParsingException: Exception()
//
//const val userText = ""
//
//val age = userText.readObjectOrNull<Person>()?.age ?: -1
//
//val person = userText.readObject<Person>()
//val age = when(person) {
//    is Success -> person.age
//    is Failure -> -1
//}