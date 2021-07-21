package s_03

import javax.security.auth.callback.Callback

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

// Functions are also object
// function can be passed to other function as a object (remember=> closures in JS same as that)

object FunIsObject {
  def oncePerSecond(callback: () => Unit): Unit = {
    while (true) {
      callback()
      Thread.sleep(1000)
      //Thread sleep 1000 //also can be written as this
    }
  }

  def timeFlies(): Unit = {
    println("time flies----")
  }

  def main(args: Array[String]): Unit = {
    oncePerSecond(timeFlies)
    // Anonymous Function
    oncePerSecond(() => {
      println("anonymously time flies")
    })

  }
}