package week3.day3;

public abstract class MySqlConnection implements DatabaseConnection{
	
	public  void executeQuery() {
		
		System.out.println("Query Executed");
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
