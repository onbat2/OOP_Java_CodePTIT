package j07037_danh_sach_donh_nghiep;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Vector;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class DoanhNghiep{
    String maDoanhNghiep;
    String tenDoanhNghiep;
    int soSVNhan;
    
    void input(Scanner sc){
        sc.nextLine();
        maDoanhNghiep = sc.nextLine();
        tenDoanhNghiep = sc.nextLine();
        soSVNhan = sc.nextInt();
    }
    
    void output(){
        System.out.printf("%s %s %d\n", maDoanhNghiep, tenDoanhNghiep, soSVNhan);
    }
}

public class J07037_DANH_SACH_DONH_NGHIEP {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("DN.in"));
        int n = sc.nextInt();
        Vector<DoanhNghiep> v = new Vector<>();
        for(int i = 0; i < n; i++){
            DoanhNghiep x = new DoanhNghiep();
            x.input(sc);
            v.add(x);
        }
        Collections.sort(v, new Comparator<DoanhNghiep>(){
            @Override
            public int compare(DoanhNghiep a, DoanhNghiep b){
                if(a.maDoanhNghiep.compareTo(b.maDoanhNghiep) > 0){
                    return 1;
                }else{
                    return -1;
                }
            }
        });
        for(int i = 0; i < n; i++){
            v.get(i).output();
        }
        sc.close();
    }
}
