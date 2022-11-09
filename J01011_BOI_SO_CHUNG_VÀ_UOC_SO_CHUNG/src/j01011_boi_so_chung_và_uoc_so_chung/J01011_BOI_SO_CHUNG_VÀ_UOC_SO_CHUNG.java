package j01011_boi_so_chung_và_uoc_so_chung;
import java.util.Scanner;

public class J01011_BOI_SO_CHUNG_VÀ_UOC_SO_CHUNG {
    
    public static long gcd(long a, long b){
        while(a != 0){
            long x = a;
            a = b % a;
            b = x;
        }
        return b;
    }
    
    public static void main(String[] args) {
        Scanner m_sc = new Scanner(System.in);
        int t = m_sc.nextInt();
        while(t-- > 0){
            long a = m_sc.nextLong();
            long b = m_sc.nextLong();
            long c = gcd(a, b);
            System.out.println(a*b/c + " " + c);
        }
    }
}
