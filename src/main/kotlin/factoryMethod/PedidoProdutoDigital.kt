package factoryMethod

class PedidoProdutoDigital: IPedido {
    override fun processar() {
        println("Processando seu download")
    }
}