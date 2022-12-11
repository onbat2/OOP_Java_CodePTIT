package j01014_uoc_so_nguyen_to_lon_nhat;
import java.util.Scanner;

public class J01014_UOC_SO_NGUYEN_TO_LON_NHAT {

    public static void main(String[] args) {
        Scanner m_sc = new Scanner(System.in);
        int t = m_sc.nextInt();
        while(t-- > 0){
            long n = m_sc.nextLong();
            long s = 0;
            for(long i = 2; i * i <= n; i++){
                if(n % i == 0){
                    s = i;
                    while(n % i == 0){
                        n /= i;
                    }
                }
            }
            if(n > 1){
                s = n;
            }
            System.out.println(s);
        }
    }
}
