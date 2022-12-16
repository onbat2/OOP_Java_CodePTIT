package j07046_danh_sach_luu_tru;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Date;
import java.util.Scanner;


class KhachHang implements Comparable<KhachHang> {

    public static int id = 1;
    private String maKhachHang, hoTen, maPhong;
    private Long thoiGian;

    public KhachHang(String hoTen, String maPhong, Long thoiGian) {
        this.maKhachHang = "KH" + String.format("%02d", id++);
        this.hoTen = hoTen;
        this.maPhong = maPhong;
        this.thoiGian = thoiGian;
    }

    public Long getThoiGian() {
        return thoiGian;
    }

    @Override
    public String toString() {
        return maKhachHang + " " + hoTen + " " + maPhong + " " + thoiGian;
    }

    @Override
    public int compareTo(KhachHang other) {
        return -thoiGian.compareTo(other.getThoiGian());
    }
}

public class J07046_DANH_SACH_LUU_TRU {
    public static void main(String[] args) throws IOException, ParseException{
        Scanner m_sc = new Scanner(new File("KHACH.in"));
        SimpleDateFormat m_sdf = new SimpleDateFormat("dd/MM/yyyy");
        int n = Integer.parseInt(m_sc.nextLine());
        List<KhachHang> ds = new ArrayList<>();
        for(int i = 0; i < n; i++){
            String name = m_sc.nextLine();
            String roomId = m_sc.nextLine();
            Date startDay = m_sdf.parse(m_sc.nextLine());
            Date lastDay = m_sdf.parse(m_sc.nextLine());
            Long duration = (lastDay.getTime() - startDay.getTime()) / (1000L * 60 * 60 * 24);
            ds.add(new KhachHang(name, roomId, duration));
        }
        Collections.sort(ds);
        ds.forEach(System.out::println);
    }
}
