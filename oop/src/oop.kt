fun main(){
    var gari=Car("Toyota","Prado","KAC 342X",50) //object
    gari.start()
    println(gari.speed)
    gari.accelerate(60)
    println(gari.speed)

    var benz=Car("Mercedes Benz","E250","KDG 234X",80) //object
    benz.start()
    println(benz.speed)
    benz.accelerate(100)
    println(benz.speed)
    gari.carname()
    benz.hoot()
    var brows=beauty()
    brows.eyebrows("on fleek")
    brows.lips()
var duka=shop("hostess","rina","berry")
    println(duka.sweets)

}
class Car(var make:String,var model:String, var registration:String,var speed:Int){ //state

    fun start(){
    println ("I am starting...vrooom")//behaviour

}
fun accelerate(acceleration:Int):Int{
    speed=speed+acceleration
    return speed
}

    fun carname(){
        println("$make,$model")

    }
    fun hoot(){
        println("beeeeep!")
    }
}
class beauty(){
    fun eyebrows(sleek:String){
        println(sleek)
    }
    fun lips(){
        println("smooth")
    }
}
data class shop(var flour:String,var oil:String,var sweets:String)