package exercicio;

public class Principal {

	public static void main(String[] args) {
		Aluno a1=new Aluno("Wollys",8.0);
		Aluno a2=new Aluno("Pablo",7.0);
		Aluno a3=new Aluno("fksjdflsd",2.0);
		
		Vetor alunos=new Vetor();
		alunos.adiciona(a1);
		alunos.adiciona(a2);
		alunos.adiciona(a3);
		
		System.out.println(alunos.remove(4));
		
		Aluno x=alunos.getAlunoP(4);
		if (x!=null) {
			System.out.println(x);
		}else {
			System.out.println("Posição Inválida!");
		}
		
	}

}
