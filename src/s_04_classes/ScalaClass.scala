package s_04_classes

class ScalaClass {

}

class Complex(real: Double, imaginary: Double) {
  def re(): Double = real

  def im(): Double = imaginary
  override def toString: String =
    "" + re + (if (im >= 0) "+" else "") + im + "i"
}

object ComplexNumbers {
  def main(args: Array[String]): Unit = {
    val c = new Complex(1.2, 3.4)
    println("Overridden toString(): " + c.toString)
  }
}
