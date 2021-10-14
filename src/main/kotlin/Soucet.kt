fun main(){
    var result = 0
    var input = "12AX3"
    for(x in 0..input.length-1){
        var num = 0
        if(input.get(x).isDigit()){
            num = Character.getNumericValue(input.get(x))
        }
        result += num
    }
    println(result)

}