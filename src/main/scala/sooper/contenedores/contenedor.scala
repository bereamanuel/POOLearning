package sooper.contenedores
import sooper.{IContenedor, IProducto}

abstract class contenedor extends IContenedor with IProducto{
  val referencia:String
  val alto:Int
  val resistencia:Int
  val tipo:String

  def getReferencia():String = {
    referencia
  }

  def getVolumen(): Int = {
    alto*getSuperficie()
  }

  def volumenDisponible(): Int = {
    //Falta
  }

  def getResistencia(): Int = {
    resistencia
  }

  def getTipo(): String = {
    tipo
  }

  def getProductos():Set[IProductos.Productos] = {
    Set[Any]
  }

  def meter(IProducto: Any):Boolean = {
    //Falta
    false
  }
  def resiste(IProducto: Any): Boolean = {
    //Falta
    false
  }

}
