package factoryMethod

class PedidoProdutoFisico: IPedido {
    override fun processar() {
        println("Processando pedido fisico")
    }
}