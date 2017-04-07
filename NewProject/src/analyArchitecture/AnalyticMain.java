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

			component.getServers().add(Protocol.HTTP, 8183);  

			// Attach the sample application.  
			component.getDefaultHost().attach("/analyArchitecture",  
					new RessourceApplication());  

			// Start the component.  
			component.start();  



			//Debut generate Logs

			int nombreDeLogs = 10;
			for(int i=0 ; i<nombreDeLogs; i++) {
				Logs obj = Logs.generateNewLog();

				Gson gson = new Gson();

				String json = gson.toJson(obj);

				System.out.println(json);
				
				//client
				ClientResource resource = new ClientResource ("http://localhost:8183/analyArchitecture/LogIngestor");
				resource.put(json).write(System.out);
				
				//Thread.sleep(100);


			}


			/*try (BufferedWriter bw = new BufferedWriter(new FileWriter("c:/Logs/file.json"))) {

				bw.write(json);
				System.out.println("Done");

			} catch (IOException e) {

				e.printStackTrace();

			}

			System.out.println(json);
			// System.exit(0); 
			*/

		}

		catch (Exception e){
			System.out.println(e.toString());
		}
			 
			


		}


	}
