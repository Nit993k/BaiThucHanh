import java.util.Scanner;
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
