import kotlin.properties.Delegates

class User {
    var name: String by Delegates.observable("<no name>") {
        prop, old, new ->
        println("$old -> $new")
    }
}

val lazyValue: String by lazy {
    println("computed!")
    "Hello"
}

fun messageObj(animal: Animal?){
    println(animal?.message())
}

interface Base {
    fun print()
}

class BaseImpl(val x: Int) : Base {
    override fun print() { print(x) }
}

//class Derived(b: Base) : Base by b

fun main(args: Array<String>) {
    var dog: Dog = Dog("Kai")
    var cat: Cat = Cat("Roy")
    var dog2: Dog = Dog(null)
    var cat2: Cat = Cat(null)
    var tbl: Table = Table("table")
    dog.message()
    dog2.message()
    cat.message()
    cat2.message()
    messageObj(null)
    cat.myName()
    Derived(dog).myName()

//    val user = User()
//    user.name = "first"
//    user.name = "second"
//    println(lazyValue)

//    println(lazyValue)
//    var c = Child()
//    c.foo()
//
//    val b = BaseImpl(10)
//    Derived(b).print()
}

