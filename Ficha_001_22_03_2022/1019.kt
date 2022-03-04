package Ficha_001_22_03_2022

fun main(){

    var numb :Int = readLine()!!.toInt()

    var horas: Int = (numb/3600).toInt()

    numb = numb - horas*3600

    var minutos: Int = (numb/60).toInt()

    numb = numb - minutos*60

    var segundos: Int = numb

    println("$horas:$minutos:$segundos")

}