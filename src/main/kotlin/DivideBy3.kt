import java.util.*
fun main(){
    val sc = Scanner(System.`in`)
    var result = 0
    var counter = 1
    while (sc.hasNext()) {
        val x = sc.nextInt()
        if (x % 3 == 0 && counter % 2 == 0) {
            result += x
        }
        counter++
    }
    println(result)
}