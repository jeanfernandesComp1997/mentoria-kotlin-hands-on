fun main() {

    val stringArray = arrayOf("a", "b", "c", "d")
    stringArray.forEach { println(it) }

    val asc = Array(5) { (it * it).toString() }
    asc.forEach { println(it) }

    // Arrays para tipos primitivos

    val x = intArrayOf(1, 2, 3)
    // Opções
    //    byteArrayOf()
    //    booleanArrayOf()
    //    charArrayOf()
    //    floatArrayOf()
    //    doubleArrayOf()
    //    longArrayOf()
    //    shortArrayOf()

    // Array of int of size 5 with values [0, 0, 0, 0, 0]
    val arr = IntArray(5)

    // Array of int of size 5 with values [42, 42, 42, 42, 42]
    val arr2 = IntArray(5) { 42 }

    // Array of int of size 5 with values [0, 1, 2, 3, 4] (values initialized to their index value)
    var arr3 = IntArray(5) { it * 1 }
}