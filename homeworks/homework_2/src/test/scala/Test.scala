import utest._
import Extensions.EpsilonCompare

object Test extends TestSuite{

    val tests: Tests = Tests{
        'test_divBy3Or7 - {
            assert(Exercises.divBy3Or7(1, 3) == Seq(3))
            assert(Exercises.divBy3Or7(5, 9) == Seq(6, 7, 9))
            assert(Exercises.divBy3Or7(0, 100) == Seq(0, 3, 6, 7, 9, 12, 14, 15, 18, 21, 24, 27, 28, 30, 33, 35, 36, 39, 42, 45, 48, 49, 51, 54, 56, 57, 60, 63, 66, 69, 70, 72, 75, 77, 78, 81, 84, 87, 90, 91, 93, 96, 98, 99))
        }

        'test_sumOfDivBy3Or5 - {
            assert(Exercises.sumOfDivBy3Or5(1, 3) == 3)
            assert(Exercises.sumOfDivBy3Or5(5, 10) == 30)
            assert(Exercises.sumOfDivBy3Or5(0, 999) == 233168)
            assert(Exercises.sumOfDivBy3Or5(-3, 3) == 0)
            assert(Exercises.sumOfDivBy3Or5(0, 10) == 33)
            assert(Exercises.sumOfDivBy3Or5(-5, 10) == 25)
            assert(Exercises.sumOfDivBy3Or5(0, 0) == 0)
            assert(Exercises.sumOfDivBy3Or5(-10, 0) == -33)
        }

        'test_primeFactor - {
            assert(Exercises.primeFactor(80) == Seq(2, 5))
            assert(Exercises.primeFactor(98) == Seq(2, 7))
            assert(Exercises.primeFactor(128) == Seq(2))
            assert(Exercises.primeFactor(19) == Seq(19))
            assert(Exercises.primeFactor(21) == Seq(3, 7))
            assert(Exercises.primeFactor(24) == Seq(2, 3))
            assert(Exercises.primeFactor(1000000) == Seq(2, 5))
            assert(Exercises.primeFactor(999) == Seq(3, 37))
            assert(Exercises.primeFactor(12356) == Seq(2, 3089))
            assert(Exercises.primeFactor(-22) == Seq(-11, 2))
            assert(Exercises.primeFactor(-442) == Seq(-17, 2, 13))
            assert(Exercises.primeFactor(-13) == Seq(-13))
            assert(Exercises.primeFactor(0) == Seq(0))
            assert(Exercises.primeFactor(1) == Seq(1))
            assert(Exercises.primeFactor(-1) == Seq(-1))
        }

        'test_sumScalars - {
            assert(Exercises.sumScalars(Exercises.Vector2D(1, 1),
                                        Exercises.Vector2D(1, 1),
                                        Exercises.Vector2D(2, 2),
                                        Exercises.Vector2D(2, 2)) == 10)

            assert(Exercises.sumScalars(Exercises.Vector2D(3, 2),
                                        Exercises.Vector2D(2, 4),
                                        Exercises.Vector2D(1, 2),
                                        Exercises.Vector2D(5, 2)) == 23)

            assert(Exercises.sumScalars(Exercises.Vector2D(1, -2),
                                        Exercises.Vector2D(1, 5),
                                        Exercises.Vector2D(0, 0),
                                        Exercises.Vector2D(1, 6)) == -9)

            assert(Exercises.sumScalars(Exercises.Vector2D(-3, -2),
                                        Exercises.Vector2D(-5, 5),
                                        Exercises.Vector2D(0, 2),
                                        Exercises.Vector2D(1, 6)) == 17)

            assert(Exercises.sumScalars(Exercises.Vector2D(7, 9),
                                        Exercises.Vector2D(-1, 1),
                                        Exercises.Vector2D(1, 2),
                                        Exercises.Vector2D(3, 2)) == 9)

            assert(Exercises.sumScalars(Exercises.Vector2D(0, 0),
                                        Exercises.Vector2D(0, 0),
                                        Exercises.Vector2D(0, 0),
                                        Exercises.Vector2D(0, 0)) == 0)
        }

        'test_sumCosines - {
            assert(Exercises.sumCosines(Exercises.Vector2D(0, 0),
                                        Exercises.Vector2D(0, 0),
                                        Exercises.Vector2D(0, 0),
                                        Exercises.Vector2D(0, 0)) isNaN)

            assert(Exercises.sumCosines(Exercises.Vector2D(1, 2),
                                        Exercises.Vector2D(1, 2),
                                        Exercises.Vector2D(1, 0),
                                        Exercises.Vector2D(0, 1)) == 1)

            assert(Exercises.sumCosines(Exercises.Vector2D(2, 2),
                                        Exercises.Vector2D(3, 3),
                                        Exercises.Vector2D(-2, 0),
                                        Exercises.Vector2D(1, 0)) == 0)

            implicit val epsilon: Double = 0.0001;
            assert(Exercises.sumCosines(Exercises.Vector2D(3, 5),
                                        Exercises.Vector2D(3, 2),
                                        Exercises.Vector2D(20, 9),
                                        Exercises.Vector2D(9, 0)) ~ 1.81565)

            assert(Exercises.sumCosines(Exercises.Vector2D(6, 3),
                                        Exercises.Vector2D(12, -4),
                                        Exercises.Vector2D(-2, -1),
                                        Exercises.Vector2D(9, 0)) ~ -0.18732)

            assert(Exercises.sumCosines(Exercises.Vector2D(2, 3),
                                        Exercises.Vector2D(3, 5),
                                        Exercises.Vector2D(-2, -8),
                                        Exercises.Vector2D(1, 4)) ~ -0.00113)
        }

        'test_sortByHeavyweight - {
            assert(Exercises.sortByHeavyweight(Exercises.balls.slice(5, 10)) == Seq("Gold", "Chrome", "Lithium", "Potassium", "Graphite"))
            assert(Exercises.sortByHeavyweight(Exercises.balls.take(5)) == Seq("Nickel", "Tungsten", "Plutonium", "Cobalt", "Magnesium" ))

            assert(Exercises.sortByHeavyweight(Exercises.balls) == Seq("Tin", "Platinum", "Nickel", "Aluminum", "Titanium", "Lead", "Sodium",
                "Uranium", "Gold", "Tungsten", "Zirconium", "Chrome", "Iron", "Copper", "Silver", "Plutonium", "Cobalt", "Cesium", "Calcium",
                "Lithium", "Magnesium", "Potassium", "Graphite" ))
        }
    }
}
