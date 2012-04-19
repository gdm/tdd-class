package com.xebia.university.tdd.enigma;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;


/**
 * This class is severely underdocumented.
 *
 * @author iwein
 */
public class EnigmaReflectorTest {
  @Test
  public void shouldTransform0to24() throws Exception {
     assertThat(new EnigmaReflector().transform(0), is(24));
  }

  @Test
  public void shouldTransform10to23() throws Exception {
     assertThat(new EnigmaReflector().transform(9), is(23));
  }
}
