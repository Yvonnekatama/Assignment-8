fun main(){
    var result= average(3,6,9)/3
    println(result)
    var sum= add(2,1.2f)
    println(sum)
    introduction("katama",25)

}

fun average(num1:Int, num2:Int, num3:Int,):Int{
    var average = (num1+num2+num3)/3
    return(average)
}

fun add(num1:Int,num2:Float):Float{
    var add=num1+num2
    return(add)


}

fun introduction(name:String, age:Int){
    println("Hi my name is $name")
}