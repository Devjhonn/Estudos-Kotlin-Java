package SintaxeKotlin
fun main() {
    // Para criar lista de seomente leitura use p list ou listOf
    // Para criar uma lista mutavel use mutableList ou MutableListOf
    // Listas não precisamos declarar o tamanho antecipadamente, posso adicionar valores de acordo com a necessidade
    //Apenas leitura

    val listaLeitura = listOf("Marcos", "Maria", "Barbara")
    val formas = listOf("Triangulo", "Quadrado", "Circulo")
    //lista declarando o tipo deforma explicita
    val forma: MutableList<String> = mutableListOf("Triangulo", "Circulo")

    //Para obter o primeiro ou o ultimo item da lista, .first(), .last()

    println(formas.first())
    println(formas.last())

    //Obtendo numero de itens com .count
    println(forma.count())

    //verificando se um item está na lista in
    println("Quadrado" in formas)

    //Para adicionar ou remover um item ".add(), .remove()"
    forma.add("Retangulo")
    println(forma)
    forma.remove("Retangulo")
    println(forma)

    val apoiado = listOf("HTTP", "HTTPS", "FTP")
    val solicitado = "http"
    val isSupported = solicitado.uppercase() in apoiado


    println("Suporte para $solicitado: $isSupported")


  println("==========Funções: first, last, filter===============")

    val listaTeste = mutableListOf(1, 2, 3, 4)
    val primeiro = listaTeste.first() //retorna o primeiro valor da lista
    println("O primeiro valor da lista é: $primeiro")
    val ultimo = listaTeste.last() // Retorna o ultimo valor da lista
    println("O ultimo valor da lists é : $ultimo")
    val filtroNumerosPares = listaTeste.filter { it % 2 == 0 }// Filter aplica um filtro especifico na lista(Ex: obter os numeros pares)
    println("Os valores pares da lista: $filtroNumerosPares")

}