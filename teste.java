
public class teste {

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa();
		Pessoa p2 = new Pessoa();
		
		p1.setNome("Nome1");
		p1.setIdade("20");
		p1.setCpf("111.111.111-11");
		
		p2.setNome("Nome2");
		p2.setIdade("21");
		p2.setCpf("222.222.222-22");
		
		System.out.println("Pessoa 1 : " + p1.getNome()+ " " + p1.getIdade()+ " " + p1.getCpf());
		System.out.println("Pessoa 2 : " + p2.getNome()+ " " + p2.getIdade()+ " " + p2.getCpf());
		
		
	}

}
