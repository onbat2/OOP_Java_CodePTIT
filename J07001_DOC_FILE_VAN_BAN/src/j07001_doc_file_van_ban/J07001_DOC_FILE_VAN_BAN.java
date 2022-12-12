package j07001_doc_file_van_ban;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class J07001_DOC_FILE_VAN_BAN {
    public static void main(String[] args) {
        try{
            Scanner m_sc = new Scanner(new File("DATA.in"));
            while(m_sc.hasNextLine()){
                System.out.println(m_sc.nextLine());
            }
        }catch(FileNotFoundException e){
            throw new RuntimeException(e);
        }
    }
}
