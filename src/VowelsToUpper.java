import javax.print.attribute.SetOfIntegerSyntax;
import java.io.*;
import java.util.*;
//
//        Napisz program, który odczyta plik podany przez uzytkownika,
//        zamieni wszystkie samogloski na wielkie litery i zapisze wynik do pliku 2.txt

public class VowelsToUpper {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj nazwę pliku, który chcesz otworzyć: ");

        String inFileName = sc.next();

        String line;
        StringBuilder sb = new StringBuilder();

        Set<Character> vowels = new HashSet<>(Arrays.asList('a','e','y','i','o','u','A','E','Y','I','O','U'));

        try (BufferedReader br = new BufferedReader(new FileReader(inFileName))) {

            while ((line = br.readLine()) != null) {

                for (char c : line.toCharArray()) {
                    if (vowels.contains(c)){
                        c = Character.toUpperCase(c);
                    }
                    sb.append(c);
                }
                    sb.append("\r\n");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try(BufferedWriter bw = new BufferedWriter( new FileWriter("file2.txt"))){

            bw.append(sb.toString());
            bw.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
