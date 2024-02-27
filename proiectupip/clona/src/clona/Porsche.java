package clona;


public  class Porsche implements Masina {
	
	String tara = " Germania ";
	String continent = " Europa ";
	String motorizarea = "";
	
	
	public String modelMasina()
	{
		return " Luxury / Sport cars () ";
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
		return 125000;
	}
	
	public Integer caiputere()
	{
		return 500;
	}

}