fun main() {
    val x = "I love"
    val school = "Akirachix"
    println(x + "" + school)

    val fruit = "Pineapple"
    println(fruit[0])
    println(fruit[1])
    println(fruit[2])
    println(fruit[3])
    println(fruit[4])
    println(fruit[5])
    println(fruit[6])
    println(fruit[7])
    println(fruit[8])
    val name = "Yvonne"
    val year = "1997"
    val sentence = "$name was born in $year"
    println(sentence)


    val message = "PA4782DHUE. confirmed"
    val message2 = "PA4782DHUE. confirmed"
    if (message == message2)
        println("true")

    val texttype= "BOLD"
    val texttype2 = "Black"
    if(texttype .equals (texttype2))
        println("true")
        else {
        println(false)
    }
    val text = "principle"
    println(text.toUpperCase())

    val road= "Riverroad"
    println(road.trimStart())
    println(road.trimEnd())

    val location = "Nairobi"
    println(location.startsWith("N"))
    println(location.endsWith("E"))

    val nickname= "Yvoone"+"Katama"
    println(nickname.replace("Yvoone" , "Yvonne"))

    val towns=arrayOf("Nairobi", "Kisumu", "Eldoret", "Nakuru")
    for(item in towns){
        println(item)
    }

    val myString = """
        |My name is yvonne
        |I love chocolates
        |i love pasta
    """.trimMargin()
        println(myString.trimMargin())

    val program= "akirachix"
    print(program[0])
    print(program[2])
    print(program[3])
    fun se(x:String, y:Int) {
val sentence
     }
    val name3= "Eunice"
    println(name3.length)

    val name4= "Cate"
    if(name4=="Shadya"){
        println("thats me")
    }
    else{
        println("i dont know that is")
    }

}
