package j01002_tinh_tong;

import java.util.Scanner;

public class J01002_TINH_TONG {

    public static void main(String[] args) {
        int m;
        long n;
        Scanner m_sc = new Scanner(System.in);
        m = m_sc.nextInt();
        if(m > 0 && m <= 10){
            for(int i = 0; i < m; i++){
                n = m_sc.nextLong();
                System.out.println(n * (n + 1) / 2);
            }
        }
    }    
}
