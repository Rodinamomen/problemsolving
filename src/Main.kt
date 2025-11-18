import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.cancel
import kotlinx.coroutines.cancelChildren
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
suspend fun preCache(name: String) {
    delay(50) // imitate long-running operation
    println("Cached $name")
}
suspend fun loadImage(name: String) {
    delay(50) // imitate long-running operation
    println("Loaded $name")
}
val scope = SupervisorJob()
suspend fun doSelfCancelingJob() = coroutineScope {
    launch { preCache("image_3") }
    for (i in 1..10) {
        println("Running long operation for ${i * 10}ms")
        delay(5)
        if (i == 1) {
            this.coroutineContext.cancelChildren()
        }
    }
}


// Please change only the "main" function:
fun main(){
    println(twoSum(nums = intArrayOf(3,2,4), target = 6).joinToString())
}