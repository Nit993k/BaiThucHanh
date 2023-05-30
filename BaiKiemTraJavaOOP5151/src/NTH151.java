import java.util.Scanner;

public class NTH151 {
    static Float Diem;
    static String HoTen;
    static int MaSV;
public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.print("Nhap thong tin sinh vien");
    HoTen=sc.nextLine();
    System.out.print("Nhap diem cua sinh vien");
    Diem = sc.nextFloat();
    System.out.print("Nhap Ma Sinh Vien");
    MaSV = sc.nextInt();
}
}
    