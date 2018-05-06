package cat.xtec.figures;

public class Circulo {

	private static final double PI=3.14; 
	private double radi;

	public Circulo(double radi) {
		super();
		this.radi = radi;
	}

	public double getRadi() {
		return radi;
	}

	public void setRadi(double radi) {
		this.radi = radi;
	}
	
	public double area(double radi) {
		double pi=Math.pow(2, PI);
		return this.radi*pi;
	}
	
	public double perimetre(double radi){
		return 2*PI*radi;
	}
	
}
