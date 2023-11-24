package SintaxeKotlin

fun main() {
    lacoWhile()
}

fun lacoFor(){
    val cakes = listOf("carrot", "Cheese", "Chocolate")

    for (cake in cakes){
        println("Yummy, it's a $cake cake!")
    }
}

fun eatCake() = println("Eat a Cake")
fun bakeACake()= println("Bake a Cake")

fun lacoWhile(){
    var cakesEaten = 0
    var cakesBaked = 0

    while (cakesEaten < 5){
        eatCake()
        cakesEaten++
    }

    do{
        bakeACake()
        cakesBaked++
    }while (cakesBaked < cakesEaten)

    //do While calculando quando ana passara paula em patrimonio
    val salario = 10000f
    var patAna = 0f
    var patPaula = 0f
    var mes = 0


    do {
        patAna += (salario * 0.05f) + (salario * 0.05f) + (patAna * 0.002f)
        patPaula += (salario * 0.05f) + (patPaula * 0.008f)
        mes ++

        println("Pat Ana - $patAna -------- pat Paula - $patPaula")
    }while (patAna > patPaula)
    println("Ana - ${patAna * 0.002f}")
    println("Paula - ${patPaula * 0.008f}")
    println("Paula vai passar o patrimonio de Ana no mês $mes")


}