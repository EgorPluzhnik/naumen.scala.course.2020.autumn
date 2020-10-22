package homework_3

import homework_3.Exercises.Container
import utest._

object Test extends TestSuite{

    val tests: Tests = Tests{

        def prettyBooleanFormatter(formatter: (Any) => String): Unit = {
            assert(formatter(true) == "правда")
            assert(formatter(10 > 4) == "правда")
            assert(formatter(false) == "ложь")
            assert(formatter(20 > 40) == "ложь")
            assert(formatter(1) == "1")
            assert(formatter(0.754) == "0.754")
            assert(formatter("string") == "string")
            assert(formatter(Seq(1, 2, 3, 4, 5)) == "List(1, 2, 3, 4, 5)")
            assert(formatter(Seq(1.2, 2.3, 3.4, 4.5, 5.6)) == "List(1.2, 2.3, 3.4, 4.5, 5.6)")
        }

        'test_prettyBooleanFormatter1 - {
            prettyBooleanFormatter(Exercises.prettyBooleanFormatter1)
        }
        'test_prettyBooleanFormatter2 - {
            prettyBooleanFormatter(Exercises.prettyBooleanFormatter2)
        }

        'test_prettyBooleanFormatter3 - {
            prettyBooleanFormatter(Exercises.prettyBooleanFormatter3)
        }

        'test_max1 - {
            assert(Exercises.max1(Seq(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)) == 10)
            assert(Exercises.max1(Seq(0)) == 0)
            assert(Exercises.max1(Seq(-28, -27, 0, -5, -10)) == 0)

            assert(
                try {
                    val result = Exercises.max1(Nil)
                    true
                } catch {
                    case ex: UnsupportedOperationException => true
                    case _ => false
                }
            )

            assert(Exercises.max1(Seq(12, 12, 12, 12)) == 12)
            assert(Exercises.max1(Seq(123)) == 123)
        }
        'test_max2 - {
            assert(Exercises.max2(Seq(20, 7, -19, 8, 0)) == Seq(20))
            assert(Exercises.max2(Seq(0)) == Seq(0))
            assert(Exercises.max2(Seq(-28, -59, 13, -5, -80)) == Seq(13))
            assert(Exercises.max2(2 until 55) == Seq(54))
            assert(Exercises.max2(2 to 55) == Seq(55))
            assert(Exercises.max2(Nil) == Nil)
            assert(Exercises.max2(Seq()) == Nil)
            assert(Exercises.max2(0 until 0) == Nil)
            assert(Exercises.max2(0 until 0) == Seq.empty)
        }

        'test_max3 - {
            assert(Exercises.max3(Seq(20, 7, -19, 8, 0)) == Some(20))
            assert(Exercises.max3(Seq(0)) == Some(0))
            assert(Exercises.max3(Seq(-28, -59, 13, -5, -80)) == Some(13))
            assert(Exercises.max3(2 until 55) == Some(54))
            assert(Exercises.max3(2 to 55) == Some(55))
            assert(Exercises.max3(Nil).isEmpty)
            assert(Exercises.max3(Seq()).isEmpty)
            assert(Exercises.max3(0 until 0).isEmpty)
        }

        def sum(sum: (Int, Int) => Int): Unit = {
            assert(sum(1, 6) == 7)
            assert(sum(0, 0) == 0)
            assert(sum(-5, 5) == 0)
            assert(sum(-10, -22) == -32)
            assert(sum(-1, 18) == 17)
            assert(sum(21, 0) == 21)
        }

        'test_sum1 - {
            sum(Exercises.sum1)
        }

        'test_sum2 - {
            sum(Exercises.sum2)
        }

        'test_sum3 - {
            sum(Exercises.sum3)
        }
    }
}
