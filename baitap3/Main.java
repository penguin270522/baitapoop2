package baitap.baitap3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws LuongException {
		Scanner input = new Scanner(System.in);
		ArrayList<GiangVien> giangVien = new ArrayList<>();
		int choice;
		do {
			System.out.println("nhap lua chon cua ban");
			System.out.println("1. them gv");
			System.out.println("2. xoa gv");
			System.out.println("3. xuat ds gv");
			System.out.println("4. out");
			choice = input.nextInt();
			
			switch (choice) {
			case 1:
				themGiangVien(input);
				break;
				
			case 2:
				xoaGiangVien(input, giangVien);
				break;
				
			case 3:
				xuatDanhSachGiangVien(giangVien);
				break;

			default:
				break;
			}
		}while(choice != 4);
		}
	
	private static GiangVien themGiangVien(Scanner input) throws LuongException {
		input.nextLine(); 
        System.out.print("Nhap ma giang vien: ");
        String maGV = input.nextLine();
        System.out.print("Nhap ho ten giang vien: ");
        String fullName = input.nextLine();
        System.out.print("Nhap ma mon hoc: ");
        int idMonHoc = input.nextInt();
        input.nextLine(); 
        System.out.println("nhap chuyen mon mon hoc");
        String fullNameMonHoc = input.nextLine();
        System.out.print("Nhap luong giang vien: ");
        double luong = input.nextDouble();
        if(luong < 0 || luong > 5000000) {
        	throw new LuongException("nhap sai so tien");
        }
        System.out.print("Nhap so nam kinh nghiem: ");
        float soNamKn = input.nextFloat();

        MonHoc monHoc = new MonHoc(idMonHoc, fullNameMonHoc);
        GiangVien giangVien = new GiangVien(maGV, fullName, monHoc, luong, soNamKn);

        return giangVien;
	}
	
	private static void xoaGiangVien(Scanner input, ArrayList<GiangVien> giangVienList) {
        input.nextLine(); 
        System.out.print("Nhap ma giang vien can xoa: ");
        String maGV = input.nextLine();

        for (GiangVien giangVien : giangVienList) {
            if (giangVien.getMaGV().equals(maGV)) {
                giangVienList.remove(giangVien);
                System.out.println("Da xoa giang vien co ma " + maGV);
                return;
            }
        }
        System.out.println("Khong tim thay giang vien co ma " + maGV);
    }

    private static void xuatDanhSachGiangVien(ArrayList<GiangVien> giangVienList) {
        System.out.println("Danh sach giang vien:");
        for (GiangVien giangVien : giangVienList) {
            System.out.println("Ma GV: " + giangVien.getMaGV());
            System.out.println("Ho ten: " + giangVien.getFullName());
            System.out.println("Mon hoc: " + giangVien.getMonHoc().getNameMonHoc());
            System.out.println("Luong: " + giangVien.getLuong());
            System.out.println("So nam kinh nghiem: " + giangVien.getSoNamKn());
            System.out.println("---------------");
        }
    }
}
