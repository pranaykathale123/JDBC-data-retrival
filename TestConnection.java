package database;

import entity.Employee;

public class TestConnection {
	public static void main(String[] args) {
		DBconnection.getConnection();
		 Employeedatabase db = new Employeedatabase();
	        for(Employee emp :db.getAllEmployees())
	            System.out.println(emp);
	    }
}
