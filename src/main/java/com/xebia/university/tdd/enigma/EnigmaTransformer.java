package com.xebia.university.tdd.enigma;

/**
 * This class is severely underdocumented.
 *
 * @author iwein
 */
public interface EnigmaTransformer {
  int transform(int i);

  EnigmaTransformer rotate(int offset);
}
