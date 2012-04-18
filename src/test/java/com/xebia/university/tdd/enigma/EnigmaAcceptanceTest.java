package com.xebia.university.tdd.enigma;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class EnigmaAcceptanceTest {
  private EnigmaTransformer rotorI;
  private EnigmaTransformer rotorII;
  private EnigmaTransformer rotorIII;
  private EnigmaTransformer reflector;

  @Test
  public void shouldRevealEnigma() {
    Enigma enigma = Enigma.withTransformers(rotorI, rotorII, rotorIII, reflector);
    assertThat(enigma.transform("QMJIDO MZWZJFJR"), is("ENIGMA REVEALED"));
  }
}
