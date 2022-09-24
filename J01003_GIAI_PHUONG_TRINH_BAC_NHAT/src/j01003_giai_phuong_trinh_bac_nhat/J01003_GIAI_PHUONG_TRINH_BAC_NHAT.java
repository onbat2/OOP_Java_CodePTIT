package j01003_giai_phuong_trinh_bac_nhat;

import java.util.Scanner;

public class J01003_GIAI_PHUONG_TRINH_BAC_NHAT {

    public static void main(String[] args) {
        int a;
        int b;
        Scanner m_sc = new Scanner(System.in);
        a = m_sc.nextInt();
        b = m_sc.nextInt();
        if(a == 0 && b != 0){
            System.out.println("VN");
        }else if(a == 0 && b == 0){
            System.out.println("VSN");
        }else if(a != 0){
            System.out.printf("%.2f", (float) -b / a);
        }
    } 
}
