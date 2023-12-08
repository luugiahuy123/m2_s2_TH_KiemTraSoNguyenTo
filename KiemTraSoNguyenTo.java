package ss2.ThucHanh;

import java.util.Scanner;

public class KiemTraSoNguyenTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scanner.nextInt();
        if (num < 2) {
            System.out.println("Khong phai la so nguyen to");
        } else {
            boolean check = true;
            for (int i = 2; i < Math.sqrt(num); i++) {
                if (num % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.println("la so nguyen to");
            } else {
                System.out.println("ko phai la so nguyen to");
            }
        }
    }
}
