
public class principal {

	public static void main(String[] args) {

		Aluno a1 = new Aluno("Ana",10,9);
		Aluno a2 = new Aluno("Beto",9,10);
		
		System.out.println(a1 + "" + a1.media());
		System.out.println(a2 + "" + a2.media());
		
	}

}
