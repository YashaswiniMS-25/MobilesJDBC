package com.wolken.wolkenapp.SERVICE;

import java.sql.SQLException;

import java.util.Scanner;

import com.wolken.wolkenapp.Exception.MobilesException;
import com.wolken.wolkenapp.DAO.MobileDAO;
import com.wolken.wolkenapp.DAO.MobileDAOImpl;
import com.wolken.wolkenapp.DTO.MobilesDTO;

public class MobileServiceImpl implements MobileService {
     MobilesDTO mobilesdto=new MobilesDTO();
     MobileDAO mobiledao= new MobileDAOImpl();
     Scanner scan=new Scanner(System.in);
	@Override
	public void validateAndSave(MobilesDTO mobilesdto) throws MobilesException {
		// TODO Auto-generated method stub
	try {
		if(mobilesdto!=null) {
			if(mobilesdto.getMobileid()<1000 && mobilesdto.getNoofcam()<5) {
				try {
					System.out.println("fgghh");
					mobiledao.addToTable(mobilesdto);
					System.out.println("added");
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
		else {
			MobilesException exc=new MobilesException();
			throw exc;
		}
	}catch(Exception e) {
		e.printStackTrace();
		
	}
		
		
	}

	@Override
	public void validateAndUpdate(MobilesDTO mobilesdto) {
		// TODO Auto-generated method stub
		
		
		try {
		if(mobilesdto.getSerialno().length()<20) {
			
			System.out.println("enter the id to be update");
			int id=scan.nextInt();
			System.out.println("enter the price");
			double price=scan.nextDouble();
			try {
				mobiledao.updateTable(id,price);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else {
			System.out.println("not valid");
		}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
	}

	@Override
	public void validateAndDelete() {
		// TODO Auto-generated method stub
		
		try {
		if(mobilesdto.getNoofcam()<10) {
			try {
				System.out.println("enter the id to delete");
				int id=scan.nextInt();
				mobiledao.deleteTuple(id);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else {
			System.out.println("not valid");
		}
		}catch(NullPointerException e) {
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void get() {
		// TODO Auto-generated method stub
		try {
			mobiledao.getTable();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	

}
