package com.xebia.university.tdd.enigma;

import org.junit.Test;

import static com.xebia.university.tdd.enigma.Enigma.realAlphabet;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class EnigmaAcceptanceTest {
  private EnigmaTransformer reflector = new EnigmaReflector();
  private EnigmaTransformer rotorI = new Rotor("EKMFLGDQVZNTOWYHXUSPAIBRCJ", realAlphabet, reflector);
  private EnigmaTransformer rotorII = new Rotor("AJDKSIRUXBLHWTMCQGZNPYFVOE", realAlphabet, rotorI);
  private EnigmaTransformer rotorIII = new Rotor("BDFHJLCPRTXVZNYEIWGAKMUSQO", realAlphabet, rotorII);

  @Test
  public void shouldRevealEnigma() {
    Enigma enigma = Enigma.withTransformer(rotorIII);
    assertThat(enigma.transform("ENIGMAREVEALED"), is("FQGAHWNYNCKRLF"));
  }
}
