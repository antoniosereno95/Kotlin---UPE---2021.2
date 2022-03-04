package Ficha_001_22_03_2022

fun main(){

    val valor_original:Int = readLine()!!.toInt()
    println("$valor_original")
    var valor = valor_original

    while(valor != 0) {
        var nota100: Int = 0
        if (valor % 100 == 0) {
            nota100++
            valor = valor - 100
        }
        println("$nota100 nota(s) de R\$ 100,00")

        var nota50: Int = 0
        if (valor % 50 == 0) {
            nota50++
            valor = valor - 50
        }
        println("$nota50 nota(s) de R\$ 50,00")

        var nota20: Int = 0
        if (valor % 20 == 0) {
            nota20++
            valor = valor - 20
        }
        println("$nota20 nota(s) de R\$ 20,00")

        var nota10: Int = 0
        if (valor % 10 == 0) {
            nota10++
            valor = valor - 10
        }
        println("$nota10 nota(s) de R\$ 10,00")

        var nota5: Int = 0
        if (valor % 5 == 0) {
            nota5++
            valor = valor - 5
        }
        println("$nota5 nota(s) de R\$ 5,00")

        var nota2: Int = 0
        if (valor % 2 == 0) {
            nota2++
            valor = valor - 2
        }
        println("$nota2 nota(s) de R\$ 2,00")

        var nota1: Int = 0
        if (valor % 1 == 0) {
            nota1++
            valor = valor - 1
        }
        print("$nota1 nota(s) de R\$ 1,00")
    }

}