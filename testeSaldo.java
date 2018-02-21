
public class testeSaldo {

	public static void main(String[] args) {

		Calculo calculo = new Calculo();
		
		calculo.credito(1000);
		calculo.debito(500);
		System.out.println(calculo.getSaldo());

	}

}
