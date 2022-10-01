//here in this file you can see almost all the basics of kotlin
import www.example.models.Customer
import java.io.File
import java.io.RandomAccessFile
import java.lang.Character.getName
import java.lang.IllegalArgumentException
import java.lang.Thread.sleep
import java.util.concurrent.TimeUnit
import kotlin.Array
import kotlin.math.absoluteValue
import kotlin.random.Random
import kotlin.random.asJavaRandom
import kotlin.random.nextUInt
import kotlin.reflect.typeOf
import kotlin.system.measureNanoTime
import kotlin.test.assertTrue

//private val String.copy: Any
//    get() {
//        return 4
//    }
typealias shortWayDeclare = String //typealias allows you to thread variable as string

//this file is for the main function
fun main() {
//    val myName = FullName("ahmed","Anwar")
//    println(myName.fullName)
//    myName.fullName = "jamal abdellatif"
//    println(myName.fullName)
//    val a = -55
//    println(a.inv())  // there is also inc():means ++, and dec(): means --
//    val myBoy = getBoys("ahmed","you have to study")
//    println("${myBoy.BoyName } said: ${myBoy.BoyMessage}")
//    println(getBoyMessage("ahmed","some to learn"))
//     Boy.Companion.getBoyMessage("ahmed","you have to learn something useful")
//    println(boy1)
//     val stringLength: (String) -> Int = {input ->
//     input.length
//     }
//    val myStringLength = stringLength("abdellatif yabahddou")
//     println(myStringLength)
//     val num: (String) -> Boolean = {input ->
//       true
//
//     }
//    val myNum = num("")
//    println(myNum)
//    val myFavFood = FavoriteFood.name
//    println(myFavFood)
//    val yourFavFood = FavoriteFood.name
////    println(yourFavFood)
//    println(FavoriteFood.name)
//    println(FavoriteFood.name)
//    println(FavoriteFood.myFood)
//    val myHeart = MyHeart(name)
//    println(myHeart.name)
//    infix fun Int.times(str: String) = str.repeat(this)
//    println(3 times " you are a cat,")
//    val pair = "Ahmed" to "khadija"
//    println("${pair.first } is gonna marry ${pair.second}")
//    infix fun String.to(myStr: String) = Pair(this,myStr)  //infix function
//    println("ahmed" to "eats a lot")
//    println(GymMembership.BRONZE.discountPercent)
//    val myPair = Pair(GymMembership.BRONZE,GymMembership.BRONZE.discountPercent)
//    println("if you are ${myPair.first} member you have ${myPair.second} discount")
//    for (accountType in GymMembership.values()) {
//        println(accountType)
//    }
//    println()
//    GymMembership.values().forEach { membership ->
//        println(membership)
//    }
    // val myMembership = GymMembership.getPriceOfMembership("GOLD")
    //println(myMembership)
//    try {
//        val message = when(GymMembership.valueOf(value = readln().toUpperCase())) {
//            GymMembership.GOLD -> println("you are a gold member")
//            GymMembership.PLATINUM ->  println("you are a platinum member")
//            GymMembership.SILVER -> println("you are a silver member")
//            GymMembership.BRONZE -> println("you are a bronze member")
//        }
//    }catch (message: Exception) {
//        println("try something else")
//    }
    // println(message)
//    val h1 = HumanBeen("abdellatif", "yabahddou")
//    val h2 = HumanBeen("abdellatif","yabahddou")
//    val firstName1 =h1.component1()
//    val lastName1 = h1.component2()
//    println(firstName1)
//    println(lastName1)
//    val (firstName, lastName) = h2  // I don't know why we use this
//    println(firstName)
//    println(lastName)

//    h1.getFullName()
//    println(h1 == h2)
//    val sibling = h1.copy("ahmed")
//    println(sibling.component1())
//    val pair = Pair("ahmed","saad") // you can replace this with to: "ahmed" to "assad"
//
//    println(pair.first)
//    println(pair.second)
//    println(h1.javaClass)
//    val str = "myString"
//    println(str::class.java)
//    val myTriple = Triple("aya","asaad","fatima")
//    println(myTriple.copy().first)
//    val first = "my first tripe"
//    println(first.zip("t"))
//  val items = arrayOf(1,2,"ahmed",true,5.6)
//    for ( item in items){
//        println(item)
//    }
//    items.forEach { value -> println(value) }
//    val newItems = arrayOf(2,"string",false)
////    newItems.forEach { println(it) }
//    val item  = newItems.set(0,"mouna")
//    val users = newItems.get(0)
//    println(users)
//    for ( newItem in newItems){
//        println(newItem)
//    }
//    val intArrayRepeating = IntArray(5) {32}  //you can repeat 32 five times
//    val intArrayOf = intArrayOf(1,2,3,4,47) //array just for Int
//    val myMap = mapOf("Imad" to "aicha")
//    println("${myMap.keys}: ${myMap.values}")
//    val myList = listOf<String>("ahmed","aya","amin","aicha")
//    myList.find { it.contains('a') }
    //there is a filter, filterNot, filterOrNull, find, set, get,add, remove,
    //filterTo: {mutableList , condition} must have two references
    //filterNotTo ## filterTo
//    val mine = listOf("apples","watermelon")
//    val theirs = listOf("juice","coca")
//    val others = listOf("pizza","snacks")
//    val allOfUs = listOf(mine,theirs,others)
//    allOfUs.forEach { println(it) }
//    println("----")
//    for (i in allOfUs) println(i)
//    println("####")
//    println(allOfUs.flatten()) //brings them all
//    println("\\\\")
//    val result = mine.plus(theirs).plus(others)
//    println(result)
    //  val items = listOf("ahmed yaba","mohammed yaba","naima yaba","laila yaba")
//    val myItems = items.map { it.substring(1,4).toUpperCase() }
    //there is a difference between ..(last included) and ,(excluded) in range
//    val myItems1 = items.map {
//        val splitItems = it.split(' ')
//        splitItems[0].substring(0,1) + splitItems[1].subSequence(0,1)
//    }
//    println(myItems1)
//    val mapOfToday = mapOf( "ahmed" to "iman")
//    println("${mapOfToday.keys} to ${mapOfToday.values}")
//    val ourList = listOf(MyShopList(listOf("Cacoa","Jacket","Dankey")),
//        MyShopList(listOf("Money","Milk"))
//    )
//    val newList = ourList.map { it.items }
//    //map does print all lists separately
//    println(newList)
//    println("\\")
//    val newList1 = ourList.flatMap { it.items}
//    //flatmap print all lists in one list
//    println(newList1)
    // val setEx = setOf("ahmed",true,23,2.5,2f)
    //you should understand the difference between setOf, listOf and arrayOf
    //set doesn't print duplicate elements
    //fuck this what do you want I want you to have this conversation
    //println(setEx)
    // setEx.forEach { println(it) }
//    for (i in 0..9) {
//        for (j in i until 8) {
//            for (k in i .. j) {
//                println("k = $k")
//            }
//        }
//    }
//    val people = listOf(People("Ahmed"),
//        People("aya"),
//        People("ayman"))
//    people.map { it.personName }
//        .map { it.toUpperCase() }
//        .forEach{ println(it.reversed()) }
//    val morePeople = listOf(People("ayman"),
//        People("soad"),
//        People("Mohammed"))
//    val uniquePeople = people.union(morePeople)
//    //union let you combine all lists in one list without duplicates elements
//   // uniquePeople.forEach { println(it) }
//    people.forEachIndexed { index, people ->
//        //forEachIndexed let you use both index and element
//        println("index = $index, People = ${people.personName}")
//    }
    //Map
//    val newMap = mapOf("Ca" to "casablanca", "Ta" to "Tanger","Uk" to "United Kingdom")
//    val result1 = newMap.get("ca".capitalize()) //name your key to get your value
    //you can just print newMap("Ca")
    //also there is contains(key,value)
    //put with mutableMap to add
//    val result2 = newMap.getOrDefault("ca", "UNKNOWN_VALUE") //prefer to use this
//    val result3 = newMap.getOrElse("nr", { "try something else" })
    //this function allows you to get your key or do something else
    // val result4 = newMap.entries.forEach { println(it) }//you can print [keys = values] in a list
    //and with foreach you can print them without list
//    println(result1)
//    println(result2)
    //  println(result3)
    //println(result4)
//    val newMap1 = mutableMapOf("Ca" to "casablanca", "Ta" to "Tanger","Uk" to "United Kingdom")
//    val newResult1 = newMap1.put("hr","haram")
//    val newResult2 = newMap1.putIfAbsent("Ca","calcium")//helps you to avoid duplicate elements
//    val newResult3 = newMap1.getOrPut("ag",{"Agadir"})//checks if key is there, if not
    //print the key with its value
//    if(newMap1.any()){ //there "none" too
//        println(newMap1)
//    }else {
//        println("try")
//    }
//    val newResult4 = newMap1.filter { it.key.contains("Ca") }
//    println(newResult4)
//    measure {
//        val list = generateSequence (1) { it + 1 }
//            .take(55_444_355)
//            .toList() // create  list from seed to take (if it's by 1)
//        val result = list
//             .filter { it % 3 == 0 }
//            .average()
//        println("we done")
//        println(result)
//    }
//    val list = generateSequence (2) { it + 2 }
//       // .joinToString { println(it).toString() }
//        .take(55_444)
//        .toList() // create  list from seed to take (if it's by 1)
//        .filter { it % 2 == 0 }
    //       .average()
//        .absoluteValue
//    println(list)
//    println("we done")
//   val newMeasure = measure {
//        val newList = generateSequence (1) { it + 1  }
//            .take(20_000)
//            .toList()
//            .average()
    //println(newList)
    //println("we done")
    //  }
    ///  println(newMeasure)
//    val sayHi = sequence { yield("ahmed has to know")}
//    println(sayHi)
//    val newSequence = sequenceOf("ahmed","Amin", "omaima","aya")
//   // val printSequence = newSequence.joinToString { println(it).toString() }
////    val newList =  listOf<String>("ahmed","aya")
////    newList.joinToString { println(it).toString()  }
////        .filter {
////            println("hello: $it")
////            true
////        }
////        .forEach {
////            println("forEach: $it")
////        }
//    val newSequence1 = generateSequence(1) { it + 1 }
//        .take(200000)
//        .toList()
//    // I don't know why doesn't print anything, find out
//    measure {
//
//       // val newResult = newSequence1.filter { it % 3 == 0 }.average()
//       // println(newResult)
//    }
//    val newList = getListOfCustomers()
//    measure {
////        val newList1 = ints
//        val newTry = newList.asSequence()
//                            .filter { it % 3 == 0 }
//                            .average()
//      //  println(newTry)
//    }
//
//    measure {
//        val newSequence2 = sequenceOf("ahmed","ayman").take(20000)
//            .toList()
//        println(newSequence2)
//
//
    //  }
//    val list = listOf("newList","horse", true,534,83763)
//    //list can handle all types you can add <type> to put only one type of variables
//    val set = setOf("ahmed",334,true,"newSet",6.9,"ahmed")
//    //set can handle all types of variables, but it doesn't allow duplicates elements,also there is <>
//    val map = mapOf("ahmed" to 321,"Iman" to true, "Ayman" to "aya")
//    //map can handle all types of variables, and just for keys to values(pairs)
//    val sequence = sequenceOf("ahmed",34,true, "agemd").take(63535)
//    //sequence is for large operation of lists for good performance
//    val key: String? = "abdo"
    // println(key!!.length) //this will give you an error if it's null
    // println(key?.length)
    //println(requireNotNull(key,{"the key should not be null, but it was"}).length)
    //this will give you an error if it's null
    //lazy message tells what's wrong
    //  println(checkNotNull(key))//just like requireNotNull
    //!!: tells you trust me, threat key as non-nullable value, but you will have error if variable is null
    //?: for null safety
//    val name: Any = getAge("15")
//    val age: Int = name as Int
//    println(age)
//    val names: Any = getAge("29")
//    val ageFor: Int? = names as? Int //add "?" to type and as
// println(ageFor)
//    val name1 = "fatima"
//    val newName = name1.copy
//    println(newName)
//  val evenList = EvenList(listOf("ahmed",53435,45,34,"fatima"))
////  val newEvenList = EvenList(listOf(23,19,24,8))
////  val evenListOfString = EvenList<String> (listOf("ahmed","Ayman","hind","donkey","zahra"))
//////  //println(evenList.list)
//////    for (i in evenList.list) {
//////        println(i)
//////    }
////    println(evenList.items())
////    println(newEvenList.list)
////    println(evenListOfString.items())
//  val age = readln().toInt()
//  if(age < 18) {
//    throw Exception("you are not allowed")
//    //IllegalArgumentException also
//  }else {
//    println("you are allowed")
//  }
    // try{...} catch {..} or try finally for avoid errors
//    val name = "Ahmed Ibra"
//    println(name.initials())
//    println(name.getLength())

//   val name: shortWayDeclare by lazy {
//     //lazy evaluation execute the first code once, then print the last code when you called teh variable
//     println("Kotlin course")
//     sleep(30000)//Long-running operation,let you execute code after time of sleep
//     "Abdellatif"
//   }
//  println(name)
//  println(name)
//  val newExpensiveOperation =  lazy { expensiveOperation() }
//  println(newExpensiveOperation)
//  println("is Initialized:${newExpensiveOperation.isInitialized()}")
//  println(newExpensiveOperation.value)
//
//    val newEstimatedValue = "abdellatif"
//    println(newEstimatedValue.reversed())//reverse chars of string
//    //lambda function
//    val name : (Int) -> Int = {name1:Int -> name1.absoluteValue }
//    //lambda function is variables expression
//    //Syntax: val lambdaName: (InputType) -> returnType = { argument:InputType -> Body }
//    println(name)
//    val greeter: (String) -> String = { myName: String -> "hello $myName"}
//    val fullName: (String,String) -> String = { firstName: String,lastName: String -> "$firstName $lastName" }
//    //you can delete  (InputType) -> returnType
//    //every parameter should have its Type
//    //treated as function but shortWAy
//    // input type is not necessary inside the block(Parameter type)
//    //you can use println with toString
//    val newGreeter = greeter("Abdellatif")
//    println(newGreeter)
//    println(fullName("Hakim","Mounir"))
//    lagger {
//        println("message1")
//        println("message2")
//        println("message3")
//
//    }
//    val value = listOf("ayman","saad","aya","iman")
//    val randomValue = value.random()
//    println(randomValue)
//    val random = Random.nextUInt()
//    //random help you get random values but just for numbers
////    println(random)
//   try {
//       val randomValueAccess = RandomAccessFile("ahmed","rw")
//       println(randomValueAccess)
//   }catch (ex:Exception) {
//       println("you didn't catch it")
//  }
//    try {
//        println(3/0)
//    }catch (ex:Exception) {
//        println("try")
//    }
//    val list = listOf()
//    val array:Array<Number> = arrayOf<String>("sgd","agsf")
//    //array cannot be changed, you must resize it first with []
//    //array is limited
//    array[0] = "ahsg"
//        array.copyOf(5)
//        array[2] = "ahmed"
//  measure {
//      repeat(200000) {index ->
//          //sleep(1000)
//          println("this is $index")
//      }
//  }
//   for(i in 0..20) {
//       if(i % 2 == 0) {
//           println(i)
//       }
//   }
//    val num = listOf("aya","khadija","fatima")
//   // println(num.min())
//    println(num.sortedByDescending { it.length })//order of numbers from bigger to smaller
//    //sortedBy:order of numbers from smaller to bigger
// //how to merge lists excluding duplicate elements
// val list =listOf("ahmed","ayman","aya")
// val newList =listOf("ahmed","fatima",76)
// val allList = newList.plus(list).toSet()
// val subList = newList.subList(0,3)//sublist takes from index to index(size)
// //println(subList)
// //println(allList)
//  val hashList = list.hashCode()//just it gives you a random number
// println(hashList)
    val name: String? = null
    printer("ahmed")
}

