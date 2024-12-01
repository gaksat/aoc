import java.io.File
import kotlin.math.abs

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

  firstColumn.sort()
  secondColumn.sort()

  var result = 0
  for (i in firstColumn.indices) {
    result += abs(firstColumn[i] - secondColumn[i])
  }

  println("Result: $result")
}
