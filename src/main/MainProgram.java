package main;

import controller.PlaceManagement;
import util.InputUtil;

public class MainProgram {

	public static void main(String[] args) {
		System.out.println("######## CHUONG TRINH QUAN LY TOUR ######");
		System.out.println("0 - Thoat");
		System.out.println("1 - Login");
		System.out.println("2 - Tour");
		System.out.println("3 - Dia Diem");
		System.out.println("4 - Lich Trinh Tour");
		System.out.println("5 - Dang Ky Tour");
		System.out.println("##########################################");
		System.out.print("Moi ban chon chuc nang:");
		int function = InputUtil.getInt();
		switch(function) {
			case 0:
				System.exit(0);
				break;
			case 1:
				// Login here
				break;
			case 3:
				PlaceManagement.showMenu();
				break;
		}
	}

}
