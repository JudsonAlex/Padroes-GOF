package factoryMethod

class PedidoProdutoLivro: IPedido {
    override fun processar(): String {
        return "seu livro"
    }
}