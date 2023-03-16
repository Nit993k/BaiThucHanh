import java.util.Scanner;
/*Bài 2: (if-else)
Viết chương trình kiểm tra số vừa nhập vào là số chẵn hay lẻ. */
public class Bai2 {
    public static void main(String[] args) throws Exception {
Scanner scanner = new Scanner(System.in);
System.out.print("nhap vao so can kiem tra");
int num = scanner.nextInt();
if(num%2==0){
    System.out.print("day la so chan");
}else
System.out.print("day la so le");
    }
}