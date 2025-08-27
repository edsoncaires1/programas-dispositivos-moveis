
fun main() {
    val sinalstatus = "Vermelho"
    
    val sinalaction = when (sinalstatus){
        "Verde" -> "Siga"
        "Amarelo" -> "Atenção"
        "Vermelho" -> "Pare"
        else -> "Mal funcionamento"
        
    }
   println(sinalaction)
}
