package j07015_so_nguyen_to_trong_file_nhi_phan;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;


public class J07015_SO_NGUYEN_TO_TRONG_FILE_NHI_PHAN {
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
    
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        ObjectInputStream m_ois = new ObjectInputStream(new FileInputStream("SONGUYEN.in"));
        List<Integer> list = (ArrayList<Integer>) m_ois.readObject();
        Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
        for(int i = 0; i < list.size(); i++){
            int x = list.get(i);
            if(isPrime(x)){
                if(map.containsKey(x)){
                    map.put(x, map.get(x) + 1);
                }else{
                    map.put(x, 1);
                }
            }
        }
        for(int key : map.keySet()){
            System.out.println(key + " " + map.get(key));
        }
        m_ois.close();
    }
}
