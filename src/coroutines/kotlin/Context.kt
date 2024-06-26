import kotlinx.coroutines.CoroutineName
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(){

    runBlocking {
        launch(CoroutineName("myCoroutineName")) {
            println("This is run from ${this.coroutineContext.get(CoroutineName.Key)}")
        }

        GlobalScope.launch {

        }
    }
}