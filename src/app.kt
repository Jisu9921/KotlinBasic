fun nullableTest(a: Int?) {
    var one: Int? = a//null 이라면 null
    println("one : $one")
    var two: Int = a!! //null 이라면 Exception
    println("two : $two")

}

class Member{
    var name: String = "Jisu Choi"
}

fun nameLength(member: Member?){
    println(member?.name?.length)
}

interface Base {
    fun print()
}

class BaseImpl(val x: Int) : Base {
    override fun print() { print(x) }
}

class Derived(b: Base) : Base by b

fun main(args: Array<String>) {

    nullableTest(2)
    nullableTest(null)

    val member: Member = Member()
    nameLength(member)
    var sum: Int = 0
    listOf(1,2,3).filter { it > 0 }.forEach {
        sum += it
    }
    print(sum)

    val b = BaseImpl(10)
    Derived(b).print()
}

