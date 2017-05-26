/**
 * Created by jisu on 2017. 5. 26..
 */
open class Animal {
    open fun message() {
    }
}

class Dog(name: String?) : Animal(), MyName{

    override var myname: String
        get() = name
        set(value) {}
    var name = name?:"Ruby"
    override fun message() {
        super.message()
        println("$name is Dog")
    }
}

class Cat(name: String?) : Animal(), MyName{
    override var myname: String
        get() = name
        set(value) {}
    var name = name?:"Ruby"
    override fun message() {
        super.message()
        println("$name is Cat")
    }
}

class Table(name: String?) : MyName{
    override var myname: String
        get() = name
        set(value) {}
    var name = name?:"table"
}

interface MyName {
    var myname: String

    fun myName(){
        println(myname)
    }
}

class Derived(myName: MyName) : MyName by myName