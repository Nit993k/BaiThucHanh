import java.util.Scanner;
/*Bài 5: (while)
Viết chương trình nhập vào các số nguyên và tính tổng các số đó, 
nếu tổng lớn hơn > 100 thì kết thúc vòng lặp và hiển thị thông báo tổng của các số đã nhập.
 */
public class Bai5 {
    public static void main(String[] args) throws Exception {
Scanner sc = new Scanner(System.in);
int tong=0;
int num ;
do{
    System.out.print("nhap so nguyen");
    num=sc.nextInt();
    tong+=num;
}while(tong<=100);
    }
}
