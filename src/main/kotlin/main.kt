//В переменной likes хранится число лайков
var likes = 1211
var lastSymbol = likes.toString().last()

//В зависимости от того, что хранится в likes, приложение выводит вариант в консоль
fun main() {
    var twoLastSymbol = """0""";
    if (likes.toString().length > 1) {
        twoLastSymbol = likes.toString().substring(likes.toString().length - 2, likes.toString().length)
    }
    if (twoLastSymbol == "11") {
        println("Понравилось $likes людям!")
    } else if (lastSymbol == '1') {
        println("Понравилось $likes человеку!")
    } else {
        println("Понравилось $likes людям!")
    }
}