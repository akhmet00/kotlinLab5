import java.util.*
import kotlin.collections.ArrayList
fun main(){
    loop@ while(true) {
        val read = Scanner(System.`in`)
        println("insert exercise ")
        when (read.nextInt()) {
            1 -> fibonacciInput()
            2 -> binarySearch()
            3 -> randomArrayNumbers()
            4 -> reverseString()
            5 -> break@loop
            else -> {
                println("No such exercise (1-4)")
                println("5 to exit")
            }
        }
        continue@loop
    }

}


fun fibonacciFold(n: Int) =
    (2 until n).fold(1 to 1) { (prev, curr), _ ->
        curr to (prev + curr)
    }.second

fun fibonacciInput(){
    val input = Scanner(System.`in`)
    println("Input number to find Fibonacci")
    val n = input.nextInt();
    println(fibonacciFold(n));
}
fun binarySearch(){
    val input = Scanner(System.`in`)
    val numbers = listOf(1, 3, 7, 10, 12)
    data class Box(val value: Int)
    println(numbers)
    println("Input your value to find ")
    val binary = input.nextInt();
    val boxes = numbers.map { Box(it) }
    println("Index of value is " + boxes.binarySearchBy(binary) { it.value }) // 3
}
fun randomArrayNumbers(){
    val input = Scanner(System.`in`)
    println("Input array size")
    val n = input.nextInt();
    println("Input min number of random range")
    val min = input.nextInt();
    println("enter max number of random range")
    val max = input.nextInt();
    val numbers = ArrayList<Int>()
    val printSummary = { min: Int, max: Int ->
        for(i in 0..n){
            val rnds = (min..max).random()
            numbers.add(rnds);
        }
        println(numbers)
    }
    printSummary(min,max)
}
fun reverseString(){
    println("Input string to reverse")
    val text = readLine()
    val textReverse = {text : String->
        println(text.reversed())
    }
    if (text != null) {
        textReverse(text)
    }
}