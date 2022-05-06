

class Enlatados(nome:String, descricao:String , preço_unitario:Double , volume_da_lata:Double)
    :Mercado(nome, descricao, preço_unitario) {

    var volume_da_lata:Double = volume_da_lata

    override fun Print(){
        println("Nome: "+this.nome)
        println("Descriçao: "+this.descricao)
        println("Volume por Lata: "+this.volume_da_lata)
        println("Preço Unitario: "+this.preço_unitario)
    }
}