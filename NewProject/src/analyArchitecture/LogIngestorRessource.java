package analyArchitecture;

import javax.ws.rs.Consumes;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

import org.restlet.resource.Delete;
import org.restlet.resource.Get;
import org.restlet.resource.Post;
import org.restlet.resource.Put;
import org.restlet.resource.ServerResource;

public class LogIngestorRessource extends ServerResource {
	@Get
	@Path("/get")
    public String getLogIngestor() {
       return "maroi";
    }
	
	@Put
	@Path("/put")
	@Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public String putLogIngestor(Logs obj) {
      return "aloui";
    }
	
	@Post
	@Path("/post")
    public void posteLogIngestor() {
       
    }
	@Delete
	@Path("/delete")
    public void deleteLogIngestor() {
       
    }

}
