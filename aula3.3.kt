val usuariocadastrado = mutableListOf("edson_caires", "joao_souza")
val emailcadastrado = mutableListOf("edson@example.com", "joao@example.com")

fun registrousuario(username: String, email: String): String {
    if (username in usuariocadastrado) {
        return "Usuário já cadastrado, tente outro nome."
    }

    if (email in emailcadastrado) {
        return "E-mail já cadastrado, tente outro endereço."
    }

    usuariocadastrado.add(username)
    emailcadastrado.add(email)

    return "Usuário cadastrado com sucesso!"
}
