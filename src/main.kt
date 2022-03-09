fun main(){
    var f= arrayOf("Hilda", "Nadine","Verite", "Misky")
    println(f.contentToString())
    cities(arrayOf("harare","mumbai", "dodoma", "Jakarta"))
    numbers(arrayOf(17,4,213,78,43,90,31,3,73,11,158,62))
    list(arrayOf("Sangwa","Cadeau","Nadege","Bruno"))

 }
fun words(names:Array<String>){
    var f= names
    println(f)
}
fun cities( words: Array<String>){
    words.forEach { words ->
        println(words.capitalize())
    }

}
fun numbers(numbers:Array<Int>){
    var sum = numbers[2] + numbers[5]
    println(sum)
    println(numbers.indexOf(158))
    println(numbers.sortedArray().contentToString())

}
fun list(people:Array<String>):Array<String>{
    var x = (people)
    println(people.contentToString())
    return x

 }

