import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    var pos = 0
     
    var temp = pos + 1
    var max = scanner.nextInt()
    var temp2 = max
    
    while (scanner.hasNextInt()) {
        temp2 = scanner.nextInt()
        pos++ 
        if (max < temp2) { max = temp2
        temp = pos + 1}
    }
    print("$max $temp")
}
