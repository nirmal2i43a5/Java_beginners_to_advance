import java.sql.*;

public class Db
{
    public static void main(String[] args) //throws Exception
     {
         //throws exception
       try{ String url="jdbc:microsoft:sqlserver://HOST:1433/college";//google search JDBC string for ms sql
        String username="sa";
        String password="mssql2017";
        String query ="select * from student";
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  //forname is a method which will help you to load class
        Connection conn=DriverManager.getConnection(url,username,password);
        //getconnection(also called method of class Drivermanager) is static method in java which return instance of Connection
        Statement st=conn.createStatement();
        ResultSet rs=st.executeQuery(query);



while(rs.next())  
System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
conn.close();
}catch(Exception e){ System.out.println(e);}  
}  

    //     rs.next();//tell your pointer to next value i.e next column
    //     String name=rs.getString(3);//3 means third column
    //     System.out.println(name);
    //     conn.close();
    //     st.close();
    // }

}
//jdbc:microsoft:sqlserver://HOST:1433/college
// jdbc:sqlserver://BG4WS0552:1433;databaseName=DynamicsAx2009
// jdbc:microsoft:sqlserver://HOST:1433/college
//jdbc:sqlserver://BG4WS0552:1433;databaseName=college