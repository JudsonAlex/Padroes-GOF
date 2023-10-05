package factoryMethod

class PedidoProdutoDigital: IPedido {
    override fun processar(): String {
        return "seu download"
    }
}