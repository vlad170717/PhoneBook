package phonebook

import java.io.File
import kotlin.system.measureTimeMillis

fun main() {
    var array: MutableList<String> = mutableListOf("zAs", "Bd", "Ne", "Uit", "aff")

    sortMList(array)

    println("Start searching...")
    val time = measureTimeMillis{findPhoneNumbers()}
    val minutes = time / 1000 / 60
    val sec = (time - minutes * 60 * 1000) / 1000
    val ms = time - minutes * 60 * 1000 - sec * 1000
    print("Time taken ${minutes} min. ${sec} sec. ${ms} ms.")
}

private fun sortMList(array: MutableList<String>) {
    for (i in 0..array.lastIndex - 1) {
        for (k in 0..array.lastIndex - 1) {
            if (array[k] > array[k + 1]) {
                val temp = array[k]
                array[k] = array[k + 1]
                array[k + 1] = temp
            }
        }
    }
}


fun findPhoneNumbers() {
    data class Record(val name: String = "", val phone: String = "")
    val directory: MutableList<Record> = mutableListOf()
    val fileD = File("c:\\Kotlin\\directory.txt")
    val lines = fileD.readLines()
//    if (fileD.isFile()) {
//        fileD.forEachLine {
//            val list = it.split(" ",limit = 2)
//            when (list.size) {
//                1 -> println("only phone found")
//                2 -> directory.add(Record(list[1], list[0]))
//                else -> println("too much fields")
//            }
//        }
//    }
    val fileF = File("c:\\Kotlin\\find.txt")
    if (fileF.isFile()) {
        var found = 0
        var size = 0
        fileF.forEachLine {
            val peopleName = it
            size++

            lines.forEach{if (it.split(" ", limit = 2)[1] == peopleName) found += 1}

        }
        print("Found $found / $size entries. ")
    }
}
