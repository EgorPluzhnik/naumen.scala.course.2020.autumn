package homework_3

object Exercises {


  /**
   * Задание №1
   * Реализуйте функцию, которая принимает любой тип и преобразует его в строку.
   * Для всех типов кроме Boolean достаточно воспользоваться стандартной функцией .toString.
   * Для типа Boolean сделайте особое преобразование: true -> "правда", false -> "ложь".
   *
   * Реализуйте функцию тремя разными способами, отличающимися тем, как определяется какой тип имеет значение переданное в аргументе.
   * Определение типа необходимо для реализации специальной логики работы с Boolean значениями, которая описана в условии выше.
   */
  def prettyBooleanFormatter1(x: Any): String =
    if (x.isInstanceOf[Boolean]) {
      if(x.equals(true))
        "правда"
      else
        "ложь"
    } else
      x.toString



  def prettyBooleanFormatter2(x: Any): String = x.toString match {
      case "true" => "правда"
      case "false" => "ложь"
      case _ => x.toString
    }

    def prettyBooleanFormatter3(x: Any): String = {
      val translations = Map("true" -> "правда", "false" -> "ложь")

      translations.getOrElse(x.toString, x.toString)
    }


  /**
   * Задание №2
   * Реализуйте функцию нахождения максимального числа в переданной коллекции интов (можно использовать все методы стандартной библиотеки).
   *
   * Реализуйте функцию тремя разными способами, отличающимися тем как функция себя ведет на пустой коллекции.
   * Обратите внимание на возвращаемые типы.
   */
  def max1(xs: Seq[Int]): Int = ???

  def max2(xs: Seq[Int]): Seq[Int] = ???

  def max3(xs: Seq[Int]): Option[Int] = ???

  /**
   * Задание №3
   * Допустим дана функция sumIntegers, которая умеет суммировать числа.
   */
  def sumIntegers[CollectionType <: Iterable[Int]](xs: CollectionType): Int = xs.sum

  /**
   * Реализуйте на основе нее 3 варианта суммирования 2х чисел, отличающиеся способом передачи этих 2х чисел в функцию sumIntegers.
   * Как минимум одна из реализаций должна использовать тип данных (класс) написанный вами самостоятельно.
   */
  def sum1(x: Int, y: Int): Int = sumIntegers(???)
  def sum2(x: Int, y: Int): Int = sumIntegers(???)
  def sum3(x: Int, y: Int): Int = sumIntegers(???)

}
