

fun main() {
    var num = arrayOf(10, 20, 30, 40)
    var count = num.count()
    var sum = num.sum()
    var minValue = num.minOrNull()
    println(minValue)
    var maxValue = num.maxOrNull()
    println(maxValue)

    var biscuits = arrayOf("manji", "nuvita", "marie")
    var type = biscuits.get(2)
    var biscuits2 = biscuits.plus("nice")
    var index = biscuits.indexOf("nuvita")
    println(index)


    var products = arrayOf("weetos", "pen", "juice", "bike")
    for (item in products) {
        println(item)
    }
}

