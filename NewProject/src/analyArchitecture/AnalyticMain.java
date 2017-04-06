package analyArchitecture;

import org.restlet.Component;
import org.restlet.data.Protocol;
import org.restlet.resource.ClientResource;

import com.google.gson.Gson;

import analyArchitecture.RessourceApplication;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;

public class AnalyticMain {
	public static void main(String[] args) throws Exception {  
	    try{
	    	
	    // Create a new Component.  
	    Component component = new Component();  

	    // Add a new HTTP server listening on port 8183.  
	    
	    component.getServers().add(Protocol.HTTP, 819);  
	  
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
	    Logs obj = Logs.generateNewLog();
	
	  
	    /*
        Field[] fields = obj.getClass().getDeclaredFields();
        FileWriter file = new FileWriter("c:/Logs/file3.json");
        for (Field field : fields)
        {
            field.setAccessible(true);
            System.out.println(field.getName() + " -> " + field.get(obj));
            
	    	file.write((String) field.get(obj));
        	file.flush();
        }  
	    // Fin LOgs
	    */

	     
	    Gson gson = new Gson();
	   
	    String json = gson.toJson(obj);
	    
	    try (BufferedWriter bw = new BufferedWriter(new FileWriter("c:/Logs/file.json"))) {

			bw.write(json);
			System.out.println("Done");

		} catch (IOException e) {

			e.printStackTrace();

		}
	    
	    System.out.println(json);
	    // System.exit(0); 
	
	  
	    }
	   
	    catch (Exception e){
	    	System.out.println(e.toString());
	    }
	   
	    //client
	    ClientResource resource = new ClientResource ("http://localhost:8183/analyArchitecture/LogIngestor");
	    resource.put(new Object ()).write(System.out);
	
	  
	}
	

}
