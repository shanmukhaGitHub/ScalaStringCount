

class StringCountUtilsTest extends UnitTest("RevereseList") {



  it should "return reverse given list of strings" in {
    val mylist: List[String] = List("List", "of",
      "String", "Can", "Reverse")

    StringUtils().myReverse(mylist).reverse.equals(mylist) shouldEqual true


  }

  it should "return count of chacters in a given string" in {
    StringUtils().myStringReplace("AAAAABBBCCC").equals("A5B3C3") shouldEqual true
  }

  it should "return count of chacters in a different string" in {
    StringUtils().myStringReplace("AAAEABBCCD").equals("A3EAB3C2D") shouldEqual false
  }

}