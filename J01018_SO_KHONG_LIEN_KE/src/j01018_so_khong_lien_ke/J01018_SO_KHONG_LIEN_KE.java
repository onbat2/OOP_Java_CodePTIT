package j01018_so_khong_lien_ke;
import java.util.Scanner;
import java.lang.Math;

public class J01018_SO_KHONG_LIEN_KE {
    public static Boolean check(String s){
        int n = s.length();
        int d = s.charAt(0)- '0';
        for(int i = 1; i < n; i++){
            d += s.charAt(i) - '0';
            if(Math.abs(s.charAt(i) - s.charAt(i - 1)) != 2){
                return false;
            }
        }if(d % 10 != 0){
            return false;
        }return true;
    }
    
    public static void main(String[] args) {
        Scanner m_sc = new Scanner(System.in);
        int t = m_sc.nextInt();
        while(t-- > 0){
            Long n = m_sc.nextLong();
            if(check(Long.toString(n)) == true){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
