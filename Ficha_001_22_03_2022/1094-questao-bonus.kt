package Ficha_001_22_03_2022

fun main(){
    //variaveis essenciais
    var coelho:Double =0.0
    var rato:Double =0.0
    var sapo:Double =0.0
    var total_cobaias:Double =0.0

    var numero_casos:Int = readLine()!!.toInt()

    //variaveis de entrada
    var entrada:String?
    var letra:String?
    var numero:Double?


    var contador:Int = 1
    while(contador <= numero_casos){
        //println(contador)

        entrada = readLine()!!.toString()
        var lista  = entrada.split(" ")
       // println(lista)

        letra = lista[1].replace(" ","").toString()
        //println(letra)
        numero = lista[0].replace(" ","").toDouble()
        //println(numero)

        total_cobaias = total_cobaias + numero

        when{
            letra.equals("C") -> coelho = coelho + numero
            letra.equals("S") -> sapo = sapo + numero
            letra.equals("R") -> rato = rato + numero
        }

        //println("coelho:$coelho -- sapo:$sapo -- rato:$rato")
        letra = ""
        numero = 0.0

        contador = contador + 1
    }

   // println("saio do loop legal ")

    //porcentagem
    var por_coelho:Double = (coelho*100.0)/total_cobaias
    //println(por_coelho)
    var por_sapo:Double = (sapo*100.0)/total_cobaias
    //println(por_sapo)
    var por_rato:Double = (rato*100.0)/total_cobaias
    //println(por_rato)


    //println("o problema esta no print")
    //prints
        println("Total: %.0f cobaias".format(total_cobaias))
        println("Total de coelhos: %.0f".format(coelho))
        println("Total de ratos: %.0f".format(rato))
        println("Total de sapos: %.0f".format(sapo))
        println("Percentual de coelhos: %.2f".format(por_coelho)+" %")
        println("Percentual de ratos: %.2f".format(por_rato)+" %")
        println("Percentual de sapos: %.2f".format(por_sapo)+" %")


}