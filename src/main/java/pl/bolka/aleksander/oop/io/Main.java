package pl.bolka.aleksander.oop.io;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class Main {

  public static final String PATH = "/home/abolka/Projects/Szkolenia/Java-zaawansowana/projects/Java"
                           + "-zaawansowana-OOP/src/main/resources/";

  public static void main(String[] args) {
    // IO
    // bajty
    copyFileByBytesBase();
    copyFileByBytes();

    // znaki
//    copyFileBySign();

    // bufory
//    copyFileByBuffers();

    // file
//    file();

    // NIO
//    copyFileWithFiles();
//    filesOperations();
//    readAndWriteWithFiles();

    //save and read objects
//    saveUserToFile();
//    readUserFromFile();
  }

  private static void copyFileByBytesBase() {
    InputStream in = null;
    OutputStream out = null;

    try {
      in = new FileInputStream(PATH + "text.txt");
      out = new FileOutputStream(PATH + "text_copy.txt");
      int c;
      while ((c = in.read()) != -1) {
        out.write(c);
      }
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      if (in != null) {
        try {
          in.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
      if (out != null) {
        try {
          out.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
    }
  }

  private static void copyFileByBytes() {
    try (InputStream in = new FileInputStream(PATH + "text.txt");
         OutputStream out = new FileOutputStream(PATH + "text_copy.txt")){
      int c;
      while ((c = in.read()) != -1) {
        out.write(c);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  private static void copyFileBySign() {
    try (Reader in = new FileReader(PATH + "text.txt");
         Writer out = new FileWriter(PATH + "text_copy.txt")){
      int nextChar;
      while ((nextChar = in.read()) != -1) {
        out.append((char) nextChar);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  private static void copyFileByBuffers() {
    try (BufferedReader in = new BufferedReader(new FileReader(PATH + "text.txt"));
         BufferedWriter out = new BufferedWriter(new FileWriter(PATH + "text_copy.txt"))) {
      String line;
      while ((line = in.readLine()) != null) {
        out.write(line);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  private static void copyFileWithFiles() {
    Path path = Path.of(PATH + "text.txt");
    try {
      Files.copy(path,Path.of(PATH + "text_copy.txt"));
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  private static void file() {
    File file = new File(PATH + "text.txt");
    try {
      InputStream formFile = new FileInputStream(file);
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
  }

  private static void filesOperations() {
    Path path = Path.of(PATH + "text.txt");
    boolean directory = Files.isDirectory(path);
    boolean executable = Files.isExecutable(path);
    try {
      Files.copy(path,Path.of(PATH + "text_copy.txt"));
      Files.move(Path.of(PATH + "text_copy.txt"), Path.of(PATH + "text_copy2.txt"));
      Files.delete(Path.of(PATH + "text_copy2.txt"));
      Files.createDirectory(Path.of(PATH + "newDir"));
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  private static void readAndWriteWithFiles() {
    try {
      byte[] bytes = Files.readAllBytes(Path.of(PATH + "text.txt"));
      List<String> strings = Files.readAllLines(Path.of(PATH + "text.txt"));
      Path of = Path.of(PATH + "text_copy3.txt");
      Files.createFile(of);
      Files.write(of, strings, StandardOpenOption.APPEND);
      Files.write(of, strings, StandardOpenOption.APPEND);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  private static void saveUserToFile() {
    try {
      User janek = new User("Janek", 22);
      FileOutputStream fileOutputStream = new FileOutputStream(PATH + "janek.txt");
      ObjectOutputStream out = new ObjectOutputStream(fileOutputStream);
      out.writeObject(janek);
      out.flush();
      out.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  private static void readUserFromFile() {
    try {
      FileInputStream fileIn = new FileInputStream(PATH + "janek.txt");
      ObjectInputStream in = new ObjectInputStream(fileIn);
      User janek = (User) in.readObject();
      in.close();
      fileIn.close();
      System.out.println(janek);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
