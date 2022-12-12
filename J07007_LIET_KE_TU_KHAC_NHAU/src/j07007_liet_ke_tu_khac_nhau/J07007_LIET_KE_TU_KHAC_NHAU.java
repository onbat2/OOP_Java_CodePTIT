package j07007_liet_ke_tu_khac_nhau;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;
import java.util.TreeSet;
import java.util.Set;
import java.util.Scanner;

public class J07007_LIET_KE_TU_KHAC_NHAU {
    public static class WordSet{
        private File file;
        private Set<String> set;
        
        public WordSet(String file) throws FileNotFoundException{
            this.file = new File(file);
            set = new TreeSet<>();
            wordRechange();
        } 
        
        public void wordRechange() throws FileNotFoundException{
            Scanner m_sc = new Scanner(this.file);
            while(m_sc.hasNext()){
                this.set.add(m_sc.next().toLowerCase());
            }
        }
        
        @Override
        public String toString(){
            String ans = "";
            for(String s : set){
                ans += s + "\n";
            }
            return ans;
        }
    }

    public static void main(String[] args) throws IOException {
        WordSet ws = new WordSet("VANBAN.in");
        System.out.println(ws);
    }
}
