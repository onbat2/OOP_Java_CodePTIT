package j01004_so_nguyen_to;

import java.util.Scanner;

public class J01004_SO_NGUYEN_TO {
    public static boolean isPrimeNum(int a){
        if(a < 2){
            return false;
        }
        for(int i = 2; i * i <= a; i++){
            if(a % i == 0){
                return false;
            }
        }
        return true;
    }
       
    public static void main(String[] args){
        int m;
        int n;
        Scanner m_sc = new Scanner(System.in);
        m = m_sc.nextInt();
        while(m-- > 0){
            n = m_sc.nextInt();
            if(isPrimeNum(n) == true){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
