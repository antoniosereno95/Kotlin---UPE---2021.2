package Ficha_001_22_03_2022

fun main(){

    var entrada:String = readLine()!!.toString()
    var lista = entrada.split(" ")

    var x:Double = lista[0].replace(" ","").toDouble()
    var y:Double = lista[1].replace(" ","").toDouble()

    if(x == 0.0 && y == 0.0){
        println("Origem")
    }else if(x == 0.0 && y!=0.0){
        println("Eixo Y")
    }else if(x != 0.0 && y == 0.0){
        println("Eixo X")
    }else if(x > 0.0 && y > 0.0){
        println("Q1")
    }else if(x < 0.0 && y > 0.0){
        println("Q2")
    }else if(x < 0.0 && y < 0.0){
        println("Q3")
    }else if(x > 0.0 && y < 0.0){
        println("Q4")
    }

}