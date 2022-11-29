package j01012_uoc_so_chia_het_cho_2;
import java.util.Scanner;

public class J01012_UOC_SO_CHIA_HET_CHO_2 {
    public static void main(String[] args) {
        Scanner m_sc = new Scanner(System.in);
        int t = m_sc.nextInt();
        while(t-- > 0){
            int n = m_sc.nextInt();
            int s = 0;
           for(int i = 1; i * i <= n; i++){
               if(n % i == 0){
                   if(i % 2 == 0){
                       s++;
                   }if((n / i) % 2 == 0){
                       s++;
                   }if(i * i == n && i % 2 == 0){
                       s--;
                   }
               }
           }System.out.println(s);
        }
    }
}
