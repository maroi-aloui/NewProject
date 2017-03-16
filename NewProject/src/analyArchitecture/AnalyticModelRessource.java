package analyArchitecture;

import javax.ws.rs.Path;
import org.restlet.resource.Put;
import org.restlet.resource.Get;
import org.restlet.resource.Post;
import org.restlet.resource.Delete;
import org.restlet.resource.ServerResource;



public class AnalyticModelRessource extends ServerResource {
	@Get
	@Path("/get")
    public void getModel() {
       
    }
	
	@Put
	@Path("/put")
    public void putModel() {
       
    }
	
	@Post
	@Path("/post")
    public void posteModel() {
       
    }
	@Delete
	@Path("/delete")
    public void deleteModel() {
       
    }
	
	public LogIngestorRessource getLogIngestor(){
		return new LogIngestorRessource ();
	       
	    }
}

