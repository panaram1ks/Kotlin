import kotlinx.coroutines.*
import java.lang.ArithmeticException
import java.lang.IndexOutOfBoundsException

fun main() {
    runBlocking {
        val myHandler =
            CoroutineExceptionHandler { coroutineContext, throwable -> println("Exception handled: ${throwable.localizedMessage}") }
        val job = GlobalScope.launch(myHandler) {
            println("Throwing exception from job")
            throw IndexOutOfBoundsException("exception in coroutine")
        }
        job.join()


        val deferred = GlobalScope.async {
            println("Throwing exception from async")
            throw ArithmeticException("exception from async coroutine")
        }
        try {
            deferred.await()
        } catch (e: ArithmeticException){
            println("Caught ArifmeticalException ${e.localizedMessage}")
        }
    }
}