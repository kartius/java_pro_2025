package org.lessons.lesson_10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {


  public static void main(String[] args) throws IOException {
    File file = new File("Test.txt");
    System.out.println(file.getPath());
    System.out.println(file.getAbsolutePath());
    System.out.println(file.getName());
    file.createNewFile();


    //1
//    FileInputStream fis = null;
//    try {
//      fis = new FileInputStream(file);
//      int i;
//      while ((i = fis.read()) != -1) {
//        System.out.println((char) i);
//      }
//    } catch (IOException e) {
//      throw new RuntimeException(e);
//    } finally {
//      fis.close();
//    }

//2

//    try (FileInputStream fis = new FileInputStream(file)) {
//      int i;
//      while ((i = fis.read()) != -1) {
//        System.out.println((char) i);
//      }
//    } catch (IOException e) {
//      throw new RuntimeException(e);
//    }

  //3

//     try (FileReader fis = new FileReader(file)) {
//      int i;
//      while ((i = fis.read()) != -1) {
//        System.out.println((char) i);
//      }
//    } catch (IOException e) {
//      throw new RuntimeException(e);
//    }

//4
//    try (BufferedReader br = new BufferedReader(new FileReader(file))) {
//      int i;
//      while ((i = br.read()) != -1) {
//        System.out.println((char) i);
//      }
//    } catch (IOException e) {
//      throw new RuntimeException(e);
//    }

//5
//    try (BufferedReader br = new BufferedReader(new FileReader(file))) {
//      String i;
//      while ((i = br.readLine()) != null) {
//        System.out.println(i);
//      }
//    } catch (IOException e) {
//      throw new RuntimeException(e);
//    }

 //6
//    try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))) {
//      bw.newLine();
//      bw.write("tetstsetstsetes11111");
//    } catch (IOException e) {
//      throw new RuntimeException(e);
//    }

 //7
    try (PrintWriter pw = new PrintWriter(file)) {
//      pw.println("tetetete2222");
//      pw.append("dfdfdgdfgfdgfd");
      pw.write("dfdfgfdg2343243423");
    } catch (IOException e) {
      throw new RuntimeException(e);
    }


  }
}
