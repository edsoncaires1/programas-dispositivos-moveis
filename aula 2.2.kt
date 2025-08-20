fun main() {
    val numbers = mutableListOf(1, 2, 3, 4, 5, 6)
    numbers.add(7)
    numbers.removeAt(0)
    numbers[0] = 10
    println(numbers)
}
