package item05

class Person1(
    val outfit: Outfit
)

open class Outfit

class Dress : Outfit()


internal fun changeDress(person: Person1) {
    require(person.outfit is Dress)
    val dress: Dress = person.outfit
    // ...
}