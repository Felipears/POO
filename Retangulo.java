
public class Retangulo {
	
	private int base;
	private int altura;
	
	public double area() {
		return base*altura;
	}
	public Retangulo(int base, int altura) {
		super();
		this.base = base;
		this.altura = altura;
	}
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	public double perimetro() {
		return 2*base + 2*altura;
	}
	
	public boolean quadrado() {
		if(base == altura) {
			return true;
		}
		
		return false;
	}
}
