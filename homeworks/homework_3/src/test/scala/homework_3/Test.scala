package homework_3

import utest._

object Test extends TestSuite{

    val tests: Tests = Tests{
        def prettyBooleanFormatter(): Unit = {
            assert(Exercises.prettyBooleanFormatter1(true) == "правда")
            assert(Exercises.prettyBooleanFormatter1(10 > 4) == "правда")
            assert(Exercises.prettyBooleanFormatter1(false) == "ложь")
            assert(Exercises.prettyBooleanFormatter1(20 > 40) == "ложь")
            assert(Exercises.prettyBooleanFormatter1(1) == "1")
            assert(Exercises.prettyBooleanFormatter1(0.754) == "0.754")
            assert(Exercises.prettyBooleanFormatter1("string") == "string")
            assert(Exercises.prettyBooleanFormatter1(Seq(1, 2, 3, 4, 5)) == "List(1, 2, 3, 4, 5)")
            assert(Exercises.prettyBooleanFormatter1(Seq(1.2, 2.3, 3.4, 4.5, 5.6)) == "List(1.2, 2.3, 3.4, 4.5, 5.6)")
        }
        'test_prettyBooleanFormatter1 - {
            prettyBooleanFormatter()
        }
        'test_prettyBooleanFormatter2 - {
            prettyBooleanFormatter()
        }

        'test_prettyBooleanFormatter3 - {
            prettyBooleanFormatter()
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
            assert(Exercises.max3(Seq(20, 7, -19, 8, 0)) == Option(20))
            assert(Exercises.max3(Seq(0)) == Option(0))
            assert(Exercises.max3(Seq(-28, -59, 13, -5, -80)) == Option(13))
            assert(Exercises.max3(2 until 55) == Option(54))
            assert(Exercises.max3(2 to 55) == Option(55))
            assert(Exercises.max3(Nil).isEmpty)
            assert(Exercises.max3(Seq()).isEmpty)
            assert(Exercises.max3(0 until 0).isEmpty)
        }
    }
}
