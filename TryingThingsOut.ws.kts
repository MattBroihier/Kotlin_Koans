var TrueOrFalse = false
print (TrueOrFalse)



var FirstFloat = 0.1
var SecondFloat = 0.2
var ThirdFloat = 0.3

println (FirstFloat + SecondFloat == ThirdFloat)

println (FirstFloat + SecondFloat - ThirdFloat)

println (FirstFloat)

var b: String? = "abc" // can be set null
b = null // ok
print(b)

val b: String? = "Kotlin"
if (b != null && b.length > 0) {
    print("String of length ${b.length}")
} else {
    print("Empty string")
}