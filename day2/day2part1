import kotlin.math.abs

fun main() {
    var count = 0
    while (true) {
        val input = readLine() ?: break 
        val numbers = input.split(" ").map { it.toInt() }.toIntArray()

        if (isSafe(numbers)) {
            count++
        }
    }

    println(count)
}

fun isSafe(arr: IntArray): Boolean {
    var increasing = true
    var decreasing = true

    for (i in 1 until arr.size) {
        val difference = abs(arr[i] - arr[i - 1])
        if (difference !in 1..3) {
            return false
        }

        if (arr[i] < arr[i - 1]) {
            increasing = false
        }

        if (arr[i] > arr[i - 1]) {
            decreasing = false
        }
    }

    return increasing || decreasing
}
