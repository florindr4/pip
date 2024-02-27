package clona;


class Yaris extends Toyota {

    private Masina masina;

    public Yaris(Masina masina1) {
    	
        this.masina = masina1;
        
    }

    
    public String modelMasina() {
    	
       return super.modelMasina() + "Hatchback";
       
    }

    
    public String locatieProductie() {
    	
        return masina.locatieProductie() + "";
        
    }

    
    public String motorizare() {
    	
        return masina.motorizare() + " Motor in linie de 3 / 4 cilindri ";
        
    }
    
    public Integer pretmediu() {
		
		return super.pretmediu() - 5000;
		
	}
    
    public Integer caiputere()
	{
		return super.caiputere() - 25;
	}

}