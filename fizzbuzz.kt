fun main() {
    fizzbuzz(100)
}

fun fizzbuzz(max: Int = 100) {
    for(i in 0 until max) {
       val text = if (i % 15 == 0) {
           "FizzBuzz"
       } else if (i % 3 == 0) {
           "Fizz"
       } else if (i % 5 == 0) {
           "Buzz"
       } else {
           i
       }
       
       println(text)
    }
}