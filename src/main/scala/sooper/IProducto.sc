trait IProducto{
  def getReferencia():String
  def getPeso():Int
  def getVolumen():Int
  def getCategoria():String

  def esCompatible(IProducto: IProducto):Boolean

  def tengoEspacio(IContenedor: IContenedor): Boolean
}