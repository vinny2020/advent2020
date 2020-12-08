import java.io.File


fun main(args: Array<String>) {
   val listOfNumbers = ArrayList<Int>()
   var right = 0
   File("src/main/resources/day01/puzzle01-input.txt").forEachLine { listOfNumbers.add(it.toInt())  }
   for (left in listOfNumbers) {
      right = 2020 - left
      if(listOfNumbers.contains(right)) {
         println("adding $left and $right to make 2020 whose product is ${left * right}" )
         break
      }

   }
}