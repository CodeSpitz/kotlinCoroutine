import kotlin.coroutines.Continuation
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.coroutines.startCoroutine

fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}

private class Cont(override val context: CoroutineContext): Continuation<Unit> {
    override fun resumeWith(result: Result<Unit>){}

}
fun eLaunch(ctx:CoroutineContext = EmptyCoroutineContext, block:suspend ()->Unit) = block.startCoroutine(Cont(ctx))
