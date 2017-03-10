package analyArchitecture;

import org.restlet.Application;
import org.restlet.Restlet;
import org.restlet.routing.Router;


public class RessourceApplication extends Application {

	@Override
	public synchronized Restlet createInboundRoot() {
		
		// Create a router Restlet that routes each call to a
		Router router = new Router(getContext());
		router.attach("/LogIngestor", LogIngestorRessource.class);
		//router.attach("/AnalyticModel", AnalyticModelRessource.class);
		return router;
		
	}
}
