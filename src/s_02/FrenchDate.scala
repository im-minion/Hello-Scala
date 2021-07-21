package s_02

import java.text.DateFormat._ //{LONG, getDateInstance} // _ means all import
import java.util.{Date, Locale}

object FrenchDate {
  def main(args: Array[String]): Unit = {
    val now = new Date
    val dateFormat = getDateInstance(LONG, Locale.FRANCE)
    print(dateFormat format now)
    print(dateFormat.format(now)) // this is also same
  }
}
