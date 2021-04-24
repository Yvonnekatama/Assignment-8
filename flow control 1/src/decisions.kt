fun main (){
age()
    nationality()
    phones()
    selectContainer(50)
}
fun age(){
    var Age=25
    if(Age>25){
        println("old enough")
    } else{
        println("youth")
    }
}

fun nationality(){
    var nation="Europian"
    if(nation.equals("Ugandan")){
        println("ugambachi")
    }
    else if(nation.equals("Rwandese")){
        println("ola")}
    else if(nation.equals("Kenyan")){
        println("habari")}

else{
    println("how are you doing")
        }
    }
fun phones(){
    var type="iphone"
    when(type){
        "tecno"->println("maybe")
        "samsung"->println("almost")
        "oppo"->println("not sure")
        else->println("maybe iphone")
    }

    }

fun selectContainer(litres: Int) {
    when (litres) {
        1, 2, 3 -> println("not that heavy")
        4, 5, 6 -> println("still not heavy")
        10, 20, 30 -> println("kinda heavy")
        else -> println("im strong enough")
    }
}
    fun nation() {
        var nationality = "Rwandese"
        when (nationality) {
            "Kenyan" -> println("ugamabachi")
            "Ugandan" -> println("habari")
            else -> println("hello")
        }
    }
//    }
////
//
//fun main(){
//    checkNum(24)
//}
//
//
//
//fun pass(password:String):Boolean {
//    if (password.length > 8 && password.length < 16) {
//        if (password.equals("pass")) {
//            return true
//        }
//        return false
//    }
//
//
//}
//
//
//
//fun checkNum(num:Int){
//    if(num%2==0){
//        println("Even")
//    }else{
//        println("Odd")
//    }
//}
//
//
//
//



