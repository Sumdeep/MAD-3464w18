/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
import java.sql.*;
public class JDBCOperations {
   static Connection conn;
   static PreparedStatement stmt;//will convert into sql statements
   static ResultSet rs;
   static String USER = "root";
           static String PASS = "";
           
     public static void main(String [] args){
         connectDB();
         selectDB();
         
         
         insertDB();
         selectDB();
        
    
     }
    
    
static void connectDB(){
    try{
        Class.forName("com.mysql.jdbc.Driver");//registering our class
        conn = DriverManager.getConnection("jdbc:mysql://localhost/MADW18",USER,PASS);
    }
        
    catch(Exception e){
        e.printStackTrace();
    }
}      
static void insertDB(){
    try{
        stmt=conn.prepareStatement("INSERT INTO Person VALUES(?,?,?,?)");
        stmt.setInt(1,101);//1 specifies the first parametetr in the query
        stmt.setString(2,"Mouse");
        stmt.setString(3,"Apple");
        stmt.setInt(4,12);
        
        int i=stmt.executeUpdate();
        System.out.println(i+" records inserted");
        
    } catch(SQLException se){
                se.printStackTrace();
                }
    }
    

static void selectDB(){
try{
stmt = conn.prepareStatement("SELECT * FROM Person");
//stmt.execute();
rs = stmt.executeQuery();
while(rs.next()){
System.out.println(" ID : " + rs.getInt(1) + " FirstName : " + rs.getString("FirstName")+
"LastName : " + rs.getString("LastName")+
"Age : " + rs.getInt("Age"));
}
}catch(SQLException e){
e.printStackTrace();
}
}

static void deleteDB(){
    
    try{
        stmt = conn.prepareStatement("DELETE FROM Person WHERE Id = stmt.setInt(1,2");
        stmt.setInt(1,2);
        int nrec = stmt.executeUpdate();
        System.out.println(nrec + " records deleted");
        
        
        
        
        
    }
catch(SQLException e){
    e.printStackTrace();

}
}
}
