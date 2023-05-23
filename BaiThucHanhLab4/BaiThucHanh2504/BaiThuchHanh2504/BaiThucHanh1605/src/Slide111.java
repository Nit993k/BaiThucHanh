import java.util.LinkedList;
import java.util.Scanner;

public class Slide111{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Integer> numbers = new LinkedList<Integer>();

        // Nhập vào số lượng số nguyên dương
        System.out.print("Nhâp vào sô luong sô nguyên duong: ");
        int n = scanner.nextInt();

        // Nhập vào các số nguyên dương và thêm vào danh sách liên kết
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap vào sô nguyên duong thu " + (i+1) + ": ");
            int num = scanner.nextInt();
            numbers.add(num);
        }

        // Tính trung bình cộng của các số chẵn
        int sum = 0;
        int count = 0;
        for (int num : numbers) {
            if (num % 2 == 0) {
                sum += num;
                count++;
            }
        }
        double average = (double) sum / count;

        // Hiển thị kết quả trung bình cộng của các số chẵn
        System.out.println("Trung bình công cua cac sô chan la: " + average);
    }
}
