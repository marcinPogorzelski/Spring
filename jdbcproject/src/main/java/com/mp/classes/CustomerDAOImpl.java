package com.mp.classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mp.interfaces.CustomerDAO;

public class CustomerDAOImpl implements CustomerDAO {
	
	private DataSource dataSource;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Override
	public void insert(Customer customer) {
		
		String sql = "INSERT INTO customer (CUST_ID, NAME, AGE) VALUES (?, ?, ?)";
		
		Connection connection = null;
		
		try {
			connection = dataSource.getConnection();
			
			PreparedStatement statement = connection.prepareStatement(sql);
			
			statement.setInt(1, customer.getId());
			statement.setString(2, customer.getName());
			statement.setInt(3, customer.getAge());
			
			statement.executeUpdate();
			statement.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public Customer findByCustomerId(int id) {
		String sql = "SELECT * FROM customer WHERE CUST_ID = ?";
		
		Connection connection = null;
		
		try {
			connection = dataSource.getConnection();
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setInt(1, id);
			Customer customer = null;
			ResultSet set = ps.executeQuery();
			if(set.next()){
				customer = new Customer(
						set.getInt("CUST_ID")
						, set.getString("NAME")
						, set.getInt("AGE"));
			}
			set.close();
			ps.close();
			return customer;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
