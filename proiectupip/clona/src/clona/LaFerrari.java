package clona;



class LaFerrari extends Ferrari {

    private Masina masina;

    public LaFerrari(Masina masina1) {
    	
        this.masina = masina1;
        
    }

    
    public String modelMasina() {
    	
       return "Hyper-Car hybrid";
       
    }

    
    public String locatieProductie() {
    	
        return masina.locatieProductie() + "";
        
    }

    
    public String motorizare() {
    	
        return masina.motorizare() + " Motor V12 aspirat natural ";
        
    }
    
    public Integer pretmediu() {
		
		return super.pretmediu() + 2000000;
		
	}
    
    public Integer caiputere()
	{
		return super.caiputere() + 325;
	}

}