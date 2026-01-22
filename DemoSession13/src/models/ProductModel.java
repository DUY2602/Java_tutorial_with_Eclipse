package models;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import entities.Product;

public class ProductModel {
	public List<Product> findAll(){
		List<Product> products = new ArrayList<Product>();
		
		try {
			PreparedStatement preparedStatement = ConnectDB.connection().prepareStatement("select * from product");
			ResultSet resultSet = preparedStatement.executeQuery();
			
			while(resultSet.next()) {
				Product product = new Product();
				
				product.setId(resultSet.getInt("id"));
				product.setName(resultSet.getString("name"));
				product.setPrice(resultSet.getDouble("price"));
				product.setQuantity(resultSet.getInt("quantity"));
				product.setDescription(resultSet.getString("description"));
				product.setCreated(resultSet.getDate("created"));
				product.setStatus(resultSet.getBoolean("status"));
				
				products.add(product);
			}
			
		} catch (Exception e) {
			products = null;
			e.printStackTrace();
			
		}
		
		return products;
	}
	
	public List<Product> searchByStatus(Boolean status){
		List<Product> products = new ArrayList<Product>();
		
		try {
			PreparedStatement preparedStatement = ConnectDB.connection().prepareStatement("select * from product where status = ?");
			preparedStatement.setBoolean(1, status);
			ResultSet resultSet = preparedStatement.executeQuery();
			
			while(resultSet.next()) {
				Product product = new Product();
				
				product.setId(resultSet.getInt("id"));
				product.setName(resultSet.getString("name"));
				product.setPrice(resultSet.getDouble("price"));
				product.setQuantity(resultSet.getInt("quantity"));
				product.setDescription(resultSet.getString("description"));
				product.setCreated(resultSet.getDate("created"));
				product.setStatus(resultSet.getBoolean("status"));
				
				products.add(product);
			}
			
		} catch (Exception e) {
			products = null;
			e.printStackTrace();
			
		}
		
		return products;
	}
}
