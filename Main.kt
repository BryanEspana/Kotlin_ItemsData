fun main(args: Array<String>) {
    println("Hello World!")
    //variable mutable: se puede modificar el estado
        var age: Int? = 20
    //variable inmutable: no se puede cambiar el estado
        var name = "Javier"
    //When
    when (name){
        "Bryan" -> age = 21
        "Javier" -> age = 19
        else -> age = null
    }

    //for
    val pets = arrayOf("simba", "mateo", "jace", "oso")
    for (elements in pets){
        println("$elements")
    }

    for (i in 1..5) println(i)
    println("Hello $name you have $age years old")
}