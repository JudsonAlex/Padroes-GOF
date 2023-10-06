package factoryMethod

class FabricaPedidoLivro: FabricaPedido() {
    override fun factoryMethod(): IPedido {
        return PedidoProdutoLivro()
    }
}