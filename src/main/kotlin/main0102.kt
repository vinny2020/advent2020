import java.io.File


   fun main(args: Array<String>) {
      val listOfThreeNumbers = ArrayList<Int>()
      var right = 0
      File("src/main/resources/day01/puzzle01-input.txt").forEachLine { listOfThreeNumbers.add(it.toInt())  }
      for (left in listOfThreeNumbers) {
         for (middle in listOfThreeNumbers) {
            right = 2020 - left - middle
            if(listOfThreeNumbers.contains(right)) {
               println("adding $left, $middle  and $right to make 2020 whose product is ${left * middle *  right}" )
               break
            }

         }



      }
   }

