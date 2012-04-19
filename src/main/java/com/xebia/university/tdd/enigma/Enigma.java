package com.xebia.university.tdd.enigma;

/**
 * This class is severely underdocumented.
 *
 * @author iwein
 */
public class Enigma {
  public static String realAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

  private final EnigmaTransformer transformer;

  public Enigma(EnigmaTransformer transformer) {
    this.transformer = transformer;
  }

  public static Enigma withTransformer(EnigmaTransformer transformer) {
    return new Enigma(transformer);
  }

  public String transform(String s) {
    StringBuilder builder = new StringBuilder(s.length());
    for (int i=0; i<s.length(); i++) {
      builder.append(realAlphabet.charAt(transformer.rotate(1).transform(realAlphabet.indexOf(s.charAt(i)))));
    }
    return builder.toString();
  }
}
