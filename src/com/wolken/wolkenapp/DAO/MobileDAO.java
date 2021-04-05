package com.wolken.wolkenapp.DAO;

import java.sql.SQLException;

import com.wolken.wolkenapp.DTO.MobilesDTO;

public interface MobileDAO {

	public void addToTable(MobilesDTO mobilesdto) throws SQLException;

	public void updateTable(int id ,double price) throws SQLException;

	public void deleteTuple(int mobileid) throws SQLException;

	public void getTable() throws SQLException;

}
