class Contatos(val id: Int, var email: String)

fun main(){
    
    val contato = Contatos(1, "ed@example.com")
    
    println(contato.email)
    
    contato.email = "edson@example.com"
    
    println(contato.email)
}
