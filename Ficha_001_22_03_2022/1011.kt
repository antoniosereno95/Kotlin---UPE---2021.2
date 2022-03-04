package Ficha_001_22_03_2022

fun main(){

    val pi: Double = 3.14159
    var raio:Double = readLine()!!.toDouble()

    var volume:Double = (4.0/3.0)*pi*(raio*raio*raio)

    println("VOLUME = %.3f".format(volume))
}