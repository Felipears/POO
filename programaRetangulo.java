
public class programaRetangulo {

	public static void main(String[] args) {

		Retangulo r1 = new Retangulo(15,15);
		
		System.out.printf("�rea do Retangulo: %.2f\n", r1.area());
		System.out.printf("Per�metro do Retangulo: %.2f\n", r1.perimetro());
		if(r1.quadrado()) {
			System.out.println("Retangulo quadrado");
		}
		else {
			System.out.println("Retangulo n�o � quadrado");
		}
		

	}

}
