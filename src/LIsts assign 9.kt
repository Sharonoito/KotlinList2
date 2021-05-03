fun main(){
    println(countries(listOf("Kenya","Uganda","Rwanda","South Sudan","Burundi","Nigeria","Sudan","Somalia","Congo","Tanzania")))
    var averageAndTotal=avgTotal(listOf(1.25,1.57,1.91,1.59,1.81))
    println(averageAndTotal)
    var person= listOf(
        Person("Jael",21,1.2.toFloat(),68.20),
    Person("Fred",51,1.9.toFloat(),70.00),
    Person("Ann",18,1.5.toFloat(),50.00),
    Person("Felix",60,1.8.toFloat(),81.00),
    )
        var human=person.sortedByDescending{person->person.age}
          println(human)
    addPeople()
    var mycar= listOf(
        Car("KAC 324C",12000),
        Car("KBZ 431",11000),
        Car("KCD 561",13000),
    )
println(avgMileage(listOf(12000,11000,13000)))
}

fun countries(countries:List<String>):List<String>{
    var stringEven= mutableListOf<String>()
    for (string in countries){
        if(countries.indexOf(string)%2==0){
            stringEven.add(string)

        }
    }
    return  stringEven
}
data class listAvgTotal(var average:Double,var total:Double)
fun avgTotal(height:List<Double>):listAvgTotal{
    var total=height.sum()
    var average=height.average()
    var avgTotal=listAvgTotal(average,total)
    return avgTotal
}
data class Person(var name:String,var age:Int,var height:Float,var weight:Double)

data class People(var name:String,var age:Int,var height:Float,var weight:Double)
fun addPeople() {
    var people = mutableListOf(
        Person("Jael", 21, 1.2.toFloat(), 68.20),
        People("Fred", 51, 1.9.toFloat(), 70.00),
        People("Ann", 18, 1.5.toFloat(), 50.00),
        People("Felix", 60, 1.8.toFloat(), 81.00),
    )
    var add = people.addAll(listOf(
        People("Faith", 28, 1.6.toFloat(), 48.00),
        People("Afline", 15, 1.2.toFloat(), 59.00),
    ))
    println(people)
}
    data class Car(var registration:String,var mileage:Int)
    fun avgMileage(mileage:List<Int>):Int{
        var totalMileage= mileage.average().toInt()
        return totalMileage

    }

