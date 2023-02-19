package bai1;

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		QLCB qlcb = new QLCB();
		while (true) {
			System.out.println("Quan Ly Can Bo");
            System.out.println("Enter 1: Them can bo");
            System.out.println("Enter 2: Tim can bo theo ten");
            System.out.println("Enter 3: Hien thi thong tin can bo");
            System.out.println("Enter 4: Thoat chuong trinh");
            String option = sc.nextLine();
            switch(option) {
            	case "1":{
            		System.out.println("Enter a: Them ky su");
                    System.out.println("Enter b: Them cong nhan");
                    System.out.println("Enter c: Them nhan vien");
                    String type = sc.nextLine();
                    switch(type) {
                    	case "a": {
                    		System.out.println("Nhap ten: ");
                    		String name = sc.nextLine();
                    		System.out.println("Nhap tuoi: ");
                    		int age = sc.nextInt();
                    		sc.nextLine();
                    		System.out.println("Nhap gioi tinh: ");
                    		String gender = sc.nextLine();
                    		System.out.println("Nhap dia chi: ");
                    		String address = sc.nextLine();
                    		System.out.println("Nhap nganh hoc: ");
                    		String branch = sc.nextLine();
                    		CanBo kysu = new KySu(name, age, gender, address, branch);
                    		qlcb.addCB(kysu);
                    		System.out.println("Nhap thanh cong!!!");
                    		System.out.println(kysu.toString());
                    		break;
                    	}
                    	case "b": {
                    		System.out.println("Nhap ten: ");
                    		String name = sc.nextLine();
                    		System.out.println("Nhap tuoi: ");
                    		int age = sc.nextInt();
                    		sc.nextLine();
                    		System.out.println("Nhap gioi tinh: ");
                    		String gender = sc.nextLine();
                    		System.out.println("Nhap dia chi: ");
                    		String address = sc.nextLine();
                    		System.out.println("Nhap bac cong nhan: ");
                    		int level = sc.nextInt();
                    		CanBo congnhan = new CongNhan(name, age, gender, address, level);
                    		qlcb.addCB(congnhan);
                    		System.out.println("Nhap thanh cong!!!");
                    		System.out.println(congnhan.toString());
                    		break;
                    	}
                    	case "c": {
                    		System.out.println("Nhap ten: ");
                    		String name = sc.nextLine();
                    		System.out.println("Nhap tuoi: ");
                    		int age = sc.nextInt();
                    		sc.nextLine();
                    		System.out.println("Nhap gioi tinh: ");
                    		String gender = sc.nextLine();
                    		System.out.println("Nhap dia chi: ");
                    		String address = sc.nextLine();
                    		System.out.println("Nhap cong viec: ");
                    		String task = sc.nextLine();
                    		CanBo nhanvien = new NhanVien(name, age, gender, address, task);
                    		qlcb.addCB(nhanvien);
                    		System.out.println("Nhap thanh cong!!!");
                    		System.out.println(nhanvien.toString());
                    		break;
                    	}
                    	default: 
                    		System.out.println("Invalid");
                    		break;
                    }
                    break;
            	}
                case "2": {
                	System.out.println("Nhap ten: ");
                	String name = sc.nextLine();
                	for (CanBo cb : qlcb.searchCBByName(name)) {
                		System.out.println(cb.toString());
                	}
                	break;
                }
                case "3": {
                	qlcb.showInfoCB();
                	break;
                }
                case "4": {
                	return;
                }
                default: 
                	System.out.println("Invalid");
                	continue;
            }
		}
	}
}
