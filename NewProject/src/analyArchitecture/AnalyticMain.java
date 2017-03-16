package analyArchitecture;

import org.restlet.Component;
import org.restlet.data.Protocol;

import analyArchitecture.RessourceApplication;

public class AnalyticMain {
	public static void main(String[] args) throws Exception {  
	    // Create a new Component.  
	    Component component = new Component();  

	    // Add a new HTTP server listening on port 8182.  
	    component.getServers().add(Protocol.HTTP, 8187);  

	    // Attach the sample application.  
	    component.getDefaultHost().attach("/analyArchitecture",  
	            new RessourceApplication());  

	    // Start the component.  
	    component.start();  
	}

}
