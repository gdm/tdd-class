package com.xebia.university.tdd;

import org.junit.Test;

import static com.xebia.university.tdd.PrimeNumberChecker.isPrime;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

/**
 * @author iwein
 */
public class PrimeNumberCheckerTest {

  @Test
  public void shouldSay0IsNotPrime() {
    assertThat(isPrime(0), is(false));
  }

  @Test
  public void shouldSay1IsNotPrime() {
    assertThat(isPrime(1), is(false));
  }

  @Test
  public void shouldSay2IsPrime() {
      assertThat(isPrime(2), is(true));
  }

  @Test
  public void shouldSay3IsPrime() {
      assertThat(isPrime(3), is(true));
  }

  @Test
  public void shouldSay4IsNotPrime() {
      assertThat(isPrime(4), is(false));
  }

  @Test
  public void shouldSay5IsPrime() {
      assertThat(isPrime(5), is(true));
  }

  @Test
  public void shouldSay6IsNotPrime() {
      assertThat(isPrime(6), is(false));
  }

  @Test
  public void shouldSay7IsPrime() {
      assertThat(isPrime(7), is(true));
  }

  @Test
  public void shouldSay8IsNotPrime() {
      assertThat(isPrime(8), is(false));
  }

  @Test
  public void shouldSay9IsNotPrime() {
      assertThat(isPrime(9), is(false));
  }

  @Test
  public void shouldSay100IsNotPrime() {
      assertThat(isPrime(100), is(false));
  }

  @Test
  public void shouldSay104729IsPrime() {
      assertThat(isPrime(104729), is(true));
  }

  @Test
  public void shouldSay179426549IsPrime() {
      assertThat(isPrime(179426549), is(true));
  }

  @Test(expected = IllegalArgumentException.class)
  public void shouldRefuseNegativeNumbers() {
      assertThat(isPrime(-1), is(false));
  }































//  @Test
//  public void shouldSay2IsPrime() {
//    assertThat(PrimeNumberChecker.isPrime(2), is(true));
//  }
//
//  @Test
//  public void shouldSay4IsNotPrime() {
//    assertThat(PrimeNumberChecker.isPrime(4), is(false));
//  }
//
//  @Test
//  public void shouldSay6IsNotPrime() {
//    assertThat(PrimeNumberChecker.isPrime(6), is(false));
//  }
//
//  @Test
//  public void shouldSay9IsNotPrime() {
//    assertThat(PrimeNumberChecker.isPrime(9), is(false));
//  }
//
//  @Test
//  public void shouldSaySomePrimesArePrime() {
//    assertThat(PrimeNumberChecker.isPrime(13), is(true));
//    assertThat(PrimeNumberChecker.isPrime(29), is(true));
//    assertThat(PrimeNumberChecker.isPrime(97), is(true));
//  }
//
//  @Test(expected = IllegalArgumentException.class)
//  public void shouldRejectNegativeNumbers() {
//    PrimeNumberChecker.isPrime(-1);
//  }

}
