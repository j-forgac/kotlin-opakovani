import java.util.*
fun main(){
    val scnr = Scanner(System.`in`)
    var result = 0
    var counter = 1
    while (scnr.hasNext()) {
        val x = scnr.nextInt()
        if (x % 3 == 0 && counter % 2 == 0) {
            result += x
        }
        counter++
    }
    println(result)
}