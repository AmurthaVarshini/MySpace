import java.sql.*;
public class MsAcessODBC
{
public static void main(String[] args)
{
try
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
String database = "jdbc:odbc:GST";
Connection con = DriverManager.getConnection(database, "", "");
System.out.println("Connection Success");
Statement st = con.createStatement();
st.executeUpdate("insert into RA" + " (SNO,COMPANY_NAME,PAID_NOTPAID,GST_AMOUNT_PAID,TOTAL_AMT_PAID)" + " values (1,'LENOVO','PAID',15000,91500)");
ResultSet rs = st.executeQuery("Select * from RA order by SNO asc");
ResultSetMetaData rsmd = rs.getMetaData();
int numberOfColumns = rsmd.getColumnCount();
while (rs.next())
{
for (int i = 1; i <= numberOfColumns; i++)
{
if (i > 1)
System.out.print(", ");
String columnValue = rs.getString(i);
System.out.print(columnValue);
}
System.out.println("");
}
st.close();
con.close();
}
catch (Exception ex)
{
System.err.print("Exception: "+ex);
System.err.println(ex.getMessage());
}
}
}
