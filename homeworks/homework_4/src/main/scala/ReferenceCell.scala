
class ReferenceCell(ix: Int, iy: Int, val table: Table) extends Cell {

  override def toString: String = {
    val referenceOn = table.getCell(ix, iy)

    referenceOn match {
      case None => "outOfRange"
      case Some (cell: ReferenceCell) => if (isCyclicRef(cell)) "cyclic"
                                         else referenceOn.get.toString

      case _ => referenceOn.get.toString
    }
  }

  private def isCyclicRef(cell: ReferenceCell): Boolean =
    cell.getCellByRef == this;

  private def getCellByRef: Cell = {
    table.getCell(ix, iy).get
  }
}
