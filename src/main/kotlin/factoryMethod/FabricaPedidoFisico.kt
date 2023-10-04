package factoryMethod

class FabricaPedidoFisico : IFabricaPedido {
    override fun criarPedido() : IPedido {
        return PedidoProdutoFisico()
    }
}