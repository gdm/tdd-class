package com.xebia.university.tdd.enigma;

/**
 * This class is severely underdocumented.
 *
 * @author iwein
 */
public class Rotor implements EnigmaTransformer {
  private final String rightAlphabet;
  private final String leftAlphabet;
  private final EnigmaTransformer nextTransformer;

  public Rotor(String rightAlphabet, String leftAlphabet, EnigmaTransformer nextTransformer) {
    this.rightAlphabet = rightAlphabet;
    this.leftAlphabet = leftAlphabet;
    this.nextTransformer = nextTransformer;
  }

  @Override
  public int transform(int i) {
    int forwardOutput = leftAlphabet.indexOf(rightAlphabet.charAt(i));
    int backwardInput = nextTransformer.transform(forwardOutput);
    return rightAlphabet.indexOf(leftAlphabet.charAt(backwardInput));
  }

  @Override
  public EnigmaTransformer rotate(int offset) {
    return new Rotor(shiftedAlphabet(this.rightAlphabet, offset), shiftedAlphabet(this.leftAlphabet, offset), nextTransformer);
  }

  private String shiftedAlphabet(String alphabet, int offset) {
    return alphabet.substring(offset) + alphabet.substring(0, offset);
  }
}
