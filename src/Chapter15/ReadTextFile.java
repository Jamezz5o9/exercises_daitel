package Chapter15;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ReadTextFile {

    public static void main(String[] args) {
        try(Scanner input = new Scanner(Paths.get("clients.txt"))){
            System.out.printf("%-10s%-12s%-12s%10s%n", "Account",
                    "FirstName", "Surname", "Balance");
            while(input.hasNext()){
                System.out.printf("%-10d%-12s%-12s%10.2f%n", input.nextInt(),
                        input.next(), input.next(), input.nextDouble());
            }

        }catch(NoSuchElementException | IOException | IllegalStateException e){
            e.printStackTrace();

        }

//          try(FileInputStream fileInputStream = new FileInputStream("clients.txt");){
//              byte[] byt = new byte[fileInputStream.available()];
//
//              fileInputStream.read(byt);
//
//              for(byte b : byt){
//                  System.out.write(b);
//              }
//              System.out.flush();
//
//          }catch (IOException e){
//              e.printStackTrace();
//          }

    }
}
