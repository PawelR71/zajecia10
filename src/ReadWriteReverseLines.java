import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

//Napisz program, który czyta plik podany przez uzytkownika i zapisze jego linie w odwrotnej kolejnosci do pliku wynik.txt

public class ReadWriteReverseLines {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj nazwę pliku: ");

        String inFileName = sc.next();

        List<String> lineFromFile = Files.readAllLines(Paths.get(inFileName));

        try(BufferedWriter bw = new BufferedWriter(new FileWriter("fileReverseLines.txt"))) {
            
            for (int i = lineFromFile.size() - 1 ; i >= 0 ; i--) {
                
                bw.append(lineFromFile.get( i )).append("\r\n");
                
            }

            bw.flush();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

