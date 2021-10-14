fun main(){
    var result = 0
    var input = ""
    for(x in 0..input.length){
        var num = 0
        try {
            num = input.substring(x, x + 1).toInt()
        } catch (ignored: Exception) {
        }
        result += num
    }
    println(result)

}