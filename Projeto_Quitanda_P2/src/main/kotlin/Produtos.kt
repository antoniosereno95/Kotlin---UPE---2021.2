

open class Produtos (nome: String) {
    //Essa Classe vai ser a classe Pai/Mae de todos os produtos existentes na loja

    var nome: String = nome
        set(novo_nome){
            if(novo_nome.equals(this)){
                println(">>Novo nome igual ao ja existente.")
            }else{
                if(novo_nome.length >= 3){
                    field = novo_nome
                }
            }
        }

    open fun Print(){
        println("Nome do produto: "+this.nome)
    }

}