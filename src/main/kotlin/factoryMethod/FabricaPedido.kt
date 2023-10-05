package factoryMethod

abstract class FabricaPedido {
    abstract fun factoryMethod(): IPedido

    fun criarPedido(): String{
        val pedido = this.factoryMethod()
        return "Processando o ${pedido.processar()}"


    }
}