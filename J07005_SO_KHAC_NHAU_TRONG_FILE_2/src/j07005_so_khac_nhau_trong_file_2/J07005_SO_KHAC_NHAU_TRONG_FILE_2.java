package j07005_so_khac_nhau_trong_file_2;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.util.Map;
import java.util.TreeMap;
import java.io.IOException;

public class J07005_SO_KHAC_NHAU_TRONG_FILE_2 {
    public static void main(String[] args) throws IOException {
        DataInputStream dt = new DataInputStream(new FileInputStream("DATA.IN"));
        Map<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < 100000; i++) {
            int x = dt.readInt();
            if(map.containsKey(x)) {
                map.put(x, map.get(x) + 1);
            } else {
                map.put(x, 1);
            }
        }
        for (int key : map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }
        dt.close();
    }
}
