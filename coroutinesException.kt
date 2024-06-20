import kotlinx.coroutines.*

fun main() = runBlocking {

   val job = launch {
        try {
            Task()
        } catch (e: Exception) {
            println("Caught exception: ${e.message}")
        }
    }
    job.join()
}

suspend fun Task() {
    delay(500L)
    throw RuntimeException("Something went wrong!")
}
