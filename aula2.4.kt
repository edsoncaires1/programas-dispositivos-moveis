fun main() {
 
    val Fruits: MutableSet<String> = mutableSetOf("Kiwi", "Limão", "Cereja", "Cereja", "Laranja")
    println(Fruits)
    
    Fruits.add("Maçã")
    println("Essa lista possui ${Fruits.count()} itens")
}
