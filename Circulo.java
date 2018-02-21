public class Circulo {
	
	public Circulo(int raio) {
		super();
		this.raio = raio;
	}

	public int getRaio() {
		return raio;
	}

	@Override
	public String toString() {
		return "Area: " + calcularArea() + " Perimetro: " + calcularPerimetro();
	}

	public void setRaio(int raio) {
		this.raio = raio;
	}

	private int raio;
	
	double calcularArea() {
		return raio*raio*Math.PI;
	}
	
	double calcularPerimetro() {
		return 2*Math.PI*raio;
	}
}