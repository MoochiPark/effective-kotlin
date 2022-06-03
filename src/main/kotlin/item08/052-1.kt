package item08

class Printer {
    val name: String? = "printer name"

    fun print() {
        println("print")
    }
}

fun getPrinter(): Printer? {
    return Printer()
}

fun main() {
    val printer: Printer? = getPrinter()
//    printer.print() // 컴파일 오류

    printer?.print() // 안전 호출
    if (printer != null) printer.print() // 스마트 캐스팅
    printer!!.print()  // non-null assertion

    val printerName1 = printer?.name ?: "Unnamed"
    val printerName2 = printer?.name ?: return
    val printerName3 = printer?.name ?: throw Error("Printer must be named")
}