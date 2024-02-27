package clona;



public  class Ferrari implements Masina {
	
	String tara = " Italia ";
	String continent = " Europa ";
	String motorizarea = "";
	
	
	public String modelMasina()
	{
		return " Super car ";
	}
	
	public String locatieProductie()
	{
		return " Tara : " + tara + "\n" + " Continentul : " + continent + "\n";
	}
	
	public String motorizare()
	{
		return motorizarea;
	}
	
	public Integer pretmediu()
	{
		return 300000;
	}
	
	public Integer caiputere()
	{
		return 550;
	}

}
