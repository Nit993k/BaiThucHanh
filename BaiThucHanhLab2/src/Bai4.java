import java.util.Scanner;
/*Bài 4: (switch –case)
Viết chương trình nhập vào một số nguyên từ 1 - 12 từ bàn phím và hiển thị ra tháng tương ứng với số đó 
(nhập vào số 1 thì sẽ hiển thị ra là "Tháng 1“).
 */
public class Bai4 {
    public static void main(String[] args) throws Exception {
Scanner sc = new Scanner(System.in);
int thang;
do{
System.out.print("nhap so thang");
thang= sc.nextInt();
}while (thang < 1 || thang >12);
switch(thang){
    case 1:
    System.out.print("Thang 1"); 
    break;
    case 2:
    System.out.print("Thang 2");
    break;
    case 3:
    System.out.print("Thang 3"); 
    break; 
    case 4:
    System.out.print("Thang 4"); 
    break;
    case 5:
    System.out.print("Thang 5"); 
    break;
    case 6:
    System.out.print("Thang 6"); 
    break;
    case 7:
    System.out.print("Thang 7"); 
    break;
    case 8:
    System.out.print("Thang 8"); 
    break;
    case 9:
    System.out.print("Thang 9"); 
    break;
    case 10:
    System.out.print("Thang 10"); 
    break;
    case 11:
    System.out.print("Thang 11"); 
    break;
    case 12:
    System.out.print("Thang 12"); 
    break;
}
sc.close();
    }  
}
