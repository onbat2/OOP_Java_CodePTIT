package j01017_so_lien_ke;
import java.util.Scanner;
import java.lang.Math;

public class J01017_SO_LIEN_KE {
    public static Boolean check(String s){
        for(int i = 1; i < s.length(); i++){
            if(Math.abs(s.charAt(i) - s.charAt(i - 1)) != 1){
                return false;
            }
        }
        return true;
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
