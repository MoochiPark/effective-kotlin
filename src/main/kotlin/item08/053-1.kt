package item08

class News {
}

fun getNews(): List<News>? = listOf(News())
fun notifyUser(news: News) = println("notify!")

fun main() {
    println("What is your name?")
    val name = readLine()
    if (!name.isNullOrBlank()) {
        println("Hello ${name.uppercase()}")
    }

    val news: List<News>? = getNews()
    if (!news.isNullOrEmpty()) {
        news.forEach {
            notifyUser(it)
        }
    }
}