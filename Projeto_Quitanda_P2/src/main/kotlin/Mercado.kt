

open class Mercado(nome:String, descricao:String, preço_unitario:Double ,
                   ehUmPacote:Boolean = false, unidades_por_pacote:Int = 0):Produtos(nome) {

    //---> essa classe e a classe coveniencia deveriam ser filhas de uma classe padrao
    var descricao:String = descricao
        set(nova_descricao){
            if(nova_descricao.equals(this)){
                println(">>Descriçao igual a ja existente.")
            }else{
                if(nova_descricao.length >= 3){
                    field = nova_descricao
                }
            }
        }

    var preço_unitario:Double = preço_unitario

    var ehUmPacote:Boolean = ehUmPacote

    var unidades_por_pacote:Int = unidades_por_pacote
        private set(quantidade_por_pacote){
            if(this.ehUmPacote == true){
                field = quantidade_por_pacote
            }else{
                println(">>Produto nao é vendido em pacote.")
            }
        }

    override fun Print(){
        println("Nome: "+this.nome)
        println("Descriçao: "+this.descricao)
        if(this.ehUmPacote){
            println("Vendido em Pacotes de "+this.unidades_por_pacote)
            var ppacote:Double = (this.preço_unitario * this.unidades_por_pacote)
            ppacote = ppacote - (10.0*ppacote/100.0)
            //aqui eu dou um desconto de 10% no pacote pra poder valer a pena o cliente adquirir o pacote.
            println("Preço do pacote: "+ppacote)
        }
        println("Preço Unitario: "+this.preço_unitario)
    }

}