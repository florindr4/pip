package clona;



class Taycan extends Porsche{
	
	 private Masina masina;

	    public Taycan(Masina masina4) {
	    	
	        this.masina = masina4;
	        
	    }
	
	 
	 public String modelMasina()
	 {
		 return " Electric vehicle ";
	 }
	 
	 public String locatieProductie()
	 {
		 return super.locatieProductie()+"";
	 }
	
	
	public String motorizare()
	{
		return super.motorizare() + " Motor electric ";
	}

	
	public Integer pretmediu() {
		
		return super.pretmediu() + 50000;
	}
	
	public Integer caiputere()
	{
		return super.caiputere();
	}


}
