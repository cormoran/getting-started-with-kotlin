import kotlinx.coroutines.*
import kotlin.coroutines.CoroutineContext

suspend fun main() = coroutineScope {
    launch {
        delay(1000)
        println("Kotlin Coroutines World!")
    }

}

class MyCoroutineScope : CoroutineScope {
    private val job = Job()
    override val coroutineContext: CoroutineContext
        get() = job
}

class BasicCoroutine {
    fun runOnLocalScope(): Job {
        val scope = MyCoroutineScope()
        val job = scope.launch {
            for (x in 1..100) {
                delay(1000);
                println("local: ${x}000ms")
            }
            println("local: Done")
        }
        return job
    }

    fun runOnGrobalScope() {
        val job = GlobalScope.launch {
            delay(1000)
            println("Kotlin Coroutines World!")
        }
        println("Hello")
    }

    suspend fun runAsyncAwait() {
        val scope = MyCoroutineScope()
        scope.async {
            1
        }.await().let { println(it) }
    }
}

fun main(args: Array<String>) {
    val job = BasicCoroutine().runOnLocalScope()
    var cnt = 0;
    while (cnt < 1e9) {
        cnt++;
    }
    job.cancel()
}
