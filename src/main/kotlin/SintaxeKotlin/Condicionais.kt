package SintaxeKotlin

fun main() {
    //chamada when statement
    cases("Hello")
    cases(1)
    cases(0L)
    cases(MyClass())
    cases("hello")

    //Expressão condicional
    codicionalExpression()




    val id: Int
    val verifica = true

    if (verifica){
        id = 1
    }else  {
        id = 2
    }

    // um if não precisa necessariamente de um else
    val a = 10
    val b = 5
    if (a > b){
        println("$a é maior que $b")
    }

    if (a > b){
        println("A é maior que B")
    }else{
        println("B é maior que A")
    }


    val senha = "123"
    if (senha == "123"){
        println("Acesso Concedido")
    }else {
        println("Senha incorreta")
    }

    println(id)

    val n1 = 10
    val n2 = 5

    println( if (n1 > n2){
        n1
    }else{
        n2
    })

    //====== if em uma unica linha============
    val maior = if (a > b) a else b
    println("If em uma linha: $maior")


    //========================WHEN===============================

    var obj = "Hello"

    when(obj){
        "1" -> println("One")
        "Hello" -> println("Greeting")
        else   -> println("Unknow")
    }

    obj = "1"

    val result = when(obj){
        "1" -> "One"
        "Hello" -> "Greeting"
        else -> "Unknow"
    }

    println(result)


    val temperatura = 18

    val descricao = when {
        temperatura < 0 -> "Muito Frio"
        temperatura < 10 -> "Um pouco fro"
        temperatura < 20 -> "Quente"
        else  -> "quente"
    }

    println(descricao)

    val x = 10
    when(x){
        in 1..10 -> println("x Está no intervalo")
        else -> println("X está fora do intervalo")
    }
}

//===============================WHEN STATEMENT ============================
fun cases(obj: Any){
    when(obj){
        1 -> println("One")
        "Hello" -> println("Greeting")
        is Long -> println("Long")
        !is String -> println("Not a String")
        else -> println("Unknown")
    }
}
class MyClass


fun codicionalExpression(){
    fun max(a: Int, b: Int) = if (a > b) a else b
    println(max(99, -43))
}