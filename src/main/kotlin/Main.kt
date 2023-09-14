fun main(args: Array<String>) {
    //Task1
    val age1 = 42
    val age2 = 21
    //Task2
    val avg1 = (42 + 21) / 2
    /*Проблема здесь в том что тип данной константы Int, следовательно дробную часть числа мы потеряли, должно быть 31.5, а нам выведет 31*/
    //Task3
    /*Исправление ошибки выглядит следующим образом:
    * val age1* = 42
    * val age2 = 21
    * val avg1 = ((42 + 21) / 2).toDouble()
    * */
    //Task4
    val firstName = "Никита"
    val lastName = "Гутов"
    //Task5
    val fullName = "${firstName} ${lastName}"
    //Task6
    val myDetails: String = "Привет, меня зовут ${fullName}."
    //Task7
    val Triple = Triple(11,11,11)
    //Task8
    val day = Triple.first
    val month = Triple.second
    val year = Triple.third
    //Task9
    /*val (_, month, year) = Triple
    println(Triple)*/
    //Task10
    val newPair = Pair(4,year)
    println(newPair)
}