import java.sql.*;
class EDelete
{
public static void main(String a[])
{
Connection c;
try
{
class.forName("sun.jdbc.odbc.jdbcodbcDriver");
c=DriverManager.getConnection("jdbc:odbc:dsn1");
preparedStatement ps=c.prepareStatement("Delete*from Employee where EID=?")
ps.setInt(1,Integer.parseInt(a[0]));
int k=ps.executeUpdate(" ");
if(k>0)
System.out.println("Record Successfully Deleted");
c.close();
}catch(Exception e)
{
System.out.println(e);
}
}
}