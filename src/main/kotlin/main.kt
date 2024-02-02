//В переменной likes хранится число лайков
var likes = 51
var lastSymbol = likes.toString().last()

//В зависимости от того, что хранится в likes, приложение выводит вариант в консоль
fun main() {
    if (lastSymbol == '1') {
        println("Понравилось $likes человеку!")
    } else {
        println("Понравилось $likes людям!")
    }
}