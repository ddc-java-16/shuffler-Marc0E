package edu.cnm.deepdive.shuffle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {

  public static void main(String[] args) {

    int[] data = parseCommandLine(args); //TODO Change to parseInputStream();
    System.out.println(Arrays.toString(data));
    Shuffler shuffler = new Shuffler();
    shuffler.shuffle(data);
    System.out.println(Arrays.toString(data));

  }

  private static int[] parseCommandLine(String[] args) {
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
    return data;
  }

  private static int[] parseStandardInput() throws IOException {
    List<Integer> data = new LinkedList<>();
    Reader reader = new InputStreamReader(System.in);
    BufferedReader buffer = new BufferedReader(reader);
    String input;
    try {
      while ((input = buffer.readLine()) != null){
        int value = Integer.parseInt(input.strip());//Strip remove spaces
        data.add(value);
      }
    } catch (NumberFormatException e) {
      System.err.printf("Parsing failed %s%n", e.getMessage());
    }

    int [] result = new int[data.size()];
    int position = 0;
    for (int value : data){
      result[position ++] = value;

    }
    return  result;
//    for(String input = buffer.readLine(); input != null; input = buffer.read()){
//
//    } other for to do the while
  }

}
