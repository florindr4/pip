package clona;



class _488 extends Ferrari {

    private Masina masina;

    public _488(Masina masina1) {
    	
        this.masina = masina1;
        
    }

    
    public String modelMasina() {
    	
       return super.modelMasina();
       
    }

    
    public String locatieProductie() {
    	
        return masina.locatieProductie() + "";
        
    }

    
    public String motorizare() {
    	
        return masina.motorizare() + " Motor V8 aspirat natural ";
        
    }
    
    public Integer pretmediu() {
		
		return super.pretmediu() + 75000;
		
	}
    
    public Integer caiputere()
	{
		return super.caiputere() + 50;
	}

}