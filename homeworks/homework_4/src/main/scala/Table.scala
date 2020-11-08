import scala.collection.mutable


class Table(val width: Int, val height: Int){
  private val data = new mutable.MutableList[Cell] ++=
    List.fill(width*height)(new EmptyCell)

  def setCell(ix: Int, iy: Int, cell: Cell): Unit = {
    if(outOfBounds(ix, iy))
      throw new IndexOutOfBoundsException
    else
      data.update(ix + height*iy, cell)
  }

  def getCell(ix: Int, iy: Int): Option[Cell] = {
    if(outOfBounds(ix, iy))
      None
    else
      Option(data(ix + height*iy))
  }

   private def outOfBounds(ix:Int, iy: Int): Boolean
    = (ix < 0 || ix >= width || iy < 0 || iy >= height)
}