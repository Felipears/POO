
public class Calculo {
	
	private int saldo;

	public int getSaldo() {
		return saldo;
	}

	public void credito(int valor) {
		saldo+=valor;
	}
	
	public void debito(int valor) {
		saldo-=valor;
	}
	
}
