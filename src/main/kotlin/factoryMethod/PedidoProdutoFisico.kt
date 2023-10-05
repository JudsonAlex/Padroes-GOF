package factoryMethod

class PedidoProdutoFisico: IPedido {
    override fun processar(): String {
        return "pedido fisico"
    }
}