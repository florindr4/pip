package clona;



class Supra extends Toyota {

    private Masina masina;

    public Supra(Masina masina1) {
    	
        this.masina = masina1;
        
    }

    
    public String modelMasina() {
    	
       return "Sport Car";
       
    }

    
    public String locatieProductie() {
    	
        return masina.locatieProductie() + "";
        
    }

    
    public String motorizare() {
    	
        return masina.motorizare() + " Motor I4 / V6 ";
        
    }
    
    public Integer pretmediu() {
		
		return super.pretmediu() + 22500;
		
	}
    
    public Integer caiputere()
	{
		return super.caiputere() + 150;
	}

}