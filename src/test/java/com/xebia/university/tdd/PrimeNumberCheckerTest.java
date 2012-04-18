package com.xebia.university.tdd;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * This class is severely underdocumented.
 *
 * @author iwein
 */
public class PrimeNumberCheckerTest {

  @Test
  public void shouldSay1IsPrime() {
      assertThat(PrimeNumberChecker.isPrime(1), is(true));
  }

  @Test
  public void shouldSay2IsPrime() {
    assertThat(PrimeNumberChecker.isPrime(2), is(true));
  }

  @Test
  public void shouldSay4IsNotPrime() {
    assertThat(PrimeNumberChecker.isPrime(4), is(false));
  }

  @Test
  public void shouldSay6IsNotPrime() {
    assertThat(PrimeNumberChecker.isPrime(6), is(false));
  }

  @Test
  public void shouldSay9IsNotPrime() {
    assertThat(PrimeNumberChecker.isPrime(9), is(false));
  }

  @Test
  public void shouldSaySomePrimesArePrime() {
    assertThat(PrimeNumberChecker.isPrime(13), is(true));
    assertThat(PrimeNumberChecker.isPrime(29), is(true));
    assertThat(PrimeNumberChecker.isPrime(97), is(true));
  }
  
  @Test(expected = IllegalArgumentException.class)
  public void shouldRejectNegativeNumbers() {
    PrimeNumberChecker.isPrime(-1);
  }

  @Test
  public void letsSeeHowWeDealWithIntegerOverflow() {
    assertThat(PrimeNumberChecker.isPrime(Integer.MAX_VALUE - 3), is(false));
  }

}
