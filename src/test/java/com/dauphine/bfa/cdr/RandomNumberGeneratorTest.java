package com.dauphine.bfa.cdr;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by yuyan_gan on 10/01/2018.
 */
public class RandomNumberGeneratorTest {

    @Test
    public void should_generate_a_random_number() {
        final double number = RandomNumberGenerator.generateRandomNumber();

        assertRandomNumberIsNotZero(number);
    }

    @Test
    public void should_generate_a_random_number_array_for_pair_size() {
        final double[] numbers = RandomNumberGenerator.generateRandomNumberArray(10);

        assertTrue(numbers.length == 10);

        for (double number : numbers) {
            assertRandomNumberIsNotZero(number);
        }
    }

    @Test
    public void should_generate_a_random_number_array_for_impair_size() {
        final double[] numbers = RandomNumberGenerator.generateRandomNumberArray(11);

        assertTrue(numbers.length == 11);

        for (double number : numbers) {
            assertRandomNumberIsNotZero(number);
        }
    }


    private void assertRandomNumberIsNotZero(final double number) {
        assertTrue(number != 0d);
    }
}
