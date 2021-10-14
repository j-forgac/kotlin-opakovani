import java.util.*

fun main() {
    val ls = ArrayList<Int>()
    val sc = Scanner(System.`in`)
    while (sc.hasNext()) {
        ls.add(sc.nextInt())
    }
    var num = ls[0]
    for (i in ls) {
        if (i > num) {
            num = i
        }
    }
    println(num)
    for (i in ls) {
        if (i < num) {
            num = i
        }
    }
    println(num)
}