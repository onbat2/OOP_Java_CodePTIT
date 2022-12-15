package j07030_cap_so_nguyen_to_trong_file_1;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class J07030_CAP_SO_NGUYEN_TO_TRONG_FILE_1 {
    public static boolean isPrime(long n){
        if(n < 2){
            return false;
        }
        for(int i = 2; i * i <= n; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream first_ois = new ObjectInputStream(new FileInputStream("DATA1.in"));
        List<Integer> list1 = (ArrayList<Integer>) first_ois.readObject();
        int a[] = new int [1000001];
        for(int i = 0; i < list1.size(); i++){
            int x = list1.get(i);
            if(isPrime(x)){
                a[x]++;
            }
        }
        ObjectInputStream second_ois = new ObjectInputStream(new FileInputStream("DATA2.in"));
        List<Integer> list2 = (ArrayList<Integer>) second_ois.readObject();
        for(int i = 2; i < 500000; i++){
            if(a[i] > 0){
                int x = 1000000 - i;
                if(isPrime(x) && list2.contains(x)){
                    System.out.println(i + " " + x);
                }
            }
        }
        first_ois.close();
        second_ois.close();
    }
}
