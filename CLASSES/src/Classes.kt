fun main() {
    var human = Humanbeing("Yvonne",24,45.1f)
    human.eat(3)
    human.speak("I love food")
    human.birthday()
}

class Humanbeing(var name:String,var age:Int,var weight:Float) {
    fun eat(foodweight: Int){
        println("I am eating $foodweight kgs of food")
        var weightnew=foodweight+weight
        println(weightnew)
    }
    fun speak(speech:String){
        println(speech)
    }
    fun birthday(){
        var newage=age+1
        println(newage)
    }
}


