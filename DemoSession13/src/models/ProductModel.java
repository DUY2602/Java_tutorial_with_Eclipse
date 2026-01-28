package models;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
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
				product.setId(resultSet.getInt("id")); // ten cot cua bang product tren csdl
				product.setName(resultSet.getString("name"));
				product.setDescription(resultSet.getString("description"));
				product.setPrice(resultSet.getDouble("price"));
				product.setQuantity(resultSet.getInt("quantity"));
				product.setCreated(resultSet.getDate("created"));
				product.setStatus(resultSet.getBoolean("status"));
				products.add(product);
			}
		} catch (Exception e) {
			products = null;
			e.printStackTrace();
		} finally {
			ConnectDB.disconnect();
		}
		return products;
	}
	
	public List<Product> searchByStatus(boolean status){
		List<Product> products = new ArrayList<Product>();
		try {
			PreparedStatement preparedStatement = ConnectDB.connection()
					.prepareStatement("select * from product where status = ?");
			preparedStatement.setBoolean(1, status);
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				Product product = new Product();
				product.setId(resultSet.getInt("id")); // ten cot cua bang product tren csdl
				product.setName(resultSet.getString("name"));
				product.setDescription(resultSet.getString("description"));
				product.setPrice(resultSet.getDouble("price"));
				product.setQuantity(resultSet.getInt("quantity"));
				product.setCreated(resultSet.getDate("created"));
				product.setStatus(resultSet.getBoolean("status"));
				products.add(product);
			}
		} catch (Exception e) {
			products = null;
			e.printStackTrace();
		} finally {
			ConnectDB.disconnect();
		}
		return products;
	}
	
	public List<Product> searchByPrice(double min, double max){
		List<Product> products = new ArrayList<Product>();
		try {
			PreparedStatement preparedStatement = ConnectDB.connection()
					.prepareStatement("select * from product where price >= ? and price <= ?");
			preparedStatement.setDouble(1, min);
			preparedStatement.setDouble(2, max);
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				Product product = new Product();
				product.setId(resultSet.getInt("id")); // ten cot cua bang product tren csdl
				product.setName(resultSet.getString("name"));
				product.setDescription(resultSet.getString("description"));
				product.setPrice(resultSet.getDouble("price"));
				product.setQuantity(resultSet.getInt("quantity"));
				product.setCreated(resultSet.getDate("created"));
				product.setStatus(resultSet.getBoolean("status"));
				products.add(product);
			}
		} catch (Exception e) {
			products = null;
			e.printStackTrace();
		} finally {
			ConnectDB.disconnect();
		}
		return products;
	}
	
	public List<Product> searchByKeyword(String keyword){
		List<Product> products = new ArrayList<Product>();
		try {
			PreparedStatement preparedStatement = ConnectDB.connection()
					.prepareStatement("select * from product where name like ?");
			preparedStatement.setString(1, "%" + keyword + "%");
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				Product product = new Product();
				product.setId(resultSet.getInt("id")); // ten cot cua bang product tren csdl
				product.setName(resultSet.getString("name"));
				product.setDescription(resultSet.getString("description"));
				product.setPrice(resultSet.getDouble("price"));
				product.setQuantity(resultSet.getInt("quantity"));
				product.setCreated(resultSet.getDate("created"));
				product.setStatus(resultSet.getBoolean("status"));
				products.add(product);
			}
		} catch (Exception e) {
			products = null;
			e.printStackTrace();
		} finally {
			ConnectDB.disconnect();
		}
		return products;
	}
	
	public List<Product> searchByCreated(int year, int month, int day){
		List<Product> products = new ArrayList<Product>();
		try {
			PreparedStatement preparedStatement = ConnectDB.connection()
					.prepareStatement("select * from product where year(created) = ? and month(created) = ?"
							+ " and day(created) = ?");
			preparedStatement.setInt(1, year);
			preparedStatement.setInt(2, month);
			preparedStatement.setInt(3, day);
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				Product product = new Product();
				product.setId(resultSet.getInt("id")); // ten cot cua bang product tren csdl
				product.setName(resultSet.getString("name"));
				product.setDescription(resultSet.getString("description"));
				product.setPrice(resultSet.getDouble("price"));
				product.setQuantity(resultSet.getInt("quantity"));
				product.setCreated(resultSet.getDate("created"));
				product.setStatus(resultSet.getBoolean("status"));
				products.add(product);
			}
		} catch (Exception e) {
			products = null;
			e.printStackTrace();
		} finally {
			ConnectDB.disconnect();
		}
		return products;
	}
	
	public List<Product> searchByCreated(Date date){
		List<Product> products = new ArrayList<Product>();
		try {
			PreparedStatement preparedStatement = ConnectDB.connection()
					.prepareStatement("select * from product where created = ?");
			preparedStatement.setDate(1, new java.sql.Date(date.getTime()));
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				Product product = new Product();
				product.setId(resultSet.getInt("id")); // ten cot cua bang product tren csdl
				product.setName(resultSet.getString("name"));
				product.setDescription(resultSet.getString("description"));
				product.setPrice(resultSet.getDouble("price"));
				product.setQuantity(resultSet.getInt("quantity"));
				product.setCreated(resultSet.getDate("created"));
				product.setStatus(resultSet.getBoolean("status"));
				products.add(product);
			}
		} catch (Exception e) {
			products = null;
			e.printStackTrace();
		} finally {
			ConnectDB.disconnect();
		}
		return products;
	}
	
	public List<Product> searchByCreated(Date startDate, Date endDate){
		List<Product> products = new ArrayList<Product>();
		try {
			PreparedStatement preparedStatement = ConnectDB.connection()
					.prepareStatement("select * from product where created >= ? and created <= ?");
			preparedStatement.setDate(1, new java.sql.Date(startDate.getTime()));
			preparedStatement.setDate(2, new java.sql.Date(endDate.getTime()));
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				Product product = new Product();
				product.setId(resultSet.getInt("id")); // ten cot cua bang product tren csdl
				product.setName(resultSet.getString("name"));
				product.setDescription(resultSet.getString("description"));
				product.setPrice(resultSet.getDouble("price"));
				product.setQuantity(resultSet.getInt("quantity"));
				product.setCreated(resultSet.getDate("created"));
				product.setStatus(resultSet.getBoolean("status"));
				products.add(product);
			}
		} catch (Exception e) {
			products = null;
			e.printStackTrace();
		} finally {
			ConnectDB.disconnect();
		}
		return products;
	}
	
	public Product findByID(int id) {
		Product product = null;
		try {
			PreparedStatement preparedStatement = ConnectDB.connection()
					.prepareStatement("select * from product where id = ?");
			preparedStatement.setInt(1, id);
			ResultSet resultSet = preparedStatement.executeQuery();
			if(resultSet.next()) {
				product = new Product();
				product.setId(resultSet.getInt("id")); // ten cot cua bang product tren csdl
				product.setName(resultSet.getString("name"));
				product.setDescription(resultSet.getString("description"));
				product.setPrice(resultSet.getDouble("price"));
				product.setQuantity(resultSet.getInt("quantity"));
				product.setCreated(resultSet.getDate("created"));
				product.setStatus(resultSet.getBoolean("status"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return product;
	}
	
	public List<Product> sort1(){
		List<Product> products = new ArrayList<Product>();
		try {
			PreparedStatement preparedStatement = ConnectDB.connection()
					.prepareStatement("select * from product order by id desc");
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				Product product = new Product();
				product.setId(resultSet.getInt("id")); // ten cot cua bang product tren csdl
				product.setName(resultSet.getString("name"));
				product.setDescription(resultSet.getString("description"));
				product.setPrice(resultSet.getDouble("price"));
				product.setQuantity(resultSet.getInt("quantity"));
				product.setCreated(resultSet.getDate("created"));
				product.setStatus(resultSet.getBoolean("status"));
				products.add(product);
			}
		} catch (Exception e) {
			products = null;
			e.printStackTrace();
		} finally {
			ConnectDB.disconnect();
		}
		return products;
	}
	
	public List<Product> sort2(boolean status){
		List<Product> products = new ArrayList<Product>();
		try {
			PreparedStatement preparedStatement = ConnectDB.connection()
					.prepareStatement("select * from product where status = ? order by id asc");
			preparedStatement.setBoolean(1, status);
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				Product product = new Product();
				product.setId(resultSet.getInt("id")); // ten cot cua bang product tren csdl
				product.setName(resultSet.getString("name"));
				product.setDescription(resultSet.getString("description"));
				product.setPrice(resultSet.getDouble("price"));
				product.setQuantity(resultSet.getInt("quantity"));
				product.setCreated(resultSet.getDate("created"));
				product.setStatus(resultSet.getBoolean("status"));
				products.add(product);
			}
		} catch (Exception e) {
			products = null;
			e.printStackTrace();
		} finally {
			ConnectDB.disconnect();
		}
		return products;
	}
	
	public Integer sum1() {
		Integer result = null;
		try {
			PreparedStatement preparedStatement = ConnectDB.connection()
					.prepareStatement("select sum(quantity) as sum from product");
			ResultSet resultSet = preparedStatement.executeQuery();
			if(resultSet.next()) {
				result = resultSet.getInt("sum");
//				result = resultSet.getInt(1);
			}
		} catch (Exception e) {
			e.printStackTrace();
			result = null;
		}
		return result;
	}
	public Double sum2(boolean status) {
		Double result = null;
		try {
			PreparedStatement preparedStatement = ConnectDB.connection()
					.prepareStatement("select sum(price*quantity) as total from product where status = ?");
			preparedStatement.setBoolean(1, status);
			ResultSet resultSet = preparedStatement.executeQuery();
			if(resultSet.next()) {
				result = resultSet.getDouble("total");
//				result = resultSet.getInt(1);
			}
		} catch (Exception e) {
			e.printStackTrace();
			result = null;
		}
		return result;
	}
	
	public Integer count1() {
		Integer result = null;
		try {
			PreparedStatement preparedStatement = ConnectDB.connection()
					.prepareStatement("select count(*) from product");
			ResultSet resultSet = preparedStatement.executeQuery();
			if(resultSet.next()) {
				result = resultSet.getInt(1);
			}
		} catch (Exception e) {
			e.printStackTrace();
			result = null;
		}
		return result;
	}
	public Integer count2(boolean status) {
		Integer result = null;
		try {
			PreparedStatement preparedStatement = ConnectDB.connection()
					.prepareStatement("select count(*) from product where status = ?");
			preparedStatement.setBoolean(1, status);
			ResultSet resultSet = preparedStatement.executeQuery();
			if(resultSet.next()) {
				result = resultSet.getInt(1);
			}
		} catch (Exception e) {
			e.printStackTrace();
			result = null;
		}
		return result;
	}
	
	public Double min() {
		Double min = null;
		try {
			PreparedStatement preparedStatement = ConnectDB.connection()
					.prepareStatement("select min(price) from product");
			ResultSet resultSet = preparedStatement.executeQuery();
			if(resultSet.next()) {
				min = resultSet.getDouble(1);
			}
		} catch (Exception e) {
			e.printStackTrace();
			min = null;
		}
		return min;
	}
	// tuong tu voi max va avg
	
	public boolean create(Product product) {
		boolean result = true;
		try {
			PreparedStatement preparedStatement = ConnectDB.connection()
			.prepareStatement("insert into product(name, price, quantity, description, status, created) "
					+ "values(?, ?, ?, ?, ?, ?)");
			preparedStatement.setString(1, product.getName());
			preparedStatement.setDouble(2, product.getPrice());
			preparedStatement.setInt(3, product.getQuantity());
			preparedStatement.setString(4, product.getDescription());
			preparedStatement.setBoolean(5, product.isStatus());
			preparedStatement.setDate(6, new java.sql.Date(product.getCreated().getTime()));
			result = preparedStatement.executeUpdate() > 0;
		} catch (Exception e) {
			e.printStackTrace();
			result = false;
		}
		return result;
	}
	
	public boolean delete(int id) {
		boolean result = true;
		try {
			PreparedStatement preparedStatement = ConnectDB.connection()
			.prepareStatement("delete from product where id = ?");
			preparedStatement.setInt(1, id);
			result = preparedStatement.executeUpdate() > 0;
		} catch (Exception e) {
			e.printStackTrace();
			result = false;
		}
		return result;
	}
	
	public boolean update(Product product) {
		boolean result = true;
		try {
			PreparedStatement preparedStatement = ConnectDB.connection()
		.prepareStatement("update product set name = ?, price = ?, quantity = ?, description= ?, "
				+ "created = ?, status = ? where id = ?");
			preparedStatement.setString(1, product.getName());
			preparedStatement.setDouble(2, product.getPrice());
			preparedStatement.setInt(3, product.getQuantity());
			preparedStatement.setString(4, product.getDescription());
			preparedStatement.setDate(5, new java.sql.Date(product.getCreated().getTime()));
			preparedStatement.setBoolean(6, product.isStatus());
			preparedStatement.setInt(7, product.getId());
			result = preparedStatement.executeUpdate() > 0;
		} catch (Exception e) {
			e.printStackTrace();
			result = false;
		}
		return result;
	}
}
