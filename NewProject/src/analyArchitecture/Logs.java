package analyArchitecture;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Logs {
	// Attributes
		private int id; //l.id de la requete 
		private double date; //date et heure a la quel la requete recu
		private String nomServeur; //nom de serveur cache
		private String addIp; //adresse IP de l'user
		private String evenemnet; //evenement produit "play,stop,..."
		
		
		
			public Logs(int id, double date, String nomServeur,String addIp, String evenemnet){
				this.id = id;
				this.date = date;
				this.nomServeur = nomServeur;
				this.addIp = addIp;
				this.evenemnet = evenemnet;
				
			}
		
			public Logs() {
				// TODO Auto-generated constructor stub
			}

			public int getId()
		    {
		        return id;
		    }
		 
		    public void setId(int id)
		    {
		        this.id = id;
		    }
		    
		    public double getDate()
		    {
		        return date;
		    }
		 
		    public void setDate(double date)
		    {
		        this.date = date;
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
		    
		    static Logs generateNewLog()
		    {
		    	Random randomGenerator = new Random();
		    	List<String> serveurs = Arrays.asList("ABC1", "ABC2", "ABC3");
		    	List<String> actions = Arrays.asList("play", "Stop", "FW", "RW");
		    	
		    	Logs obj = new Logs();
		 	    obj.setId(1010);
		 	    obj.setAddIp("192.123.01.235");
		 	    obj.setDate(13568688);
		 	    int index = randomGenerator.nextInt(actions.size());
		 	    obj.setEvenemnet(actions.get(index));
		 	   int index2 = randomGenerator.nextInt(serveurs.size());
		 	    obj.setNomServeur(serveurs.get(index));
		        return obj;
		    }
}
