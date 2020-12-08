import java.io.File


   fun main(args: Array<String>) {

      var validPasswords = 0
      File("src/main/resources/day02/puzzle-day2-input.txt").forEachLine {
         //println(it)
         val tokens = it.split(" ")
         val ruleSet = tokens[0]
         val needle = tokens[1].split(":")[0].toCharArray(startIndex = 0, endIndex = 1)
         val needleCh :Char  = needle[0]
         val haystack = tokens[2]
         val minOccurrence = ruleSet.split("-")[0].toInt()
         val maxOccurrence = ruleSet.split("-")[1].toInt()
         val count = haystack.filter { it == needleCh }.count()
         println("Rule Min: $minOccurrence Rule Max: $maxOccurrence for this char $needleCh for this text $haystack, count $count")
         if(count in minOccurrence..maxOccurrence) {
            validPasswords++
         }
      }
      println("valid Passwords are: $validPasswords")

      }