fun printAny():Any{
    TODO("Not yet implemented")
}
fun <T> printer(value: T) {
    println(value)
}


//fun lagger(block: () -> Unit) {
//    repeat(2) { println("-----") }
//    block()
//    repeat(2) { println("-----") }
//
//}
//fun expensiveOperation() : Int {
//    println("start")
//    sleep(1000)
//    return Random(System.currentTimeMillis() ).nextInt()
//
//}
//class Video(val url: String) {
//    fun getViewrs():List<Customers> { //customers class come from another package
//        return listOf(Customers("ahmed"))
//    }
//}
//fun String.initials(): shortWayDeclare { //this function called extension function
//    //string(First type) means what you will insert in
//    //initials: name of function
//    //shortWayDeclare: output type
//  //extension functions are very useful
//    val values = this.split(' ')
//    val firstInitial = values[0].substring(0,1)
//    val lastInitial = values[1].substring(0,1)
//    return "$firstInitial$lastInitial"
//}
//fun String.getLength(): Int {
//    return this.length
//}
//fun getId(name: shortWayDeclare,id: Int) = println("$id")
//fun getAge(value: String): Any {
//    return when(value) {
//        "15" -> 99
//        "29" -> "hello there"
//        else -> true
//    }
//}
//data class People(val personName: String)
//class MyShopList (val items: List<String>)
//class NameOfChild( vararg nameOfFather: String) {
//    //vararg should be once in parameter without val or var
//}
//fun measure(block: () -> Unit) {
//    val nanoTime = measureNanoTime { block() }
//    val millis = TimeUnit.NANOSECONDS.toMillis(nanoTime)
//    println("$millis ms")
//}

//private val ints: List<Int> = generateSequence(1) { it + 1 }
//    .take(20000)
//    .toList()

//fun getListOfCustomers(): List<Int> {
//    return generateSequence(1) { it + 1 }
//        .take(20000)
//        .toList()
//}



