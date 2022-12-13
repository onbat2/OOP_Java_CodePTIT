package j07029_so_nguyen_to_lon_nhat_trong_file;
import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.util.List;
import java.util.ArrayList;

public class J07029_SO_NGUYEN_TO_LON_NHAT_TRONG_FILE {
    public static boolean isPrime(int n){
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
        ObjectInputStream m_ois = new ObjectInputStream(new FileInputStream("DATA.in"));
        List<Integer> list = (ArrayList<Integer>) m_ois.readObject();
        int[] a = new int [1000001];
        for(int i = 0; i < list.size(); i++){
            int x = list.get(i);
            if(isPrime(x)){
                a[x]++;
            }
        }
        int p = 0;
        for(int i = 1000000; i >= 2; i--){
            if(a[i] > 0){
                System.out.println(i + " " + a[i]);
                p++;
                if(p == 10){
                    break;
                }
            }
        }
        m_ois.close();
    }
}
