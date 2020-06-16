import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    var test = scanner.nextInt()
    print("$test ")
    while (test != 1 ) {
        if (test % 2 == 0) {
            test /= 2
            print("$test ")
        } else {
            test = test * 3 + 1
            print("$test ")
        }
    }
}
