

open class Frutas(nome:String,valor_por_kilo:Double,valor_por_unidade:Double): Produtos(nome) {

    //PROFESSOR FALOU QUE O NOME DESA CLASSE DEVIA SER "Fruta"
    // E SE EVENTUALMENTE EU FIZER UMA COLEÇAO DE OBJETOS Fruta AI SIM O NOME DELA SERIA Frutas.

    //--> as classes frutas e verduras dveriam ser filhas(herdar) de uma classe padra que poderia se chamar vegetais ou algo do tipo

    var valor_por_kilo:Double = valor_por_kilo
            private set

    var valor_por_unidade:Double = valor_por_unidade

    override fun Print(){
        println("Nome: "+this.nome)
        println("Valor por Kilo: "+this.valor_por_kilo)
        println("Preço Unitario: "+this.valor_por_unidade)
    }
}