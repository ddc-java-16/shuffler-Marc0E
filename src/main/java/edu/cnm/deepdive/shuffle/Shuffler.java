package edu.cnm.deepdive.shuffle;

import java.security.SecureRandom;
import java.util.Random;

public class Shuffler {

  private static final String EMPTY_ARRAY_MESSAGE = "Array must be not null or empty";
  private final Random rng; //final mean the value won't change, private mean it won be visible to external code

  public Shuffler() {
    rng = new SecureRandom();
  }
  //Random rng = new SecureRandom(); I move this to a constructor with option+return

  /**
   * Shuffles the {@code data} <code>data</code> data array in-place. This method uses the Fisher-Yates shuffle algorithm to
   * shuffle an {@code int[]}.
   * @param data Unshuffled {@code int[]} source.
   * @throws IllegalArgumentException If {@code data} is {@code null} or empty.
   */
  public void shuffle(int[] data) throws IllegalArgumentException {
    if (data == null || data.length == 0) {
      throw new IllegalArgumentException(EMPTY_ARRAY_MESSAGE);
    }
    for (int destPos = data.length - 1; destPos >= 1; destPos--) {
      int srcPos = rng.nextInt(destPos + 1);
      if (destPos != srcPos) {
        int temp = data[destPos];
        data[destPos] = data[srcPos];
        data[srcPos] = temp;
      }
    }
  }
}

