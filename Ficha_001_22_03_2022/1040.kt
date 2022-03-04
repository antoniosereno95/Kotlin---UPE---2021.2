package Ficha_001_22_03_2022

fun main(){

    var entrada:String = readLine()!!.toString()
    var lista = entrada.split(" ")

    var nota1:Double = lista[0].replace(" ","").toDouble()
    var nota2:Double = lista[1].replace(" ","").toDouble()
    var nota3:Double = lista[2].replace(" ","").toDouble()
    var nota4:Double = lista[3].replace(" ","").toDouble()

    var media:Double = ( nota1*2.0 + nota2*3.0 + nota3*4.0 + nota4 )/10.0

    if(media >= 7.0){
        println("Media: %.1f\n".format(media) +
                "Aluno aprovado.")

    }else if(media < 5.0){
        println("Media: %.1f\n".format(media) +
                "Aluno reprovado.")

    }else{
        println("Media: %.1f\n".format(media) +
                "Aluno em exame.")

        print("Nota do exame: ")
        var exame:Double = readLine()!!.toDouble()

        var media2:Double = (exame + media)/2.0

        if(media2 >= 5.0){
            println("Aluno aprovado.")
        }else{
            println("Aluno reprovado.")
        }
        println("Media final: %.1f".format(media2))

    }

}