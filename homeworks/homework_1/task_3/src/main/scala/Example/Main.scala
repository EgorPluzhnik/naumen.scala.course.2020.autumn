package Example

object Main extends App{
  def sayGreating(greating: String, name: String): Unit =
    println(s"$greating Scala! This is $name")

  val name = "Egor Pluzhnik"
  val greatings: List[String] = List("Hello", "Hola", "Guten tag")

  greatings.foreach( greating => sayGreating(greating, name))
  greatings.foreach( greating => sayGreating(greating ,name.reverse))
}
