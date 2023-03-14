import java.util.Scanner;
public class Bai3 {
    public static void main(String[] args) throws Exception {
Scanner sc = new Scanner(System.in);
System.out.print("nhap vao ho ten");
String hoTen=sc.nextLine();
System.out.print("nhap so nam sinh");
int namsinh = sc.nextInt();
int namhientai=2023;
int tuoi=namhientai-namsinh;
if(tuoi<16){
    System.out.printf("Ban%sotuoivithanhnien",hoTen);
}else if(tuoi>16){
    System.out.printf("Ban%sodotuoitruongthanh",hoTen);
}else if(tuoi >18){
    System.out.printf("Ban%sdagia",hoTen);
}
    }
}