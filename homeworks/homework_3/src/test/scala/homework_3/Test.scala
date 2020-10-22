package homework_3

import utest._

object Test extends TestSuite{

    val tests: Tests = Tests{
        def prettyBooleanFormatter(): Unit = {
            assert(Exercises.prettyBooleanFormatter1(true) == "правда")
            assert(Exercises.prettyBooleanFormatter1(false) == "ложь")
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
    }
}
