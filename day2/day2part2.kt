fun main() {
    var safeCount = 0

    while (true) {
        val input = readLine() ?: break
        val levels = input.split(" ").map { it.toInt() }.toIntArray()
        
        if (isSafe(levels)) {
            safeCount++
        }
    }

    println(safeCount)
}

fun isSafe(levels: IntArray): Boolean {
    // Check if the sequence is already valid
    if (isSafe(levels)) return true

    // Check by removing one element
    for (i in levels.indices) {
        val newLevels = levels.filterIndexed { index, _ -> index != i }.toIntArray()
        if (isValidSequence(newLevels)) return true
    }

    return false
}

fun isValidSequence(levels: IntArray): Boolean {
    if (levels.size < 2) return true 

    var increasing = true
    var decreasing = true

    for (i in 1 until levels.size) {
        val diff = levels[i] - levels[i - 1]

        if (diff !in -3..-1) decreasing = false 
        if (diff !in 1..3) increasing = false  
        if (!increasing && !decreasing) return false
    }

    return increasing || decreasing
}
