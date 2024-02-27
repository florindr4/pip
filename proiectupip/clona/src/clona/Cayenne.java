package clona;


class Cayenne extends Porsche{
	
	 private Masina masina;

	    public Cayenne(Masina masina2) {
	    	
	        this.masina = masina2;
	        
	    }
	
	 
	 public String modelMasina()
	 {
		 return "SUV";
	 }
	 
	 public String locatieProductie()
	 {
		 return super.locatieProductie()+" ";
	 }
	 
	public String motorizare()
	{
		return super.motorizare()+" Motor tip V in 6 sau 8 cilindri ";
	}

	public Integer pretmediu() 
	{
		return super.pretmediu() + 15000;
	}
	
	public Integer caiputere()
	{
		return super.caiputere() - 25;
	}


}
