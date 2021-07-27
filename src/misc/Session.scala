package misc

object Session {
  def main(args: Array[String]): Unit = {
    class Person(val name: String, val address: String)

    object PersonalDetails {
      def unapply(arg: Person) = (arg.name, arg.address)
    }

    object NameOf {
      def unapply(arg: Person) = arg.name
    }

    object AddressOf {
      def unapply(arg: Person) = arg.address
    }

    val v = new Person("vaibhav", "india")

    println(PersonalDetails.unapply(v))

    println(NameOf.unapply(v))

    println(AddressOf.unapply(v))
  }

}