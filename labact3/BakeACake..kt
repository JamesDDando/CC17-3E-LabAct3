fun main() {
    val age = 24
    val layer = 5

    printCakeCandle(age)
    printCakeTop(age)
    printCakeBottom(age, layer)
}
fun printCakeCandle(age:Int){
    repeat(age){
        print(",")
    }
    println()
    repeat(age){
        print("|")
    }
    println()
}
fun printCakeTop(age:Int){
    repeat(age){
        print("=")
    }
    println()
}
fun printCakeBottom(age:Int, layer:Int){
    repeat(layer){
        repeat(age){
        print("@")
        }
        println()
    }
}
