package factoryMethod

fun client(creator: FabricaPedido): String{
    return creator.criarPedido()
}
fun main() {
    val pedido = client(FabricaPedidoDigital())
    println(pedido)
    val pedido2 = client(FabricaPedidoLivro())
    println(pedido2)


}
