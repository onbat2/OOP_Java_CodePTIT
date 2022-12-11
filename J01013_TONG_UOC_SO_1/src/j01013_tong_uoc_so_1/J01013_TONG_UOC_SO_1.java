package j01013_tong_uoc_so_1;
import java.util.Scanner;

public class J01013_TONG_UOC_SO_1 {
    static int a[] = new int [2000001];
    
    public static void divisorArray(){
        for(int i = 2; i * i <= 2000000; i++){
            if(a[i] == 0){
                for(int j = i * i; j <= 2000000; j += i){
                    a[j] = i;
                }
            }
        }
        for(int i = 2; i <= 2000000; i++){
            if(a[i] == 0){
                a[i] = i;
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner m_sc = new Scanner(System.in);
        divisorArray();
        int t = m_sc.nextInt();
        long s = 0;
        while(t-- > 0){
            int n = m_sc.nextInt();
            while(n != 1){
                s += a[n];
                n /= a[n];
            }
        }
        System.out.print(s);
    }
}
