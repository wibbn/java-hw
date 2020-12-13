package lab8;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer num = sc.nextInt();
        String s;// = sc.nextLine();

        if (num == 1 || num == 3){
            try(FileWriter writer = new FileWriter("test.txt", false)) {
                s = sc.nextLine();
                writer.write(s);
                writer.append("\n");
            } catch(IOException e){
                System.out.println(e.getMessage());
            }
        }
        else if (num == 2){
            try(FileReader reader = new FileReader("test.txt")) {
                int c;
                while ((c = reader.read()) != -1){
                    System.out.printf("%c", (char)c);
                }
                System.out.println();
            } catch (IOException e){
                System.out.println(e.getMessage());
            }
        }
        else if (num == 4){
            try(FileWriter writer = new FileWriter("test.txt", true)) {
                s = sc.nextLine();
                writer.write(s);
                writer.append("\n");
                writer.flush();
            } catch(IOException e){
                System.out.println(e.getMessage());
            }
        }
    }
}