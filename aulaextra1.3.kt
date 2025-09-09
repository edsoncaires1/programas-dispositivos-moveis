fun main() {
    val firstNumber = 10
    val secondNumber = 5
    val thirdNumber = 8
    
    val result = add(firstNumber, secondNumber)
    val anotherResult = add(firstNumber, thirdNumber)

    println("$firstNumber + $secondNumber = $result")
    println("$firstNumber + $thirdNumber = $anotherResult")
    
    val sub1 = subtract(firstNumber, secondNumber)
    val sub2 = subtract(firstNumber, thirdNumber)
    
     println("$firstNumber - $secondNumber = $sub1")
    println("$firstNumber - $thirdNumber = $sub2")
}

fun add (a:Int, b:Int) = a + b
fun subtract (a:Int, b:Int) = a - b
