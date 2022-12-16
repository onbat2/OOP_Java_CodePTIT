package j07048_danh_sach_san_pham_2;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Vector;

class SanPham{
    String maSanPham;
    String tenSanPham;
    int giaBan;
    int baoHanh;
    
    void input(Scanner m_sc){
        m_sc.nextLine();
        maSanPham = m_sc.nextLine();
        giaBan = m_sc.nextInt();
        baoHanh = m_sc.nextInt();
    }
    
    void output(){
        System.out.printf("%s %s %d %d\n", maSanPham, tenSanPham, giaBan, baoHanh);
    }
}

public class J07048_DANH_SACH_SAN_PHAM_2 {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner m_sc = new Scanner(new File("SANPHAM.in"));
        int n = m_sc.nextInt();
        Vector<SanPham> v = new Vector<>();
        for(int i = 0; i < n; i++){
            SanPham x = new SanPham();
            x.input(m_sc);
            v.add(x);
        }
        Collections.sort(v, new Comparator<SanPham>(){
            @Override
            public int compare(SanPham a, SanPham b){
                if(a.giaBan == b.giaBan){
                    if(a.maSanPham.compareTo(b.maSanPham) > 0){
                        return 1;
                }else{
                        return -1;
                    }
                }if(a.giaBan < b.giaBan){
                    return 1;
                }else{
                    return -1;
                }
            }
        });
        for(int i = 0; i < n; i++){
            v.get(i).output();
        }
        m_sc.close();
    }   
}
