package Ficha_001_22_03_2022

fun main(){

    var nota1:Double = readLine()!!.toDouble()
    var nota2:Double = readLine()!!.toDouble()
    var nota3:Double = readLine()!!.toDouble()

    var media:Double = (2.0*nota1 + 3.0*nota2 + 5.0*nota3) / 10.0

    println("MEDIA = %.1f".format(media))

}