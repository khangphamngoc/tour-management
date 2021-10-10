package controller;

import java.io.File;

import bean.Place;
import util.InputUtil;

public class PlaceManagement {

	public static void searchPlace(Place[] places) {
		System.out.println("Nhap ten dia diem can tim: ");
		String name = InputUtil.getString();
		int count = 0;
		for(int i = 0; i < places.length; i++) {
			if(places[i].getPlaceName().contains(name)) {
				System.out.println("Ma Dia Diem: " + places[i].getId());
				System.out.println("Ten Dia Diem: " + places[i].getPlaceName());
				System.out.println("Mo Ta: " + places[i].getDescription());
				++count;
			}
		}
		System.out.println("Tim thay " + count + " ket qua!");
	}

	public static Place[] inputPlace() {
		int n = 0;
		System.out.println("Nhap so dia diem:");
		n = InputUtil.getInt();
		Place[] places = new Place[n];
		for(int i = 0; i < n; i++) {
			System.out.println("Nhap thong tin dia diem thu " + (i+1));
			System.out.println("Nhap Ten Dia Diem: ");
			String placeName = InputUtil.getString();
			System.out.println("Nhap Mo Ta Dia Diem: ");
			String description = InputUtil.getString();
			Place p = new Place();
			p.setDescription(description);
			p.setId(i + 1);
			p.setPlaceName(placeName);
			places[i] = p;
		}
		return places;
	}
	
	public static void showPlaces(Place[] places) {
		System.out.println("######### THONG TIN DIA DIEM #########");
		for(int i = 0; i < places.length; i++) {
			System.out.println("Dia Diem Thu " + (i + 1));
			System.out.println("Ma Dia Diem: " + places[i].getId());
			System.out.println("Ten Dia Diem: " + places[i].getPlaceName());
			System.out.println("Mo Ta: " + places[i].getDescription());
			System.out.println("------------------------------------");
		}
	}
	
	public static void showMenu() {
		Place[] places = PlaceManagement.inputPlace();
		int functionPlace = -1;
		while(functionPlace != 0) {
			System.out.println("########## QUAN LY DIA DIEM ##########");
			System.out.println("0 - Quay Lai");
			System.out.println("1 - Xem Danh Sach");
			System.out.println("2 - Nhap Dia Diem");
			System.out.println("3 - Tim Kiem Dia Diem");
			System.out.println("4 - Chinh Sua Dia Diem");
			System.out.println("5 - Xoa Dia Diem");
			System.out.println("6 - Luu Thong Tin");
			System.out.println("######################################");
			System.out.print("Moi ban chon chuc nang:");
			functionPlace = InputUtil.getInt();
			if(functionPlace == 1) {
				PlaceManagement.showPlaces(places);
			} else if(functionPlace == 3) {
				PlaceManagement.searchPlace(places);
			} else if(functionPlace == 6) {
				StringBuilder str = new StringBuilder();
				for(int i = 0; i < places.length; i++) {
					str.append(places[i].getId()).append(";").append(places[i].getPlaceName()).append(";").append(places[i].getDescription());
					if(i < places.length-1) {
						str.append("\n");
					}
				}
				InputUtil.write(str.toString(), new File("Places.data"));
				System.out.println("Done!");
			}
		}
		
	}
}
