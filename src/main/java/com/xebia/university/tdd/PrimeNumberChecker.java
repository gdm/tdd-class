package com.xebia.university.tdd;

/**
 * Checks if a number a prime.
 *
 * @author iwein
 */
public class PrimeNumberChecker {

  public static boolean isPrime(int number) {
    if(number < 0) throw new IllegalArgumentException("Negative number cannot be prime");
    for(int i = 2; i<number; i++) {
      if (number % i == 0) return false;
    }
    return true;
  }
}
