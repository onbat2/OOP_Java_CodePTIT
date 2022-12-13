package j07022_loai_bo_so_nguyen;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Comparator;

public class J07022_LOAI_BO_SO_NGUYEN {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner m_sc = new Scanner(new File("DATA.in"));
        List<String> list = new ArrayList<String>();
        while(m_sc.hasNext()){
            if(!m_sc.hasNextInt()){
                list.add(m_sc.next());
            }else{
                m_sc.next();
            }
        }
        list.sort(new Comparator<String>(){
            @Override
            public int compare(String o1, String o2){
                return o1.compareTo(o2);
            }
        });
        for(String s : list){
            System.out.print(s + " ");
        }
    }
}
