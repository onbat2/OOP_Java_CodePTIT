package j07032_so_thuan_nghich_trong_file;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class J07032_SO_THUAN_NGHICH_TRONG_FILE {
    public static boolean check(String s){
        if(s.length() < 2 || s.length() % 2 == 0){
            return false;
        }
        for(int i = 0; i <= s.length()/2; i++){
            if(s.charAt(i) != s.charAt(s.length() - i - 1)){
                return false;
            }
        }
        return true;
    }
    
    public static boolean isOddNum(int n){
        while(n > 0){
            int a = n % 10;
            if(n % 2 == 0){
                return false;
            }
            n /= 10;
        }
        return true;
    }
    
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        ObjectInputStream first_ois = new ObjectInputStream(new FileInputStream("DATA1.in"));
        List<Integer> list1 = (ArrayList<Integer>) first_ois.readObject();
        ObjectInputStream second_ois = new ObjectInputStream(new FileInputStream("DATA2.in"));
        List<Integer> list2 = (ArrayList<Integer>) second_ois.readObject();
        
        int a[] = new int[1000001];
        for(int i = 0; i < list1.size(); i++){
            a[list1.get(i)]++;
        }
        
        int b[] = new int [1000001];
        for(int i = 0; i < list2.size(); i++){
            b[list2.get(i)]++;
        }
        
        int count = 0;
        for(int i = 100; i < 1000001; i++){
            if(a[i] > 0 && b[i] > 0 && isOddNum(i) && check(String.valueOf(i))){
                System.out.println(i + " " + (a[i] + b[i]));
                count++;
            }
            if(count == 10){
                break;
            }
        }
        first_ois.close();
        second_ois.close();
    }
}
