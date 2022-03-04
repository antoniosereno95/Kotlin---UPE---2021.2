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

    var pi = 3.14159

    var Area_triangulo_retangulo:Double = (A*C)/2.0

    var Area_circulo:Double = pi*C*C

    var Area_trapezio:Double = (A+B)*C/2.0

    var Area_quadrado:Double = B*B

    var Area_retangulo:Double = A*B

    println("TRIANGULO: %.3f".format(Area_triangulo_retangulo))
    println("CIRCULO: %.3f".format(Area_circulo))
    println("TRAPEZIO: %.3f".format(Area_trapezio))
    println("QUADRADO: %.3f".format(Area_quadrado))
    print("RETANGULO: %.3f".format(Area_retangulo))

}