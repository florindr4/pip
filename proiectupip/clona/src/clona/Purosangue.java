package clona;

class Purosangue extends Ferrari {

    private Masina masina;

    public Purosangue(Masina masina1) {
    	
        this.masina = masina1;
        
    }

    
    public String modelMasina() {
    	
       return super.modelMasina() + "SUV";
       
    }

    
    public String locatieProductie() {
    	
        return masina.locatieProductie() + "";
        
    }

    
    public String motorizare() {
    	
        return masina.motorizare() + " Motor V12 aspirat natural ";
        
    }
    
    public Integer pretmediu() {
		
		return super.pretmediu() + 175000;
		
	}
    
    public Integer caiputere()
	{
		return super.caiputere() + 200;
	}

}