fun main() {
    val age = 20 * 365
    val name = "Jay El"
    var border = "==%%"
    val timesToRepeat = 21
    printBorder(border, timesToRepeat)
    print("Happy Birthday! ${name} \n")
    printBorder(border, timesToRepeat)
    print("Hello Birthday! ${name} \n")
    print("I am ${age} days old! \n")
    print("${age} days old is the best age to learn Kotlin! \n")
    //Let's print cake!
    println("   ,,,,,   ")
    println("   |||||   ")
    println(" =========")
    println("@@@@@@@@@@@")
    println("{~@~@~@~@~}")
    println("@@@@@@@@@@@")
    println("")
    print("${name} is already ${age} days old! \n")
}
fun printBorder(border:String, timesToRepeat:Int){
    repeat(timesToRepeat){
        print(border)
    }
    println()
}
