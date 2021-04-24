import java.util.*

fun main (){
    fruits("Banana","Apple","Grapes","Oranges")
    places()
    num()
    println(Arrays.toString(namesArray("Yvonne","Eunice","Shadya")))
}

fun fruits(fruit1:String,fruit2:String,fruit3:String,fruit4:String) {
    var fruitsArray = arrayOf(fruit1,fruit2,fruit3,fruit4)
    println(Arrays .toString(fruitsArray))
}

fun places() {
    var citiesArray = arrayOf("harare", "mumbai", "dodoma", "jarkata")
    for (city in citiesArray) {
        println(city.capitalize())
    }
}
fun num(){
    var numbersArray=arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
    var number=numbersArray.get(1)+numbersArray.get(4)
    println(number)
    var index=numbersArray.indexOf(158)
    println(index)
    var sort=numbersArray.sorted()
    println(sort)
}
fun namesArray(name1:String,name2:String,name3:String):Array<String> {
    var name=arrayOf(name1,name2,name3)
    return name
}