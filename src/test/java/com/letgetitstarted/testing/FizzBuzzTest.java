package com.letgetitstarted.testing;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @Before
    public void setUp() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void testNumber() {
        String fb = fizzBuzz.doFizzBuzz(1);
        assertThat(fb).isEqualTo("1");
    }

    @Test
    public void testFizz() {
        String fizz = fizzBuzz.doFizzBuzz(3);
        assertThat(fizz).isEqualTo("Fizz");
    }

    @Test
    public void testBuzz() {
        String buzz = fizzBuzz.doFizzBuzz(5);
        assertThat(buzz).isEqualTo("Buzz");
    }

    @Test
    public void testFizzBuzz() {
        String fb = fizzBuzz.doFizzBuzz(15);
        assertThat(fb).isEqualTo("FizzBuzz");
    }

    @Test(expected = RuntimeException.class)
    public void testFizzBuzzZeroNumber() {
        fizzBuzz.doFizzBuzz(0);
    }
}
