import java.util.Scanner

fun main(args: Array<String>) {
    // input
    val scanner = Scanner(System.`in`)
    val size = scanner.nextInt()
    var arr = IntArray(size)
    for (i in 0..arr.lastIndex) arr[i] = scanner.nextInt()
    val numN = scanner.nextInt()
    val numM = scanner.nextInt()

    // processing
    var result = "NO"
    for (i in 0..arr.lastIndex - 1) {
        if ( (numN == arr[i] && numM == arr[i + 1]) ||
             (numM == arr[i] && numN == arr[i + 1]) ) {
            result = "YES"
            break
        }
    }

    // output
    println(result)

}