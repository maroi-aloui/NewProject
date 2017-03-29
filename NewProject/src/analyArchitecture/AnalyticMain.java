package analyArchitecture;

import org.restlet.Component;
import org.restlet.data.Protocol;
import org.restlet.resource.ClientResource;

import analyArchitecture.RessourceApplication;
import java.lang.reflect.Field;

public class AnalyticMain {
	public static void main(String[] args) throws Exception {  
	    try{
	    // Create a new Component.  
	    Component component = new Component();  

	    // Add a new HTTP server listening on port 8183.  
	    
	    component.getServers().add(Protocol.HTTP, 8183);  
	  
	    // Attach the sample application.  
	    component.getDefaultHost().attach("/analyArchitecture",  
	            new RessourceApplication());  

	    // Start the component.  
	    component.start();  
	    
	    //Debut generate Logs
	    Logs obj = new Logs();
	    
        Field[] fields = obj.getClass().getDeclaredFields();
        for (Field field : fields)
        {
            field.setAccessible(true);
            System.out.println(field.getName() + " -> " + field.get(obj));
        }
	    //Fin LOgs
	    
	    
	    }
	    catch (Exception e){
	    }
	    
	    //client
	    ClientResource resource = new ClientResource ("http://localhost:8183/analyArchitecture/LogIngestor");
	    resource.put(new Object ()).write(System.out);
	
	}
	

}
