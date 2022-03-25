package item04

open class Car
class Fiat126P : Car()

val DEFAULT_CAR = Fiat126P()

interface CarFactory {
    fun produce() = DEFAULT_CAR
}