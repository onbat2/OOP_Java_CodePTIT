package j01010_cat_doi;
import java.util.Scanner;

public class J01010_CAT_DOI {
    
    public static Long m_try(String s){
        Long key = 0L;
        int n = s.length();
        for(int i = 0; i < n; i++){
            if(s.charAt(i) == '1'){
                key = key * 10 + 1;
            }
            else if(s.charAt(i) == '0' || s.charAt(i) == '8' || s.charAt(i) == '9'){
                key = key * 10;
            }
            else{
                return -1L;
            }
        }
        return key;
    }
    
    public static void main(String[] args) {
        Scanner m_sc = new Scanner(System.in);
        int t = m_sc.nextInt();
        while(t-- > 0){
            Long n = m_sc.nextLong();
            Long key = m_try(Long.toString(n));
            if(key == -1L || key == 0){
                System.out.println("INVALID");
            }
            else{
                System.out.println(key);
            }
        }
    }
}
