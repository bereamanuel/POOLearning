

trait IPedido {
  def getReferencia(): String
  def getProducto(): Set[Any]
  def getContenedor(): Set[Any]
  def addContenedor(IContenedor: Any):Unit
  def addProducto(IContenedor: Any):Unit
}