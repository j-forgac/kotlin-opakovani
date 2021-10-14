fun main(){
    val width = 6
    val height = 6
    val stoneSize = 4
    println(Math.ceil(width.toDouble() / stoneSize) * Math.ceil(height.toDouble() / stoneSize))
}