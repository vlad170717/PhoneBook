import java.util.Scanner

fun main(args: Array<String>) {
    // input
    val scanner = Scanner(System.`in`)
    val size = scanner.nextInt()
    val arr = IntArray(size)
    for (i in 0..arr.lastIndex) {
        arr[i] = scanner.nextInt()
    }

    // processing
    var triplesCount = 0

    for (i in 0..arr.lastIndex - 2) {
        if (isTriple(arr[i], arr[i + 1], arr[i + 2])) triplesCount++
    }

    // output
    println(triplesCount)
}

fun isTriple(a: Int, b: Int, c: Int): Boolean {
    return a + 1 == b && b + 1 == c
}