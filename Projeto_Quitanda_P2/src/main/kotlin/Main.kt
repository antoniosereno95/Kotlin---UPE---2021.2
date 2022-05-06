fun main() {
    println("Bem vindo a QUITANDA!")

    var lista_de_produtos: MutableList<Produtos> = mutableListOf() //essa lista de produtos vai segurar todos os produtos vendidos na loja

    //fazer uma lista de produtos aqui so pra testar codigo
    val produto1: Produtos = Produtos("Teste produto 1")
    lista_de_produtos.add(produto1)
    val produto2: Produtos = Produtos("Teste produto 2")
    lista_de_produtos.add(produto2)
    //-------

    //loop principal
    while(true){

        Menu_Principal()
        //direcionamento do menu principal
        val lista_de_numeros:List<Int> = listOf(1,2,3,4,5,6)
        print("Digite o numero da Opçao escolhida: ")
        var entrada1:Int = readLine()!!.toInt()
        while(entrada1 !in lista_de_numeros){
            print("Digite uma entrada valida[1,2,3,4,5,6]: ")
            entrada1 = readLine()!!.toInt()
        }
            if(entrada1 == 1){
                Menu_da_opçao_catalogo_de_produtos()
                val lista_de_numeros2:List<Int> = listOf(1,2,3,4,5,6,7)
                print("Digite o numero da Opçao escolhida: ")
                var entrada:Int = readLine()!!.toInt()
                while(entrada !in lista_de_numeros2){
                    print("Digite uma entrada valida[1,2,3,4,5,6,7]: ")
                    entrada = readLine()!!.toInt()
                }

                if(entrada == 1){
                    catalogo_Generico<Coveniencia>(lista_de_produtos)
                }else if(entrada == 2){
                    catalogo_Generico<Enlatados>(lista_de_produtos)
                }else if(entrada == 3){
                    catalogo_Generico<Frutas>(lista_de_produtos)
                }else if(entrada == 4){
                    catalogo_Generico<Mercado>(lista_de_produtos)
                }else if(entrada == 5){
                    catalogo_Generico<Verduras>(lista_de_produtos)
                }else if(entrada == 6){
                    catalogo_Generico<Produtos>(lista_de_produtos)
                }else if(entrada == 7){
                    println("Voltando para o Menu Principal.")
                }


            }else if(entrada1 == 2){
                Buscar_produto_por_nome()
            }else if(entrada1 == 3){
                Fazer_login_em_conta_existente()
            }else if(entrada1 == 4){
                Cadastro_novo_cliente()
            }else if(entrada1 == 5){
                Menu_Area_dos_Funcionarios()
            }else if(entrada1 == 6){
                println("Deseja realmente encerrar o programa?")
                var resp:String = readLine()!!.toString()
                resp.uppercase()
                while(!resp.equals("S") || !resp.equals("N")){

                }
            }


        break
    }

}


fun Separador_de_menus(){
    println()
    println("~~~".repeat(30))
}


fun Menu_Principal(){
    Separador_de_menus()
    println("-- Menu Principal --")
    println("1. Ver catalogo de produtos.")
    println("2. Buscar produto por Nome.")
    println("3. Fazer login em conta Existente.")
    println("4. Cadastro de novo Cliente.")
    println("5. Area de funcionarios do Quitanda.")
    println("6. Encerrar o Programa.")
}

fun Menu_da_opçao_catalogo_de_produtos(){
    Separador_de_menus()
    println("-- Menu do Catalogo de Produtos --")
    println("Deseja ver uma sessao de produtos em especifico ou todos? ")
    println("1. ver o catalogo da sessao de Coveniencia.")
    println("2. ver o catalogo da sessao de Enlatados.")
    println("3. ver o catalogo da sessao de Frutas.")
    println("4. ver o catalogo da sessao de Mercado.")
    println("5. ver o catalogo da sessao de Verduras.")
    println("6. ver o catalogo contendo TODOS OS PRODUTOS DISPONIVEIS.")
    println("7. voltar ao Menu Principal. ")
}

inline fun<reified T> catalogo_Generico(lista: MutableList<Produtos>){

    println("\n--- Catalogo de Produtos ----")
    var i:Int = 1
    for(item in lista ){
        if(item is T){
            println("--- "+i+" ---")
            println("Nome: "+item.nome)
            i++
        }
    }

}


//-->> TODOS OS CATALOGOS SE TORNARAM OBSOLETOS COM A FUNÇAO GENERICA =)

//fun Catalogo_de_Produtos(lista: MutableList<Produtos>){
//
//    println("\n--- Catalogo de Produtos ----")
//    var i:Int = 1
//    for(item in lista ){
//        println("--- "+i+" ---")
//        println("Nome: "+item.nome)
////        if(item is <Coveniencia>){
////            item.Print_das_Coveniencias()
////        }
//        //pergunta: como comparar o objeto do tipo item que esta na lista de objetos do
//        // tipo Produto(pai de Conveniencia) para poder direcionar o objeto item para a
//        // funcao Print da sua Classe.
//
//        i++
//    }
//
//}

//fun Catalogo_de_Conveniencia(lista: MutableList<Produtos>){
//    println("\n--- Catalogo de Produtos de Conveniencia ----")
//    var i:Int = 1
//    for(item in lista ){
//        if(item is Coveniencia){
//            println("--- "+i+" ---")
//            item.Print()
//            i++
//        }
//    }
//}
//fun Catalogo_de_Enlatados(lista: MutableList<Produtos>){
//    println("\n--- Catalogo de Produtos de Enlatados ----")
//    var i:Int = 1
//    for(item in lista ){
//        if(item is Enlatados){
//            println("--- "+i+" ---")
//            item.Print()
//            i++
//        }
//    }
//}
//fun Catalogo_de_Frutas(lista: MutableList<Produtos>){
//    println("\n--- Catalogo de Produtos de Frutas ----")
//    var i:Int = 1
//    for(item in lista ){
//        if(item is Frutas) {
//            println("--- " + i + " ---")
//            item.Print()
//            i++
//        }
//    }
//}
//fun Catalogo_de_Mercado(lista: MutableList<Produtos>){
//    println("\n--- Catalogo de Produtos de Mercado ----")
//    var i:Int = 1
//    for(item in lista ){
//        if(item is Mercado) {
//            println("--- " + i + " ---")
//            item.Print()
//            i++
//        }
//    }
//}
//fun Catalogo_de_Verdutas(lista: MutableList<Produtos>){
//    println("\n--- Catalogo de Produtos de Verduras ----")
//    var i:Int = 1
//    for(item in lista ){
//        if(item is Verduras) {
//            println("--- " + i + " ---")
//            item.Print()
//            i++
//        }
//    }
//}

//-->> TODOS OS CATALOGOS SE TORNARAM OBSOLETOS COM A FUNÇAO GENERICA =)

fun Buscar_produto_por_nome(){

}


//####################
fun Fazer_login_em_conta_existente(){

}
fun Cadastro_novo_cliente(){

}


//####################
fun Menu_Area_dos_Funcionarios(){
    println("-- Menu Area dos Funcionarios --")
    println("1. Login.") //sem um login feito o funcionario nao pode entrar no menu de modificaçoes de catalogo/arquivos
    println("2. Cadastro de Novo Funcionario.")
}
fun Login_Area_dos_Funcionarios(){
    //aqui o funcionario faz o login, eu confiro se nos arquivos existe as credenciais dele
    // e deixo ele ter acesso ao menu de modificaçoes, se o login for autorizado.
    //tranfere pro Menu_de_Acoes_de_Funcionario()

}
fun Menu_de_Acoes_de_Funcionario(){

}