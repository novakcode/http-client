package demo;

public abstract class Client implements RequestHandler {

	private ClientConfig clientConfig;

	public Client(ClientConfig config) {
		this.clientConfig = config;
	}

	public Client() {
		this(ClientConfig.defaultConfig());
		HttpURLConnection con ;
		
	}

	 
	
	
	

	
	
	
	

}
