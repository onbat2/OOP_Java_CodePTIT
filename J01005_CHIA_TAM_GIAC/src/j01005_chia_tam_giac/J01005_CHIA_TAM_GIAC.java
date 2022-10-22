package j01005_chia_tam_giac;

import java.util.Scanner;
import java.lang.Math;
public class J01005_CHIA_TAM_GIAC {

    public static void main(String[] args) {
        Scanner m_sc = new Scanner(System.in);
        int t = m_sc.nextInt();
        while (t-- > 0) {
            double n = m_sc.nextDouble();
            double k = m_sc.nextDouble();
            for (int i = 1; i < n; i++) {
                double h = Math.sqrt(i / n) * k;
                System.out.printf("%.6f ", h);
            }
            System.out.println();
        }
    }
}
