package com.letgetitstarted.testing;

public class FizzBuzz {

    public String doFizzBuzz(int number) {

        if(number == 0) throw new RuntimeException("Number must not be 0");
        if(number % 3 == 0 && number % 5 == 0) return "FizzBuzz";
        if(number % 3 == 0) return "Fizz";
        if(number % 5 == 0) return "Buzz";

        return String.valueOf(number);
    }
}
