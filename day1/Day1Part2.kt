import java.io.File

fun main() {
    val fileName = "input.txt"
    val inputFile = File(fileName)

    val input = inputFile.readLines()

    val firstColumn = IntArray(input.size)
    val secondColumn = IntArray(input.size)
    for (i in input.indices) {
        val parts = input[i].split("\\s+".toRegex())
        firstColumn[i] = parts[0].toInt()
        secondColumn[i] = parts[1].toInt()
    }

    val secondColumnMap = mutableMapOf<Int, Int>()
    for (i in secondColumn) {
        secondColumnMap[i] = secondColumnMap.getOrDefault(i, 0) + 1
    }

    var totalres = 0
    for (i in firstColumn) {
 	val count = secondColumnMap.getOrDefault(i, 0)
        totalres += i * count
    }

    println(totalres)
}
