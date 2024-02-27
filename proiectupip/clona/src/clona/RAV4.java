package clona;



class RAV4 extends Toyota {

    private Masina masina;

    public RAV4(Masina masina1) {
    	
        this.masina = masina1;
        
    }

    
    public String modelMasina() {
    	
       return "SUV";
       
    }

    
    public String locatieProductie() {
    	
        return masina.locatieProductie() + "";
        
    }

    
    public String motorizare() {
    	
        return masina.motorizare() + " Motor I4 / V6 / V8 ";
        
    }
    
    public Integer pretmediu() {
		
		return super.pretmediu() + 12500;
		
	}
    
    public Integer caiputere()
	{
		return super.caiputere() + 50;
	}

}