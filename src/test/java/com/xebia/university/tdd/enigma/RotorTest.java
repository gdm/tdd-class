package com.xebia.university.tdd.enigma;

import org.junit.Test;

import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * This class is severely underdocumented.
 *
 * @author iwein
 */
public class RotorTest {

  @Test
  public void rotorIIIshouldMap0to2() {
    EnigmaTransformer transformerMock = mock(EnigmaTransformer.class);
    given(transformerMock.transform(2)).willReturn(2);

    Rotor rotorIII = new Rotor("BDFHJLCPRTXVZNYEIWGAKMUSQO", Enigma.realAlphabet, transformerMock);
    rotorIII.rotate(1).transform(0);
    verify(transformerMock).transform(2);
  }
}
