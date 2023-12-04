import org.scalatest.funsuite.AnyFunSuite

class TestSolutions extends AnyFunSuite:

  test("Day01") {
    assertResult(54916)(actual = Day01.answer1)
    assertResult(54728)(actual = Day01.answer2)
  }
  test("Day02") {
    assertResult(2600)(actual = Day02.answer1)
    assertResult(86036)(actual = Day02.answer2)
  }
  test("Day03") {
    assertResult(498559)(actual = Day03.answer1)
    assertResult(72246648)(actual = Day03.answer2)
  }
  test("Day04") {
    assertResult(24175)(actual = Day04.answer1)
    assertResult(18846301)(actual = Day04.answer2)
  }
