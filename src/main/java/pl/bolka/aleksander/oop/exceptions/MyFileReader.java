package pl.bolka.aleksander.oop.exceptions;

import java.io.*;

public class MyFileReader {

  public void readFileWithNormalTry(){
    String inputPath = "/home/abolka/Projects/Szkolenia/Java-zaawansowana/projects/Java-zaawansowana-OOP";
    BufferedReader fileReader = null;
    try {
      fileReader = new BufferedReader(new FileReader(inputPath));
      fileReader.readLine();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      if (fileReader != null) {
        try {
          fileReader.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
    }
  }

  public void readFileWithTryWithResources(){
    String inputPath = "/home/abolka/Projects/Szkolenia/Java-zaawansowana/projects/Java-zaawansowana-OOP";
    try(BufferedReader fileReader = new BufferedReader(new FileReader(inputPath))) {
      fileReader.readLine();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

}
