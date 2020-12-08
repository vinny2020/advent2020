import java.io.File


   fun main(args: Array<String>) {

      var validPasswords = 0
      File("src/main/resources/day02/puzzle-day2-input.txt").forEachLine {
         //println(it)
         val tokensday2 = it.split(" ")
         val ruleSet = tokensday2[0]
         val needle = tokensday2[1].split(":")[0].toCharArray(startIndex = 0, endIndex = 1)
         val needleCh :Char  = needle[0]
         val haystack = tokensday2[2]
         val firstValid = ruleSet.split("-")[0].toInt()
         val secondValid = ruleSet.split("-")[1].toInt()
         println("First position: $firstValid second position: $secondValid for this char $needleCh for this text $haystack")
         if( haystack[firstValid -1 ] == needleCh && haystack[secondValid -1 ] != needleCh
            ||
            haystack[secondValid -1 ] == needleCh && haystack[firstValid -1 ] != needleCh    ) {
            validPasswords++
         }
      }
      println("valid Passwords are: $validPasswords")

      }


