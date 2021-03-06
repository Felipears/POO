public class Funcionario {
	
	private String nome;
	private double horas;
	private double valorHora;
	
	public Funcionario(String nome, double horas, double valorHora) {
		super();
		this.nome = nome;
		this.horas = horas;
		this.valorHora = valorHora;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getHoras() {
		return horas;
	}
	public void setHoras(double horas) {
		this.horas = horas;
	}
	public double getValorHora() {
		return valorHora;
	}
	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}
	
	public double salario() {
		
		return horas*valorHora;
	}
	
	@Override
	public String toString() {
		return "Nome: " + nome + " Sal�rio: " + salario();
	}
	public void imprimeNome() {
		
		System.out.print("Nome: " + nome + " ");
	}
	
	
}
