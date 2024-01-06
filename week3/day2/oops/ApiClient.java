package week3.day2.oops;

public class ApiClient {
	
	
	public void sendRequest(String endpoint) {
		
		System.out.println(endpoint);
		
	}
	public void sendRequest(String endpoint,String requestBody) {
		System.out.println(endpoint+requestBody);
	}
    public void sendRequest(String endpoint,String requestBody,String requestStatus) {
	System.out.println(endpoint+requestBody+requestStatus);	
	}

	
	

	public static void main(String[] args) {
		ApiClient cl = new ApiClient();
		cl.sendRequest("ww.safe.com");
		cl.sendRequest("sf.com", "welcome to api");
		cl.sendRequest("sf.com", "welcome to api","200");

	}

}
