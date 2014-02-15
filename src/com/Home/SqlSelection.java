package com.Home;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SqlSelection 
    {
        public static ResultSet selecting(String userName,String password,String url,String driverClassName,String selectQuery)
        {
        	
        	Connection conn=null;
        	Statement stmt=null;
        	ResultSet rs=null;
            try
            {
            	
                Class.forName(driverClassName);
                conn = DriverManager.getConnection(url, userName, password);
                stmt = conn.createStatement();
                rs = stmt.executeQuery(selectQuery);
                               
                  

                //String result = new result[20];

            } catch (Exception e)
            {
                e.printStackTrace();
            }finally
            {
            	try{
                    if(stmt!=null)
                       stmt.close();
                 }catch(Exception se2){
                	 se2.printStackTrace();
                 }// nothing we can do
                 try{
                    if(conn!=null)
                       conn.close();
                 }catch(Exception se){
                    se.printStackTrace();
                    
                 }
            }
            return rs;
    }
        public static boolean Inserting(String userName,String password,String url,String driverClassName,String insertQuery)
        {
        	
        	Connection conn=null;
        	Statement stmt=null;
        	boolean rs=false;
            try
            {
            	
                Class.forName(driverClassName);
                conn = DriverManager.getConnection(url, userName, password);
                stmt = conn.createStatement();
                rs = stmt.executeQuery(insertQuery) != null;
                               
                  

                //String result = new result[20];

            } catch (Exception e)
            {
                e.printStackTrace();
            }finally
            {
            	try{
                    if(stmt!=null)
                       stmt.close();
                 }catch(Exception se2){
                	 se2.printStackTrace();
                 }// nothing we can do
                 try{
                    if(conn!=null)
                       conn.close();
                 }catch(Exception se){
                    se.printStackTrace();
                    
                 }
            }
            return rs;
    }
        public static boolean Deleting(String userName,String password,String url,String driverClassName,String deleteQuery)
        {
        	
        	Connection conn=null;
        	Statement stmt=null;
        	boolean rs=false;
            try
            {
            	
                Class.forName(driverClassName);
                conn = DriverManager.getConnection(url, userName, password);
                stmt = conn.createStatement();
                rs = stmt.executeQuery(deleteQuery) != null;
                               
                  

                //String result = new result[20];

            } catch (Exception e)
            {
                e.printStackTrace();
            }finally
            {
            	try{
                    if(stmt!=null)
                       stmt.close();
                 }catch(Exception se2){
                	 se2.printStackTrace();
                 }// nothing we can do
                 try{
                    if(conn!=null)
                       conn.close();
                 }catch(Exception se){
                    se.printStackTrace();
                    
                 }
            }
            return rs;
    }
        public static void main(String[] args){
        	String userName="SYSTEM";
    		String password="1234";
    		String url="jdbc:oracle:thin:@localhost:1521:xe";
    		String driverClassName="oracle.jdbc.OracleDriver";
    		String user="'"+"ashet1"+"'";
    		String pass="'"+"ada"+"'";
    		int passStatus=0;
    		int empid=12;
    		String insertQuery="INSERT INTO EMPLOYEECREDENTIALS VALUES("+empid+","+user+","+pass+","+passStatus+")";
        	Inserting(userName,password, url, driverClassName, insertQuery);
        }
    


}