import java.util.Scanner
import java.util.*

fun getList(): List<Int> {
    val arrayList = arrayListOf(1, 5, 2)
    Collections.sort(arrayList, object { var x : Int;  fun compareTo(y: Int): Int { return this - y }})
    return arrayList
}

fun main(args: Array<String>) {


    var array: MutableList<String> = mutableListOf("zAs", "Bd", "Ne", "Uit", "aff")

    for (i in 0..array.lastIndex - 1) {
        for (k in 0..array.lastIndex - 1){
            if (array[k] > array[k+1]) {
                val temp = array[k]
                array[k] = array[k + 1]
                array[k + 1] = temp
            }
        }
    }

    array.forEach { print("$it ")}
    return
    // input data
    val scanner = Scanner(System.`in`)
    var arr = IntArray(3)
    for (i in 0..arr.lastIndex) arr[i] = scanner.nextInt()

    //processing
    arr.sort()

    val exists = if (arr[0] + arr[1] > arr[2]) "YES" else "NO"

    // output

    println(exists)
}