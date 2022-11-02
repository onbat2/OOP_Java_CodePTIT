package j01008_phan_tich_thua_so_nguyen_to;

import java.util.Scanner;

public class J01008_PHAN_TICH_THUA_SO_NGUYEN_TO {
    public static void main(String[] args) {
        Scanner m_sc = new Scanner(System.in);
        int t = m_sc.nextInt();
        for(int z = 1; z <= t; z++){
            int n = m_sc.nextInt();
            System.out.printf("Test %d: ", z);
            for(int i = 2; i * i <= n; i++){
                int s = 0;
                while(n % i == 0){
                    s++;
                    n /= i;
                }if(s > 0){
                    System.out.printf("%d(%d) ", i, s);
                }
            }if(n > 1){
                System.out.printf("%d(1)", n);
            }
            System.out.println();
        }
    }
    
}
