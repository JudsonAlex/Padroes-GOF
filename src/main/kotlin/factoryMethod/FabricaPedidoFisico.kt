package factoryMethod

class FabricaPedidoFisico: FabricaPedido() {
    override fun factoryMethod(): IPedido {
        return PedidoProdutoFisico()
    }
}