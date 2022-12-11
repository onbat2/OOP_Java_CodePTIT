package j01016_chu_so_4_va_chu_so_7;
import java.util.Scanner;

public class J01016_CHU_SO_4_VA_CHU_SO_7 {
    
    public static void main(String[] args) {
        Scanner m_sc = new Scanner(System.in);
        String s = m_sc.nextLine();
        int d = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '4' || s.charAt(i) == '7'){
                d++;
            }
        }
        if(d == 4 || d == 7){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
    
}
