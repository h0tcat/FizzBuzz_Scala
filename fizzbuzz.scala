
object fizzbuzz extends App{
    var min,max :Int=_;
    min=1;
    max=99;

    for(loop <- min to max){
        val fizzbuzz_count=if(loop % 3== 0 && loop % 5==0) "FizzBuzz" else if(loop % 3==0) "Fizz" else if(loop % 5==0) "Buzz" else loop;
        println(fizzbuzz_count);
    }
}