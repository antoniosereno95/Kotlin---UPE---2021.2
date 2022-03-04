package Ficha_001_22_03_2022

fun main(){

    var string:String = readLine()!!.toString()

    var lista = string.split(" ")

    lista[0].replace(" ","")
    lista[1].replace(" ","")
    lista[2].replace(" ","")


    var A:Double = lista[0].toDouble()
    var B:Double = lista[1].toDouble()
    var C:Double = lista[2].toDouble()

    var maior12:Double = ( A + B + kotlin.math.abs(A-B) )/2.0

    var maior123:Double = ( maior12 + C + kotlin.math.abs(maior12-C) )/2.0

    var resp = maior123.toInt()

    println("$resp eh o maior")

}
