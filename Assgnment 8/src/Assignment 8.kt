fun main(){
println(isEven(6))
    var product=Product("Tomatoes",5.6,100,"groceries")
    product.retailer()
    var product2=Product("detergent",1.5,250,"hygiene")
    product2.retailer()
    var product3=Product("clothes",10.5,1000,"others")
    product3.retailer()
println(returnString("banana"))
    println(listStrings(arrayOf("Mary","Salome","Mellisa","Shallie")))
}
fun isEven(num:Int):Boolean{
    if(num%2==0){
        return true
    }else{
        return false
    }
}

data class Product(var item:String,var weight:Double,var price:Int,var category:String){
    fun retailer(){
        var groceries= mutableListOf<String>()
        var hygiene= mutableListOf<String>()
        var other= mutableListOf<String>()
        when(category){
            "groceries"->println(groceries.plus(item))
            "hygiene"->println(hygiene.plus(item))
            "other"->println(other.plus(item))
        }
    }
}

fun returnString(fruit:String):String{
    var myString=""
    for(item in fruit){
        if(fruit.indexOf(item)%2==0){
            print(item)
        }

    }
    return "${myString}"
}

fun listStrings(listStrings:Array<String>):List<String>{
    var myList= mutableListOf<String>()
    for (names in listStrings){
        if(names.length%2==0){
            println(myList.add(names))
        }
    }
    return myList
}