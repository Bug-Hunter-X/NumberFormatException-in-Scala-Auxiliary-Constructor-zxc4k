# NumberFormatException in Scala Auxiliary Constructor

This repository demonstrates a common error in Scala when using auxiliary constructors: the potential for a `NumberFormatException` to occur if string conversion to a number fails.

The `MyClass` class is designed to accept either a `T` or a `String`. However, the conversion from `String` to `Int` in the auxiliary constructor is not handled gracefully. If the input string is not a valid integer, a `NumberFormatException` will be thrown.

The solution demonstrates how to properly handle this exception to prevent unexpected program crashes.