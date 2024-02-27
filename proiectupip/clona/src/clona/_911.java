package clona;



class _911 extends Porsche {

    private Masina masina;

    public _911(Masina masina1) {
    	
        this.masina = masina1;
        
    }

    
    public String modelMasina() {
    	
       return "Sports Car";
       
    }

    
    public String locatieProductie() {
    	
        return masina.locatieProductie() + "";
        
    }

    
    public String motorizare() {
    	
        return masina.motorizare() + " Motor boxer in 6 cilindri ";
        
    }
    
    public Integer pretmediu() {
		
		return super.pretmediu() + 75000;
		
	}
    
    public Integer caiputere()
	{
		return super.caiputere() + 100;
	}

}