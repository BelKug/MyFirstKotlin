package be.kotlin.kotlincourse.Inheritance

/**
 * Created by guyheylens on 16/04/17.
 */

interface Repository<T>{
    fun getById(id: Int): T
    fun getAll(): List<T>
}

fun main(args: Array<String>) {

    //Refactor "GenericRepository" to "GenericRepository"
    val customerRepo = GenericRepository<Customer>()

    val customer = customerRepo.getById(11)
    val customers = customerRepo.getAll()

}



