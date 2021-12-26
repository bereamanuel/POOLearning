package sooper

trait IContenedor {
  def getReferencia():String
  def getVolumen(): Int
  def volumenDisponible(): Int
  def getSuperficie():Int
  def getResistencia(): Int
  def getTipo(): String
  def getProductos():Set[Any]

  def meter(IProducto: Any):Boolean
  def resiste(IProducto: Any): Boolean

}
