package edu.cnm.deepdive.shuffle;

import java.security.SecureRandom;
import java.util.Random;

public class Shuffler {

 private final Random rng; //final mean the value won't change, private mean it won be visible to external code

  public Shuffler() {
    rng = new SecureRandom();
  }
  //Random rng = new SecureRandom(); I move this to a constructor with option+return

  public void shuffle(int[] data) {
    for (int destPos = data.length - 1; destPos >= 1; destPos--) {
      // TODO Complete the steps to select and swap a random element with element destPos.
      int srcPos = rng.nextInt(destPos + 1);
      if (destPos != srcPos) {
        int temp = data[destPos];
        data[destPos] = data[srcPos];
        data[srcPos] = temp;
      }
    }
  }
}

