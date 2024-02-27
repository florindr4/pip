package clona;



public class Dodge implements Masina {
	
	String tara = " SUA ";
	String continent = " America de Nord ";
	String motorizarea = "";
	
	
	public String modelMasina()
	{
		return " Muscle Car ";
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
		return 55000;
	}
	
	public Integer caiputere()
	{
		return 400;
	}

}