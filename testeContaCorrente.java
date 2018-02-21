
public class testeContaCorrente {

	public static void main(String[] args) {

		ContaCorrente conta = new ContaCorrente();
		
		conta.cadastrarSenha("1234");
		conta.alterarSenha("1234", "1235");
		System.out.println(conta.getSaldo());
		conta.creditar(500,"1235");
		System.out.println(conta.getSaldo());
		conta.debitar(200, "1235");
		System.out.println(conta.getSaldo());
	}

}
