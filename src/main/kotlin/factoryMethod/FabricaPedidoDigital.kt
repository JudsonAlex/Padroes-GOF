package factoryMethod

class FabricaPedidoDigital: IFabricaPedido {
    override fun criarPedido(): IPedido {
        return PedidoProdutoDigital()
    }
}