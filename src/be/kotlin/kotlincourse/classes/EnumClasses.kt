package be.kotlin.kotlincourse.classes

/**
 * Created by guyheylens on 12/04/17.
 */

// 0 (zero) based enums
enum class Priority{
    MINOR,
    NORMAL,
    MAJOR,
    CRITICAL
}

enum class PriorityValue(val value: Int){
    MINOR(-1){
        override fun toString(): String {
            return "Minor priority"
        }
    },
    NORMAL(0),
    MAJOR(1),
    CRITICAL(100);

    //abstract fun text(): String
}

fun main(args: Array<String>) {
    val priority = Priority.NORMAL
    println(priority)
    println(priority.ordinal)

    val priorityValue = PriorityValue.NORMAL
    println(priorityValue.value)

    //loop over enums
    for(prio in Priority.values()){
        println(prio)
    }


    val p = Priority.valueOf("NORMAL")
    println(p.ordinal)
}