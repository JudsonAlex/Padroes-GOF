package factoryMethod

fun main() {
    val fabrica = FabricaPedidoDigital()
    val pedido = fabrica.criarPedido()
    pedido.processar()
}