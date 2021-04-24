fun main() {
var result=add(12.2,3.8)
    println(result)
var names=fullName("yvonne","mnyazi")
println(names)
}

fun add(num1:Double,num2:Double):Int {
    var add = num1 + num2
    var output = add.toInt()
    return output
}


fun fullName(firstName:String,secondName:String):String{
    var fullName=firstName +" "+ secondName
    return fullName
}