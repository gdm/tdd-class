package com.xebia.university.tdd.enigma;

/**
 * This class is severely underdocumented.
 *
 * @author iwein
 */
public class Enigma {
  private final EnigmaTransformer[] transformers;

  public Enigma(EnigmaTransformer... transformers) {
    this.transformers = transformers;
  }

  public static Enigma withTransformers(EnigmaTransformer...transformers) {
    return new Enigma(transformers);
  }

  public String transform(String s) {
    return s;
  }
}
