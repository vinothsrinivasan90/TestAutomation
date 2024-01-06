package week3.day3;

public class JavaConnection1 implements DatabaseConnection{

	public static void main(String[] args) {
	JavaConnection1 c = new JavaConnection1();
	c.connect();
	c.executeUpdate();
	c.disconnect();
	
	}

	@Override
	public void connect() {
		System.out.println("Connected");
		
	}

	@Override
	public void disconnect() {
		System.out.println("Disconnected");
		
	}

	@Override
	public void executeUpdate() {
		System.out.println("Executed updates");
		
	}

	
    

}
