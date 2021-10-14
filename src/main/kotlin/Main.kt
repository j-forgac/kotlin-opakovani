fun main(){
    val input = "AXBABABA"
    val pos1 = input.indexOf("AB")
    val pos2 = input.indexOf("BA",pos1+2)
    val pos3 = input.indexOf("BA")
    val pos4 = input.indexOf("AB",pos3+2)
    println((pos1 > -1 && pos2 > -1) || (pos3 > -1 && pos4 > -1))
}