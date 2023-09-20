package edu.cnm.deepdive.shuffle;

import java.util.Arrays;

public class Main {

  public static void main(String[] args) {

    int [] data = new int[args.length];
    int i = 0;
    try {
      for (i =0;i< args.length;i++){
        data[i] = Integer.parseInt(args[i]);
      }
    } catch (NumberFormatException e) {
      //System.out.println(e.getMessage());other option down
      System.err.printf("Parsing failed %s%n", e.getMessage());
    }
    data = Arrays.copyOf(data, i);
    System.out.println(Arrays.toString(data));
    Shuffler shuffler = new Shuffler();
    shuffler.shuffle(data);
    System.out.println(Arrays.toString(data));

  }

}
