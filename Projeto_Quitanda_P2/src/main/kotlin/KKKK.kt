fun main(){

    var lista_de_produtos: MutableList<Produtos> = mutableListOf() //essa lista de produtos vai segurar todos os produtos vendidos na loja

    var f1 = Frutas("coco",1.2,3.0)
    lista_de_produtos.add(f1)
    val produto1: Produtos = Produtos("Teste produto 1")
    lista_de_produtos.add(produto1)
    val produto2: Produtos = Produtos("Teste produto 2")
    lista_de_produtos.add(produto2)

    Catalogo_Generico(lista_de_produtos, Frutas)

}

