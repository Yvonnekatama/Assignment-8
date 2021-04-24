//fun main(){
//    numbers(7)
//    checkNumbers()
//
////    checkPassword("dightful")
//}
//
////fun checkPassword(pass:String){
////    while(pass!="delightful"){
////        println("incorrect")
////    }
////
////}
//fun numbers(num:Int){
//    var start=0
//
//    do {
//        var product=start*num
//        start++
//        println(product)
//    }
//    while(start<=10){
//
//    }
//}
//fun checkNumbers(){
//    var num1=2
//    while(num1<=6){
//        num1+=3
//        println(num1)
//    }
//}

fun main(){
    checkPassword("")
}

fun checkPassword(pass:String){
    while(pass.length<=8){
        println("Logged in")

    }
}