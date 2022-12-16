package j07045_loai_phong;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;

public class J07045_LOAI_PHONG {
    public static class LoaiPhong implements Comparable{
        private String id;
        private String name;
        private String price;
        private String fee;
        
        public LoaiPhong(String loaiPhong){
            String[] temp = loaiPhong.split(" ");
            id = temp[0];
            name = temp[1];
            price = temp[2];
            fee = temp[3];
        }
        
        public String getName(){
            return name;
        }
        
        @Override 
        public String toString(){
            return id + " " + name + " " + price + " " + fee;
        }
        
        @Override
        public int compareTo(Object obj){
            LoaiPhong phong = (LoaiPhong) obj;
            return name.compareTo(phong.getName());
        }
    }
    
    
public static void main(String[] args) throws IOException {
        ArrayList<LoaiPhong> ds = new ArrayList<>();
        Scanner in = new Scanner(new File("PHONG.in"));
        int n = Integer.parseInt(in.nextLine());
        while(n-->0){
            ds.add(new LoaiPhong(in.nextLine()));
        }
        Collections.sort(ds);
        for(LoaiPhong tmp : ds){
            System.out.println(tmp);
        }
    }
}
