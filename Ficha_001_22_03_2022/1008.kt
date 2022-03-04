package Ficha_001_22_03_2022

fun main(){

    val nome:String = readLine()!!.toString()
    val salario: Double = readLine()!!.toDouble()
    val comicao: Double = readLine()!!.toDouble()

    var final:Double = salario + (comicao*15.0/100.0)

    println("TOTAL = R\$ %.2f".format(final))

}