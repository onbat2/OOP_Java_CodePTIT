package j07002_tinh_tong;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class J07002_TINH_TONG {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("DATA.in"));
            Long sum = 0L;
            while (sc.hasNext()){
                try {
                    int x = Integer.parseInt(sc.next());
                    sum += x;
                } catch (Exception e){
                    continue;
                }
            }
            System.out.println(sum);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
