package analyArchitecture;

public class Logs {
	// Attributes
		public int id; //l.id de la requete 
		public double date; //date et heure a la quel la requete recu
		public String nomServeur; //nom de serveur cache
		public double addIp; //adresse IP de l'user
		public String evenemnet; //evenement produit "play,stop,..."
		
		
		
			public Logs(int id, double date, String nomServeur,double addIp, String evenemnet){
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
		    
		    public double getAddIp()
		    {
		        return addIp;
		    }
		 
		    public void setAddIp(double addIp)
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
}
