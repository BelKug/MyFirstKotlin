package be.kotlin.kotlincourse.Inheritance

/**
 * Created by guyheylens on 16/04/17.
 */


//not possible to directly create an instance of this because of .... being an abstract class
abstract class StoredEntity{
    abstract fun store()
}


class Employee: StoredEntity(){
    override fun store() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}

fun main(args: Array<String>) {
    //val se = StoredEntity()
    val emp = Employee();
}