fun main(args: Array<String>) {
   val date1 = Date()
   println("The current date:")
   toString(date1)

   println("\nThe list of the invalid dates:")
   val listDate = mutableListOf<Date>()
   var i = 0

   while(i < 10)
   {
      var date2 = Date (year = (1500..2030).random(), month = (0..15).random(), day = (0..40).random())
      if(isValid(date2))
      {
         listDate.add(date2)
         i = i+1
      }
      else
      {
         toString(date2)
      }
   }

   println("\nThe list of the valid dates:")
   listDate.forEach {
      toString(it)
   }

   println("\nThe sorted list:   ASC")
   listDate.sorted().forEach { toString(it) }

   println("\nThe sorted list:   DESC")
   listDate.sortedDescending().forEach { toString(it) }

   println("\nThe sorted list by year:")
   val orderDate = Comparator { date2: Date, date3: Date -> date2.year - date3.year}
   listDate.sortedWith(orderDate).forEach{ toString(it)}}

