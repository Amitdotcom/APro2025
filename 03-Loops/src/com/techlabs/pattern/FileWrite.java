package com.techlabs.pattern;

import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {
  public static void main(String[] args) throws IOException {
    try {
    FileWriter file = new FileWriter("C:\\Batches\\text.txt");
    try {
      file.write("java is besttttttttt");
      
    }
    finally
    {
      file.close();
    }
    System.out.println("Successfully written ");
    }
    catch(IOException e)
    {
      System.out.println(e);
    }

  }    
}