package com.wolken.wolkenapp;

import java.util.Scanner;


import com.wolken.wolkenapp.DTO.MobilesDTO;
import com.wolken.wolkenapp.Exception.MobilesException;
import com.wolken.wolkenapp.SERVICE.MobileService;
import com.wolken.wolkenapp.SERVICE.MobileServiceImpl;

public class MobileUtil {
	Scanner scan = new Scanner(System.in);
      static MobilesDTO mobilesdto = new MobilesDTO();

	public static void main(String[] args) {
		try {
			Scanner scan = new Scanner(System.in);
		
		// TODO Auto-generated method stub
		
		
		System.out.println("Enter mobile id");
		mobilesdto.setMobileid(scan.nextInt());

		System.out.println("Enter model name");
		mobilesdto.setModelname(scan.next());

		System.out.println("Enter price");
		mobilesdto.setPrice(scan.nextDouble());

		System.out.println("Enter mobile memory");
		mobilesdto.setMemeory(scan.nextInt());

		System.out.println("Enter mobile brand name");
		mobilesdto.setBrandname(scan.next());

		System.out.println("Enter mobile serial number");
		mobilesdto.setSerialno(scan.next());

		System.out.println("Enter number of cam");
		mobilesdto.setNoofcam(scan.nextInt());
		}catch(NullPointerException e) {
			e.printStackTrace();
		}

		// custom exception

		/*
		 * try { mobileservice.validateAndSave(mobilesdto); } catch (MobilesException e)
		 * { // TODO Auto-generated catch block e.printStackTrace(); }
		 * mobileservice.validateAndUpdate(mobilesdto);
		 * mobileservice.validateAndDelete(); mobileservice.get();
		 */
		boolean check = true;

		while (check) {
			MobileService mobileservice = new MobileServiceImpl();
			Scanner scan = new Scanner(System.in);
			System.out.println("1 insert 2 delete 3 update 4 get 5 exit");
			int choice = scan.nextInt();
			switch (choice) {
			case 1:
				try {
					mobileservice.validateAndSave(mobilesdto);
				} catch (MobilesException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 2:
				mobileservice.validateAndDelete();
				break;
			case 3:
				mobileservice.validateAndUpdate(mobilesdto);
				break;
			case 4:
				mobileservice.get();
				break;

			case 5:
				check = false;
				break;

			}
		}
		Connect.closeConnection();

	}

}
