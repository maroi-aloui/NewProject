package analyArchitecture;

import org.restlet.Component;
import org.restlet.data.Protocol;
import org.restlet.resource.ClientResource;

import analyArchitecture.RessourceApplication;


import java.io.FileWriter;
import java.lang.reflect.Field;

public class AnalyticMain {
	public static void main(String[] args) throws Exception {  
	    try{
	    	
	    // Create a new Component.  
	    Component component = new Component();  

	    // Add a new HTTP server listening on port 8183.  
	    
	    component.getServers().add(Protocol.HTTP, 8482);  
	  
	    // Attach the sample application.  
	    component.getDefaultHost().attach("/analyArchitecture",  
	            new RessourceApplication());  

	    // Start the component.  
	    component.start();  
	    
	    /*
	    Logs obj = new Logs();
	    @SuppressWarnings("resource")
		FileWriter file = new FileWriter("c:/Logs/file2.json");
	    file.write(obj.getNomServeur());
        file.flush();
        	*/
        
	   //Debut generate Logs
	     Logs obj = new Logs();
        Field[] fields = obj.getClass().getDeclaredFields();
        for (Field field : fields)
        {
            field.setAccessible(true);
            System.out.println(field.getName() + " -> " + field.get(obj));
            FileWriter file = new FileWriter("c:/Logs/file3.json");
	    	file.write((int) field.get(obj));
        	file.flush();
        }  
	    // Fin LOgs
	    

	     /*
	    Gson gson = new Gson();
	    Logs obj = new Logs();

		// 1. Java object to JSON, and save into a file
		gson.toJson(obj, new FileWriter("c:/Logs/file.json"));
	   	*/
	  
	    }
	   
	    catch (Exception e){
	    	System.out.println(e.toString());
	    }
	   
	    //client
	    ClientResource resource = new ClientResource ("http://localhost:8183/analyArchitecture/LogIngestor");
	    resource.put(new Object ()).write(System.out);
	
	  
	}
	

}
