
public class ContaCorrente {
	
	private String nome,senha;
	private int saldo;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public int getSaldo() {
		return saldo;
	}
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	
	public void cadastrarSenha(String senha1){
		senha = senha1;
	}
	
	public void alterarSenha(String senha1, String senha2) {
		if(senha1.equals(senha)) {
			senha = senha2;
		}
	}
	
	public void creditar(int valor, String senha1) {
		if(senha1.equals(senha)) {
			saldo+=valor;
		}
	}
	
	public void debitar(int valor, String senha1) {
		if(senha1.equals(senha)) {
			saldo-=valor;
		}
	}
}
