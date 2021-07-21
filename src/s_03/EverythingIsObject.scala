package s_03

object EverythingIsObject {
  def main(args: Array[String]): Unit = {
    val c = 1 + 5
    val c2 = 1.+(5)

    println(c)
    println(c2)
    // expression 1 + 2 * 3 / x
    // same as    1.+(2.*(3)./(x))

  }
}
