```groovy
class MyClass {
    def myMethod(param) {
        if (param == null) {
            return 0
        } else if (param instanceof Integer) { //check if its an Integer
            return param * 2
        } else {
            throw new IllegalArgumentException("Unsupported parameter type: "+ param.class)
        }
    }
}

MyClass myInstance = new MyClass()
println myInstance.myMethod(null) // prints 0
println myInstance.myMethod(5) // prints 10

try {
    println myInstance.myMethod([1,2,3])
} catch (IllegalArgumentException e) {
    println("Exception caught: "+ e.message)
}
```