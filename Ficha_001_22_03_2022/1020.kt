package Ficha_001_22_03_2022

fun main(){

    var entrada: Int = readLine()!!.toInt()

    var anos: Int = (entrada/365).toInt()

    entrada = entrada - anos*365

    var meses :Int = (entrada/30).toInt()

    entrada = entrada - meses*30

    var dias = entrada

    println("$anos ano(s)\n" +
            "$meses mes(es)\n" +
            "$dias dia(s)")

}