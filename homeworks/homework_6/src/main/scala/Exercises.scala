import scala.util.matching.Regex

object Exercises {


  def reverse[T](seq: Seq[T]): Seq[T] = seq.reverse;

  /**
   * https://ru.wikipedia.org/wiki/Числа_Фибоначчи
   *
   * @param idx number index (starts from 0)
   * @return fibonacci number
   */
  def fibonacci4Index(idx: Int): Int = idx match {
    case 0 | 1 => idx
    case _ => fibonacci4Index(idx -1) + fibonacci4Index(idx -2)
  }

  def fibonacci(idx: Int): Seq[Int] = {
    def fibs(a: Int = 0, b: Int = 1): Stream[Int] = Stream.cons(a, fibs(b, a+b))

    fibs() take idx + 1
  }

  lazy val MORSE = Map("A" -> ".-", "B" -> "-...", "C" -> "-.-.", "D" -> "-..", "E" -> ".", "F" -> "..-.",
    "G" -> "--.", "H" -> "....", "I" -> "..", "J" -> ".---", "K" -> "-.-", "L" -> ".-..",
    "M" -> "--", "N" -> "-.", "O" -> "---", "P" -> ".--.", "Q" -> "--.-", "R" -> ".-.",
    "S" -> "...", "T" -> "-", "U" -> "..-", "V" -> "...-", "W" -> ".--", "X" -> "-..-",
    "Y" -> "-.--", "Z" -> "--..")

  def morse(text: String): String =
    text.map(char => MORSE.getOrElse(char.toString.toUpperCase(), char.toString))
      .mkString(" ")
      .trim


  private val WordPattern: Regex = """\b\p{L}+\b""".r

  def wordReverse(text: String): String =
    WordPattern.replaceAllIn(text, word => reverseWithCapitalize(word.toString()))


  private def reverseWithCapitalize(word: String): String = word.head.isUpper match {
    case true => word.reverse.toLowerCase.capitalize
    case false => word.reverse
  }
}