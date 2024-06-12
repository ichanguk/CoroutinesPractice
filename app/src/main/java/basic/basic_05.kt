package basic

import kotlinx.coroutines.*

fun main() = runBlocking {
    val job = launch { // launch a new coroutine and keep a reference to its Job
        println("World!")
    }
    println("Hello")
    job.join() // wait until child coroutine completes
    println("Done")
}