```groovy
class MyClass {
    def myMethod(param) {
        if (param == null) {
            return 0 // handles null input
        }
        //some code that throws exception
        return param * 2
    }
}

MyClass myInstance = new MyClass()
println myInstance.myMethod(null) //This will print 0
println myInstance.myMethod(5)  //This will print 10
println myInstance.myMethod([1,2,3]) //This will throw exception
```