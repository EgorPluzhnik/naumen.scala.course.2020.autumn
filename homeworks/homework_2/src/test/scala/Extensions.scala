
object Extensions {

  implicit class EpsilonCompare(val number: Double) {

    def ~(sample: Double)(implicit epsilon: Double): Boolean = (number - sample).abs < epsilon
  }
}
