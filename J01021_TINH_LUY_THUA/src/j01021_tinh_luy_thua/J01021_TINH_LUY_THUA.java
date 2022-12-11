package j01021_tinh_luy_thua;
import java.util.Scanner;

public class J01021_TINH_LUY_THUA {
    static Long mod = 1000000007L;
    public static Long pow(Long a, Long b){
        if(b == 0){
            return 1L;
        }
        Long x = pow(a, b/2);
        x = (x * x) % mod;
        if(b % 2 == 0){
            return x;
        }else{
            return (x * a) % mod;
        }
    }
    
    public static void main(String[] args) {
        Scanner m_sc = new Scanner(System.in);
        while(true){
            Long a = m_sc.nextLong();
            Long b = m_sc.nextLong();
            if(a == 0 && b == 0){
                return;
            }else{
                System.out.println(pow(a, b));
            }
        }
    }
}
