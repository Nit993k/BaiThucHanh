import java.util.Scanner;
/*Bài 3: (if-else)
Viết chương trình nhập vào tên và một số tương ứng là năm. Sau đó xuất ra nhóm tuổi của người đó như sau:
Nếu tuổi người đó < 16 thì hiện thông báo "Bạn [Tên] ở độ tuổi vị thành niên". 
Nếu tuổi người đó >= 16 và nhỏ hơn 18 thì hiện thông báo "Bạn [Tên] ở độ tuổi trưởng thành". 
Nếu tuổi người đó >= 18 thì hiện thông báo "Bạn [Tên] đã già". */
public class Bai3 {
    public static void main(String[] args) throws Exception {
Scanner scanner = new Scanner(System.in);
System.out.print("nhap vao ho ten");
String hoTen=scanner.nextLine();
System.out.print("nhap so nam sinh");
int namsinh = scanner.nextInt();
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