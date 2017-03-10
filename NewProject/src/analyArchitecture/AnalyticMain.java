package analyArchitecture;

import org.restlet.Component;
import org.restlet.data.Protocol;

import firstSteps.HelloWorldResourceApplication;

public class AnalyticMain {
	public static void main(String[] args) throws Exception {  
	    // Create a new Component.  
	    Component component = new Component();  

	    // Add a new HTTP server listening on port 8183.  
	    component.getServers().add(Protocol.HTTP, 8183);  

	    // Attach the sample application.  
	    component.getDefaultHost().attach("/analyArchitecture",  
	            new HelloWorldResourceApplication());  

	    // Start the component.  
	    component.start();  
	}

}
