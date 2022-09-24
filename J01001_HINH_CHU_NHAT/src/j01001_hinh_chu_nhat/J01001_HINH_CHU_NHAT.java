package j01001_hinh_chu_nhat;

import java.util.Scanner;

public class J01001_HINH_CHU_NHAT {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner my_sc = new Scanner(System.in);
        a = my_sc.nextInt();
        b = my_sc.nextInt();
        if(a <= 0|b <= 0){
            System.out.print(0);
        }else{
            System.out.printf("%d %d", (a + b) * 2, a * b);
        }
    }
}