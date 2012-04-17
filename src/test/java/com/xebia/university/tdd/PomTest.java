package com.xebia.university.tdd;

import org.hamcrest.Matcher;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class PomTest {

  @Test
  public void librariesShouldBeAvailable() {
    Matcher<String> isOnTheClassPath = is("Mockito");
    assertThat("Mockito", isOnTheClassPath);
  }


}
