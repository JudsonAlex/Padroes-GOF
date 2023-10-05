package factoryMethod

class FabricaPedidoDigital: FabricaPedido() {
    override fun factoryMethod(): IPedido {
        return PedidoProdutoDigital()
    }
}