package week3.day3;

public class JavaConnection2 extends MySqlConnection{

	public static void main(String[] args) {
	JavaConnection2 c = new JavaConnection2();
	c.connect();
	c.executeUpdate();
	c.executeQuery();
	c.disconnect();
	
	}

	
   

}
