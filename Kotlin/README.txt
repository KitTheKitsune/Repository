KEYWORDS:

fun  - function keyword
val - variable keyword
String -string
Int -integer
IntRange -range of Integers
Double -floating point numbers
Boolean -boolean
class -class
return - returns a value from a function
if - conditional
else -conditional
else if -conditional
when -conditional
abstract -declare an abstract class/variable
private -this can only be used in this Class
override -this val/fun was declared in the parent class and will now be defined/assigned
with -used when working with a specific instance of a class and need to access multiple properties
open -allows a non abstract class to be inherited from

COMMON FUNCTIONS:
print() / println()
repeat()
IntRange.random()

BASICS:

fun main() {} - example function

println() -print text

\n -line break

// -comment

“${variable} text” -use the value of a variable

Function arguments must be named-
	fun main (argument1: String, argument2: Int) {}

repeat(Int) {} - loop that executes Int times

Int range - Int1..Int2 describes a range of int values from Int1 to Int2
val range = 1..10  -range of Ints 1,2,3,4,5….10

random() - function of IntRange that generates a random number from that range

Class variables can be grabbed intrinsically via Class.variable without declaring a getter

Class variables can also be set intrinsically via class.variable = Val without declaring a setter

Classes do NOT require defined constructor methods

Returning values from functions can de defined as:  
 fun Function(): valueType {}

Classes can be written to require arguments when created:
 class Class (val Value: valType) {}

When is a conditional that compares argument with possible values e.g.:
	when (argument) {
		Value1 -> do this
		Value2 -> do this
		Value3 -> do this
	}

Declare an abstract class and all variables must also be marked abstract
	-abstract class Class(){
		abstract val Value: valType
	}

To show Class hierarchy the subclass must extend the superclass
	-class Class : SuperClass(){}

How to use WITH:
	val instanceName = Class()
	with (instanceName) {
		//do all this in relation to instance
		println(${value})
	}

By default non-abstract classes cannot be inherited from. If a class is to be inherited from it must either be abstract or use the open keyword:
	-abstract class SuperClass() {}
	open class Class() : SuperClass() {}
	class ChildClass() : Class() {}

class constructors can include default values by assigning them in the arguments:
	-class Class(
		Arg1: valType,
		Arg2: valType = defaultValue) {}

The Kotlin math library can be implemented via import e.g.:
-import kotlin.math.PI
print(PI)
Import kotlin.math.sqrt
print(sqrt(PI))
