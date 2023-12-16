package filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class Createfile {

  public static void main(String[] args) {
    File myfile = new File("myFile.txt");
    try {
      if (myfile.createNewFile()) {
        System.out.println("file created : " + myfile.getName());
      } else {
        System.out.println("file already exists");
      }
    } catch (IOException e) {
      System.out.println("an error occurred.");
    }

    // CREATE A FILE in a different directory
    File myOther = new File(
      "/home/briankaboyi/Code/java/filehandling/testfolder/otherfiles.md"
    ); //specify the full path
    try {
      if (myOther.createNewFile()) {
        System.out.println("file created: " + myOther.getName());
      } else {
        System.out.println("file already exists");
      }
    } catch (IOException e) {
      System.out.println("an error occurred");
    }

    // creating and writing a file
    try {
      FileWriter mywritter = new FileWriter(
        "/home/briankaboyi/Code/java/filehandling/testfolder/otherfiles.txt"
      );
      mywritter.write("this is some sample text");
      mywritter.close();
      System.out.println("Successfully wrote to the file");
    } catch (IOException e) {
      System.out.println("something went wrong");
    }

    //write an existing file
    System.out.println(myOther); //myother already created
    try {
      FileWriter readyfile = new FileWriter(myOther);
      readyfile.write("just testing out writting to an existing file");
      readyfile.close();
    } catch (IOException e) {
      System.out.println("something really went wrong");
    }
    //read from a file
    try {
      Scanner myReader = new Scanner(myOther);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        System.out.println(data);
      }
      myReader.close();
    } catch (IOException e) {
      System.out.println("smthn went wrong, couldn't read");
    }
    // get file information
    if(myOther.exists()){
        System.out.println("file name: " + myOther.getName());
        System.out.println("absolute path: " + myOther.getAbsolutePath());
        System.out.println("writable: " + myOther.canWrite());
        System.out.println("readerble: " + myOther.canRead());
        System.out.println("file size in bytes: " + myOther.length());
    }else{
        System.out.println("the file does not exist");
    }
  }
}
