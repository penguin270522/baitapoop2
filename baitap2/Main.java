package baitap.baitap2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Account account1 = new Account(1, 270502,"Hoang Phi Hung" , 0);
		Account account2 = new Account(2, 203208, "thtran", 0);
		
		User user1 = new User(1,account1);
		User user2 = new User(2,account2);
		
		System.out.println("nhap lua chọn của bạn");
		int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Chuyển tiền");
            System.out.println("2. Nạp tiền");
            System.out.println("3. Rút tiền");
            System.out.println("0. Thoát");
            System.out.print("Chọn tác vụ: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    // Chọn 1: Chuyển tiền
                    System.out.print("Nhập số tiền bạn muốn chuyển: ");
                    double tienChuyen = input.nextDouble();
                    try {
                        user1.chuyenTien(user2, tienChuyen);
                        System.out.println("Chuyển tiền thành công!");
                    } catch (TienException e) {
                        System.out.println("Lỗi: " + e.getMessage());
                    }
                    break;
                case 2:
                    // Chọn 2: Nạp tiền
                    System.out.print("Nhập số tiền bạn muốn nạp: ");
                    double tienNap = input.nextDouble();
                    try {
                        user1.getAccount().napTien(tienNap);
                        System.out.println("Nạp tiền thành công!");
                    } catch (TienException e) {
                        System.out.println("Lỗi: " + e.getMessage());
                    }
                    break;
                case 3:
                    // Chọn 3: Rút tiền
                    System.out.print("Nhập số tiền bạn muốn rút: ");
                    double tienRut = input.nextDouble();
                    try {
                        user1.getAccount().rutTien(tienRut);
                        System.out.println("Rút tiền thành công!");
                    } catch (TienException e) {
                        System.out.println("Lỗi: " + e.getMessage());
                    }
                    break;
                case 0:
                    // Chọn 0: Thoát
                    System.out.println("Thoát khỏi menu.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        } while (choice != 0);

        input.close();
    }
}
