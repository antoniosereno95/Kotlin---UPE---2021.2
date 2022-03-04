package Ficha_001_22_03_2022


fun main(){

    val n = 3.14159

    var raio:Double = readLine()!!.toDouble()

    val area:Double

    area = n * (raio * raio)

    print("A=%.4f".format(area))


}