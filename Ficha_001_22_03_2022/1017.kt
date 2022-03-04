package Ficha_001_22_03_2022

fun main(){

    var tempo:Int = readLine()!!.toInt()
    var velocidade:Int = readLine()!!.toInt()

    var distancia:Double = (velocidade * tempo).toDouble()

    var litros:Double = distancia/12.0

    println("%.3f".format(litros))

}