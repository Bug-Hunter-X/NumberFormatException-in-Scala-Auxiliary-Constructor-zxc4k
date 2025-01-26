```scala
class MyClass[T](val value: T) {
  def this(value: String) = {
    try {
      this(value.toInt)
    } catch {
      case e: NumberFormatException => {
        println("Error converting String to Int: " + e.getMessage)
        this(0) // Or handle it as appropriate to your app
      }
    }
  }
}
```