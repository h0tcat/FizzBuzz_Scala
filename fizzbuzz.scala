object fizzbuzz extends App{
    def judge(n:Int)={
        if(n % 15 == 0) "FizzBuzz"
        else if(n % 3 == 0) "Fizz"
        else if(n % 5 == 0) "Buzz"
        else n
    }
    lazy val value = 1 to 30
    value.foreach{n:Int=>println(judge(n))}
}