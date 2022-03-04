package Ficha_001_22_03_2022

fun main(){

    var entrada:Double = readLine()!!.toDouble()

    if(entrada >= 0.00000 && entrada <= 25.00000){
        println("Intervalo [0,25]")

    }else if(entrada > 25.00000 && entrada <= 50.00000){
        println("Intervalo (25,50]")

    }else if(entrada > 50.00000 && entrada <= 75.00000){
        println("Intervalo (50,75]")

    }else if(entrada > 75.00000 && entrada <= 100.00000){
        println("Intervalo (75,100]")

    }else{
        println("Fora de intervalo")
    }

}