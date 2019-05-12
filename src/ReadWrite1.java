import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;


public class ReadWrite1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj nazwę pliku: ");

        String inFileName = sc.next();
        File file = new File(inFileName);

        if (file.exists() && !file.isDirectory()) {
            System.out.println(" Plik istnieje");
        } else
            System.out.println("Plik nie istnieje");


    }
}

