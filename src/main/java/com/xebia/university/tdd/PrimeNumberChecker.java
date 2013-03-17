package com.xebia.university.tdd;

import org.springframework.util.Assert;

import static java.lang.Math.floor;
import static java.lang.Math.sqrt;

/**
 * Checks if a number a prime.
 *
 * @author iwein
 */
public class PrimeNumberChecker {


  public static Boolean isPrime(int potentialPrime) {
    Assert.isTrue(potentialPrime >= 0, "I don't accept negative numbers");

    if (potentialPrime < 2) return false;

    for (int i = 2; i <= floor(sqrt(potentialPrime)); i++) {
      if (isDivisibleBy(i, potentialPrime)) {
        return false;
      }
    }

    return true;
  }

  private static boolean isDivisibleBy(int factor, int potentialPrime) {
    return potentialPrime > factor  && potentialPrime % factor == 0;
  }
}
