package j01009_tong_giai_thua;
import java.util.Scanner;

public class J01009_TONG_GIAI_THUA {
    public static void main(String[] args) {
        Scanner m_sc = new Scanner(System.in);
        Long n = m_sc.nextLong();
        Long s = (long) 1;
        Long k = (long) 1;
        for(int i = 2; i <= n; i++){
            k *= i;
            s += k;
        }
        System.out.print(s);
    }   
}
