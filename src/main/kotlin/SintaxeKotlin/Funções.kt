package SintaxeKotlin

fun main() {
    endereco("Marcos", 27, "São luis")
    println(media(10f, 5f))
}

fun endereco(nome: String, idade: Int, estado: String){
    return println("$nome, tem $idade anos, e mora em $estado ")
}

//N parametros, usamos vararg para passar quantos paramentros que quisermos

fun media(vararg notas: Float):Float{
    var soma = 0f

    for (n in notas){
        soma += n
    }
    return (soma / notas.size)
}