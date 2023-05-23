import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Slide110 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        // Nhập vào dãy số
        System.out.print("Nhâp vào dây day sô (kêt thuc bang sô âm): ");
        int input = scanner.nextInt();
        while (input >= 0) {
            numbers.add(input);
            input = scanner.nextInt();
        }

        // Tìm số nguyên có giá trị lớn nhất
        int max = Collections.max(numbers);
        System.out.println("Sô nguyên có giá tri lon nhât là: " + max);

        // Xoá phần tử có giá trị bằng số nhập vào
        System.out.print("Nhâp vao sô nguyên cân xoá: ");
        int delete = scanner.nextInt();
        numbers.removeIf(n -> n == delete);
        System.out.println("Day sô sau khi xoá phân tu có giá tri " + delete + ": " + numbers);

        // Sắp xếp dãy số và in ra màn hình
        Collections.sort(numbers);
        System.out.println("Day so sau khi sap xêp: " + numbers);
    }
}
