package hellofile;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class HELLOFILE {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("Hello.txt");
        Scanner scanner = new Scanner(file);
        while(scanner.hasNextLine()){
            System.out.println(scanner.nextLine());
        }
    }
}