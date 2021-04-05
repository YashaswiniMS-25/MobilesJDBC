package com.wolken.wolkenapp.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.wolken.wolkenapp.Connect;
import com.wolken.wolkenapp.DTO.MobilesDTO;

public class MobileDAOImpl implements MobileDAO {
	Connection con = null;

	public MobileDAOImpl() {
		con = Connect.getConnect();

	}

	@Override
	public void addToTable(MobilesDTO mobilesdto) throws SQLException {
		// TODO Auto-generated method stub
		try (PreparedStatement ps = con.prepareStatement("insert into wolken.mobiles_table values(?,?,?,?,?,?,?)");) {
			ps.setInt(1, mobilesdto.getMobileid());
			ps.setString(2, mobilesdto.getModelname());
			ps.setDouble(3, mobilesdto.getPrice());
			ps.setInt(4, mobilesdto.getMemeory());
			ps.setString(5, mobilesdto.getBrandname());
			ps.setString(6, mobilesdto.getSerialno());
			ps.setInt(7, mobilesdto.getNoofcam());

			ps.executeUpdate();
			ps.close();

		}
	}

	@Override
	public void updateTable(int id, double price) throws SQLException {
		// TODO Auto-generated method stub
		try (PreparedStatement ps = con
				.prepareStatement("update wolken.mobiles_table set price=? where mobile_id=?");) {
			ps.setDouble(1, price);
			ps.setInt(2, id);
			ps.executeUpdate();
			System.out.println("updated");
			ps.close();
		}

	}

	@Override
	public void getTable() throws SQLException {
		// TODO Auto-generated method stub
		try (PreparedStatement ps = con.prepareStatement("select * from wolken.mobiles_table");) {
			try (ResultSet rs = ps.executeQuery();) {
				while (rs.next()) {
					int id = rs.getInt("mobile_id");
					String modelname = rs.getString("mobile_name");
					double price = rs.getDouble("price");
					int memory = rs.getInt("memory");
					String bn = rs.getString("brand_name");
					String sn = rs.getString("serial_no");
					int noc = rs.getInt("no_of_cam");

					System.out.println(id + "" + modelname + "" + price + "" + memory + "" + bn + "" + sn + "" + noc);
				}
			}
		}

	}

	@Override
	public void deleteTuple(int mobileid) throws SQLException {
		// TODO Auto-generated method stub
		try (PreparedStatement ps = con.prepareStatement("delete from wolken.mobiles_table where mobile_id=?");) {
			ps.setInt(1, mobileid);
			ps.executeUpdate();
			System.out.println("deleted");

			ps.close();
		}

	}

}
