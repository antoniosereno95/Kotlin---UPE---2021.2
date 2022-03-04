package Ficha_001_22_03_2022

fun main(){

    var distancia:Double = readLine()!!.toDouble()
    var litros:Double = readLine()!!.toDouble()

    var consumo = distancia / litros

    println("%.3f km/l".format(consumo))

}