package Ficha_001_22_03_2022

fun main(){

    var lista:List<Int> = listOf(100,50,20,10,5,2,1)
    var valor:Int = readLine()!!.toInt()
    var valor_original = valor

    var nota100:Int = 0
    var nota50:Int = 0
    var nota20:Int = 0
    var nota10:Int = 0
    var nota5:Int = 0
    var nota2:Int = 0
    var nota1:Int = 0

    var i = 0
    do{
        while(valor%lista[i] == 0){
            if(i == 0){
                  nota100++
                  valor -= 100
              }
            if(i == 1){
                  nota50++
                  valor -= 50
              }
            if(i == 2){
                  nota20++
                  valor -= 20
              }
            if(i == 3){
                nota10++
                valor -= 10
              }
            if(i == 4){
                nota5++
                valor -= 5
            }
            if(i == 5){
                nota2++
                valor -= 2
            }
            if(i == 6){
                nota1++
                valor -= 1
            }
        }
        if(valor%lista[i] != 0){
            i++
        }

    }while(valor != 0)

    println("$valor_original\n" +
            "$nota100 nota(s) de R\$ 100,00\n" +
            "$nota50 nota(s) de R\$ 50,00\n" +
            "$nota20 nota(s) de R\$ 20,00\n" +
            "$nota10 nota(s) de R\$ 10,00\n" +
            "$nota5 nota(s) de R\$ 5,00\n" +
            "$nota2 nota(s) de R\$ 2,00\n" +
            "$nota1 nota(s) de R\$ 1,00")

}