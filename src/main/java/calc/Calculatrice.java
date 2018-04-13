package calc;

public class Calculatrice {
		
	private Calculatrice calculatrice;
	
	private double a;
	private double b;
	
	public Calculatrice() {
		
	}
	
	//Creation de l'objet calculatrice
	
	Calculatrice calculatrice1 = new Calculatrice();
	
	//Fonction additionner
	
	public double additionner (double a, double b) {
		return a+b;
	}
	
	//Fonction soustraire
	
	public double soustraire (double a, double b) {
		return a-b;
	}
	
	//Fonction multiplier
	
	public double multiplier (double a, double b) {
		return a*b;
	}
	
	//Fonction diviser
	
	public double diviser (double a, double b) {
		return a/b;
	}
}