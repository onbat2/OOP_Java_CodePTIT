package j07010_danh_sach_sinh_vien_trong_file_2;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class J07010_DANH_SACH_SINH_VIEN_TRONG_FILE_2 {
    public static class student{
        private String id;
        private String name;
        private String classId;
        private String birth;
        private double GPA;
        
        public student(String id, String name, String classId, String birth, double GPA){
            this.id = id;
            this.name = name;
            this.classId = classId;
            this.birth = birth;
            this.GPA = GPA;
        }
        
        public String getId(){
            while(id.length() < 3){
                id = "0" + id;
            }
            id = "B20DCCN" + id;
            return id;
        }
        
        public String getName(){
            return name;
        }
        
        public String getClassId(){
            return classId;
        }
        
        public String getBirth(){
            String[] s = this.birth.split("/");
            while(s[0].length() < 2) s[0] = "0" + s[0];
            while(s[1].length() < 2) s[1] = "0" + s[1];
            while(s[2].length() < 4) s[2] = "0" + s[2];
            return s[0] + "/" + s[1] + "/" + s[2];
        }
        
        public double getGPA(){
            return GPA;
        }
    }
    
    public static void main(String[] args) throws FileNotFoundException {
        Scanner m_sc = new Scanner(new File("SV.in"));
        int n = Integer.parseInt(m_sc.nextLine());
        student[] stu = new student[n];
        for(int i = 0; i < n; i++){
            stu[i] = new student(String.valueOf(i + 1), m_sc.nextLine(), 
                m_sc.nextLine(), m_sc.nextLine(), Double.parseDouble(m_sc.nextLine()));
        }
        for(int i = 0; i < n; i++){
            System.out.printf("%s %s %s %s %.2f\n", stu[i].getId(), stu[i].getName(),
                    stu[i].getClassId(), stu[i].getBirth(), stu[i].getGPA());
        }
    } 
}
