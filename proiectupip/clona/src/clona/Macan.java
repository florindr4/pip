package clona;



class Macan extends Porsche{
	
	 private Masina masina;

	    public Macan(Masina masina3) {
	    	
	        this.masina = masina3;
	       
	    }
	
	
	public String modelMasina()
	{
		return super.modelMasina();
	}
	
	
	public String locatieProductie() {
		
		return super.locatieProductie()+"";
		
	}

	
	public String motorizare() {
		
		return super.motorizare() + " Motor I4 sau V6 ";
	}

	
	public Integer pretmediu() {
		
		return super.pretmediu() - 15000;
		
	}
	
	public Integer caiputere()
	{
		return super.caiputere() - 150;
	}

	

}
