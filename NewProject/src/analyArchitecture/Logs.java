package analyArchitecture;

import java.lang.reflect.Array;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.UUID;

public class Logs {
	// Attributes
		private UUID id; //l.id de la requete 
		private Timestamp date; //date et heure a la quel la requete recu
		private String nomServeur; //nom de serveur cache
		private String addIp; //adresse IP de l'user
		private String evenemnet; //evenement produit "play,stop,..."
		private String user; // Id user
		private String video; //Id video
		
		final static List<String> serveurs = Arrays.asList("ABC1", "ABC2", "ABC3");
    	final static List<String> actions = Arrays.asList("play", "Stop", "FW", "RW");
    	final static List<String> ips = Arrays.asList("192.123.01.235", "192.123.01.236", "192.123.01.237", "192.123.01.238"
 	    		,"192.123.01.239","192.123.01.240","192.123.01.241");
    	final static List<String> users = Arrays.asList("user1", "user2", "user3", "user4"
 	    		,"user5");
    	final static List<String> videos = Arrays.asList("video1", "video2", "video3", "video4"
 	    		,"video5","video6","video7");
		
		
		
			public Logs(UUID id, Timestamp date, String nomServeur,String addIp, String evenemnet){
				this.id = id;
				this.date = date;
				this.nomServeur = nomServeur;
				this.addIp = addIp;
				this.evenemnet = evenemnet;
				
			}
		
			public Logs() {
				// TODO Auto-generated constructor stub
			}

			public UUID getId()
		    {
		        return id;
		    }
		 
		    public void setId(UUID id2)
		    {
		        this.id = id2;
		    }
		    
		    public Timestamp getDate()
		    {
		        return date;
		    }
		 
		    public void setDate(Timestamp timestamp)
		    {
		        this.date = timestamp;
		    }
		    
		    public String getNomServeur()
		    {
		        return nomServeur;
		    }
		 
		    public void setNomServeur(String nomServeur)
		    {
		        this.nomServeur = nomServeur;
		    }
		    
		    public String getAddIp()
		    {
		        return addIp;
		    }
		 
		    public void setAddIp(String addIp)
		    {
		        this.addIp = addIp;
		    }
		    
		    public String getEvenemnet()
		    {
		        return evenemnet;
		    }
		 
		    public void setEvenemnet(String evenemnet)
		    {
		        this.evenemnet = evenemnet;
		    }
		    
		    public String getUser()
		    {
		        return user;
		    }
		 
		    public void setUser(String user)
		    {
		        this.user = user;
		    }
		    
		    public String getVideo()
		    {
		        return video;
		    }
		 
		    public void setVideo(String video)
		    {
		        this.video = video;
		    }
		    
		    static Logs generateNewLog()
		    {
		    	Random randomGenerator = new Random();
		    	
		    	//create a Log
		    	Logs obj = new Logs();
		    	
		    	//generate random id
		        UUID id = UUID.randomUUID();
		 	    obj.setId(id);
		 	    
		 	   //generate random IP		
		 	   int index = randomGenerator.nextInt(ips.size());
		 	   obj.setAddIp(ips.get(index));
		 	  
		 	   //generate random Evenement		
		 	   int index2 = randomGenerator.nextInt(actions.size());
		 	   obj.setEvenemnet(actions.get(index2));
		 	   
		 	   //generate random Serveur		
		 	   int index3 = randomGenerator.nextInt(serveurs.size());
		 	    obj.setNomServeur(serveurs.get(index3));
		 	   
		 	 //generate random date
		 	   // Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		 	   // obj.setDate(timestamp);
		 	   
		 	//generate random User		
		 	   int index4 = randomGenerator.nextInt(users.size());
		 	   obj.setUser(users.get(index4));
		 	   
		 	   //generate random video		
		 	   int index5 = randomGenerator.nextInt(videos.size());
		 	    obj.setVideo(videos.get(index5));
		 	    
		 	    
		        return obj;
		    }
}
