package Alura_BitBank

fun main(){
    println("Bem vindo ao ByteBank!")

    for(i in 1..3) {
        val titular: String = "Antonio $i"
        val numeroDaConta: Int = 1000 + i
        var saldoDaConta: Double = i + 10.0

        println("Nome do titular: $titular")
        //ou tambem pode-se escrever a mesma linha assim:
        //println("Nome do titular: " + titular)
        //mas note a linha verde embaixo da linha, é o intelij dizendo que eu posso escrever
        // a mesma linha de forma mais elegante, tal forma é exatamente a forma demonstrada na
        // primeira tentativa de escrever a linha

        println("Numero da conta: $numeroDaConta")
        println("Saldo bancario: $saldoDaConta")
        println()
    }


//    Teste_Condicional_SaldoDaConta(saldoDaConta)


}

fun Teste_Condicional_SaldoDaConta(saldoDaConta:Double){

    if(saldoDaConta > 0.0){
        println("O saldo da conta é positivo igual a $saldoDaConta")
    }else if(saldoDaConta == 0.0){
        println("O saldo da ocnta é igual a ZERO")
    }else{
        println("O saldo da conta é NEGATIVO e igual a $saldoDaConta")
    }

    //Agora, a memsa estrutura so que com o WHEN
    println("resposta da estrutura de condiçao WHEN: ")
    when{
        saldoDaConta > 0.0 -> println("O saldo da conta é positivo igual a $saldoDaConta")
        saldoDaConta == 0.0 -> println("O saldo da ocnta é igual a ZERO")
        else -> println("O saldo da conta é NEGATIVO e igual a $saldoDaConta")
    }

}