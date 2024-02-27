package clona;


public  class Toyota implements Masina {
	
	String tara = " Japonia ";
	String continent = " Asia ";
	String motorizarea = "";
	
	
	public String modelMasina()
	{
		return " Mid-Class Vehicle ";
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
		return 37500;
	}
	
	public Integer caiputere()
	{
		return 150;
	}

}
