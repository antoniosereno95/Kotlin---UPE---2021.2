package Ficha_001_22_03_2022

fun main(){

    var entrada:String = readLine()!!.toString()

    var lista = entrada.split(" ")

    val A:Double = lista[0].replace(" ","").toDouble()
    val B:Double = lista[1].replace(" ","").toDouble()
    val C:Double = lista[2].replace(" ","").toDouble()

    var delta:Double = B*B - 4.0*A*C

    if(delta < 0.0){
        println("Impossivel calcular")

    }else if(A == 0.0){
        println("Impossivel calcular")

    } else{

        var x1 = (-B + kotlin.math.sqrt(delta) )/2.0*A

        var x2 = (-B - kotlin.math.sqrt(delta) )/2.0*A

        println("R1 = %.5f".format(x1))
        println("R2 = %.5f".format(x2))

    }

}