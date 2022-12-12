package j07004_so_khac_nhau_trong_file_1;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;

public class J07004_SO_KHAC_NHAU_TRONG_FILE_1 {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner m_sc = new Scanner(new File("DATA.in"));
        Map<Integer, Integer> map = new TreeMap<>();
        while(m_sc.hasNext()){
            int x = m_sc.nextInt();
            if(!map.containsKey(x)){
                map.put(x, 1);
            }else{
                map.put(x, map.get(x) + 1);
            }
        }
        for(int key : map.keySet()){
        System.out.println(key + " " + map.get(key));
        }
    }
}
