package factoryMethod

fun client(creator: FabricaPedido): String{
    return creator.criarPedido()
}
fun main() {
    val pedido = client(FabricaPedidoFisico())
    println(pedido)
    val pedido2 = client(FabricaPedidoDigital())
    println(pedido2)


}
