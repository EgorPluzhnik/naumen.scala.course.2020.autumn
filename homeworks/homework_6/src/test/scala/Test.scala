import utest._


object Test extends TestSuite{

  val tests = Tests{
    'reverse - {
      assert(Exercises.reverse(Seq(1, 2, 3)) == Seq(3, 2, 1))
      assert(Exercises.reverse(Seq(-1, -2, -3)) == Seq(-3, -2, -1))
    }

    'fibonacci4Index - {
      assert(Exercises.fibonacci4Index(2) == 1)
      assert(Exercises.fibonacci4Index(5) == 5)
      assert(Exercises.fibonacci4Index(6) == 8)
      assert(Exercises.fibonacci4Index(9) == 34)
      assert(Exercises.fibonacci4Index(10) == 55)
      assert(Exercises.fibonacci4Index(0) == 0)
      assert(Exercises.fibonacci4Index(20) == 6765)
      assert(Exercises.fibonacci4Index(30) == 832040)

    }

    'fibonacci - {
      assert(Exercises.fibonacci(2) == Seq(0, 1, 1))
      assert(Exercises.fibonacci(5) == Seq(0, 1, 1, 2, 3, 5))
      assert(Exercises.fibonacci(9) == Seq(0, 1, 1, 2, 3, 5, 8, 13, 21, 34))
    }

    'morse - {
      assert(Exercises.morse("SOS") == "... --- ...")
      assert(Exercises.morse("Hello world!") == ".... . .-.. .-.. ---   .-- --- .-. .-.. -.. !")
    }

    'wordReverse - {
      assert(Exercises.wordReverse("Зима!.. Крестьянин, торжествуя...") == "Амиз!.. Ниняьтсерк, яувтсежрот...")
      assert(Exercises.wordReverse("Hello world!") == "Olleh dlrow!")
      assert(Exercises.wordReverse("Hello мир world!") == "Olleh рим dlrow!")
      assert(Exercises.wordReverse("") == "")
      assert(Exercises.wordReverse("Заказ шалаш топот") == "Заказ шалаш топот")
      assert(Exercises.wordReverse("имя") == "ями")
      assert(Exercises.wordReverse("коронавирус 2020") == "суриванорок 2020")
      assert(Exercises.wordReverse("745 hello world 123") == "745 olleh dlrow 123")
    }
  }
}