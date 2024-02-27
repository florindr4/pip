package clona;



class Challenger extends Dodge {

    private Masina masina;

    public Challenger(Masina masina1) {
    	
        this.masina = masina1;
        
    }

    
    public String modelMasina() {
    	
       return super.modelMasina();
       
    }

    
    public String locatieProductie() {
    	
        return masina.locatieProductie() + "";
        
    }

    
    public String motorizare() {
    	
        return masina.motorizare() + " V6 / V8 aspirat natural ";
        
    }
    
    public Integer pretmediu() {
		
		return super.pretmediu() + 15000;
		
	}
    
    public Integer caiputere()
	{
		return super.caiputere() + 125;
	}

}