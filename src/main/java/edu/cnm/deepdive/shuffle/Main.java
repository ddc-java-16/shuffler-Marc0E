package edu.cnm.deepdive.shuffle;

import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    int [] data = new int[100];
    for (int i = 0; i < data.length; i++){
      data[i] = 100 + i;
    }
    System.out.println(Arrays.toString(data));
    Shuffler shuffler = new Shuffler();
    shuffler.shuffle(data);
    System.out.println(Arrays.toString(data));

  }

}
