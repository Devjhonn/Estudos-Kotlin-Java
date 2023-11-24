package SintaxeKotlin.Orientação_a_Objetos

class main {
    companion object{
        @JvmStatic
        fun main(args: Array<String>) {
            val fernando = Pessoa("Fernando", 29, "123456785")

            println(fernando.cpf)
        }
    }
}


