import java.util.Scanner;
/*Bài 1: (Toán tử)
Nhập vào 2 số bất kỳ từ bàn phím và thực hiện các yêu cầu sau:
1. Tính tổng, hiệu, tích, thương, chia lấy dư của 2 số đó.
2. Sử dụng các toán tử so sánh đã học để so sánh 2 số đó */
public class Bai1 {
    public static void main(String[] args) throws Exception {
Scanner scanner = new Scanner(System.in);
System.out.print("nhap vao so thu nhat");
double num1 = scanner.nextDouble();
System.out.print("nhap vao so thu hai");
double num2 = scanner.nextDouble();
double tong = num1+num2;
double hieu = num1-num2;
double tich = num1*num2;
double thuong = num1/num2;
double chialayphandu = num1%num2;
System.out.println("Tong 2 so la:"+ tong);
System.out.println("Hieu 2 so la:"+ hieu);
System.out.println("Tich 2 so la:5"+ tich);
System.out.println("Thuong 2 so la:"+thuong);
System.out.println("Chia lay phan du 2 so la:"+chialayphandu);
 if(num1>num2){
    System.out.println("so thu nhat lon hon so thu hai");
 }else if(num1<num2){
    System.out.println("so thu nhat nho hon so thu hai");
 }else{
    System.out.println("so thu nhat bang so thu hai");
 }
    }
}
