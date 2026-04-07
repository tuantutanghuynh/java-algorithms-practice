package praticeday6;

import java.util.Scanner;

public class Student {
    private String name;
    private int age;
    private double mark;

    public void input() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Nhap ten (> 3 ky tu): ");
                String input = sc.nextLine(); // co the nem Exception neu loi doc input
                if (input.length() <= 3) { // NullPointerException neu input = null
                    System.out.println("Loi: Ten phai co nhieu hon 3 ky tu!");
                    continue;
                }
                name = input;
                break;
            } catch (Exception e) {
                System.out.println("Loi: " + e.getMessage());
            }
        }

        while (true) {
            try {
                System.out.print("Nhap tuoi (> 18): ");
                int inputAge = sc.nextInt(); // InputMismatchException neu nhap chuoi hoac so thuc
                if (inputAge <= 18) {
                    System.out.println("Loi: Tuoi phai lon hon 18!");
                    continue;
                }
                sc.nextLine(); // xoa "\n" con lai trong buffer sau nextInt()
                age = inputAge;
                break;
            } catch (Exception e) {
                sc.nextLine(); // xoa "abc\n" bi ket trong buffer khi nhap sai
                System.out.println("Loi: Phai nhap so nguyen hop le!");
            }
        }

        while (true) {
            try {
                System.out.print("Nhap diem (0 - 100): ");
                float inputMark = sc.nextFloat(); // InputMismatchException neu nhap chuoi
                if (inputMark < 0 || inputMark > 100) {
                    System.out.println("Loi: Diem phai tu 0 den 100!");
                    continue;
                }
                sc.nextLine(); // xoa "\n" con lai trong buffer sau nextFloat()
                mark = inputMark;
                break;
            } catch (Exception e) {
                sc.nextLine(); // xoa "abc\n" bi ket trong buffer khi nhap sai
                System.out.println("Loi: Phai nhap so hop le!");
            }
        }
    }

    public void output() {
        System.out.println("=== Thong tin sinh vien ===");
        System.out.println("Ten  : " + name);
        System.out.println("Tuoi : " + age);
        System.out.println("Diem : " + mark);
    }
}
