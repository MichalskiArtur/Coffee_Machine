import java.util.*
import kotlin.math.sqrt

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val shape = scanner.nextLine()

    var a: Double
    var b: Double
    var c: Double
    var r: Double = 0.0

    when (shape) {
        "triangle" -> {
            a = scanner.nextDouble()
            b = scanner.nextDouble()
            c = scanner.nextDouble()
            r = sqrt((a + b + c) * (a + b -c) * (a - b + c) * (b + c - a)) / 4
        }
        "rectangle" -> {
            a = scanner.nextDouble()
            b = scanner.nextDouble()
            r = a * b
        }
        "circle" -> {
            a = scanner.nextDouble()
            r = 3.14 * a * a
        }
    }
    println("$r")

}