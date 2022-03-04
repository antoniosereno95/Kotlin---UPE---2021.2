package Ficha_001_22_03_2022

fun main(){

    var ponto1:String = readLine()!!.toString()
    var ponto2:String = readLine()!!.toString()

    var lista = ponto1.split(" ")
    lista[0].replace(" ","")
    lista[1].replace(" ","")
    var A:Double = lista[0].toDouble()
    var B:Double = lista[1].toDouble()

    var lista2 = ponto2.split(" ")
    lista2[0].replace(" ","")
    lista2[1].replace(" ","")
    var C:Double = lista2[0].toDouble()
    var D:Double = lista2[1].toDouble()

    var distancia = kotlin.math.sqrt( ((A-C)*(A-C)) + ((D-B)*(D-B)) )

    println("%.4f".format(distancia))

}