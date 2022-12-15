package j07034_danh_sach_mon_hoc;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class J07034_DANH_SACH_MON_HOC {
    public static class subject{
        private String id;
        private String name;
        private int courseLoad;
        
        public subject(String id, String name, int courseLoad){
            this.id = id;
            this.name = name;
            this.courseLoad = courseLoad;
        }
        
        public String getName(){
            return name;
        }
        
        @Override
        public String toString(){
            return id + " " + name + " " + courseLoad;
        }
    }
    
    public static void main(String[] args) throws FileNotFoundException{
        Scanner m_sc = new Scanner(new File("MONHOC.in"));
        int n = Integer.parseInt(m_sc.nextLine());
        subject[] sub = new subject[n];
        for(int i = 0; i < n; i++){
            sub[i] = new subject(m_sc.nextLine(), m_sc.nextLine(), Integer.parseInt(m_sc.nextLine()));
        }
        Arrays.sort(sub, new Comparator<subject>(){
            @Override
            public int compare(subject o1, subject o2){
                return o1.getName().compareTo(o2.getName());
            }
        });
        for(int i = 0; i < n; i++){
            System.out.println(sub[1]);
        }
    }
}
