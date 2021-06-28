package exercicio;

public class Principal {

	public static void main(String[] args) {
		Aluno a1=new Aluno("Wollys",8.0);
		Aluno a2=new Aluno("Pablo",7.0);
		Aluno a3=new Aluno("fksjdflsd",2.0);
		Aluno a4=new Aluno("teste",6.0);
		
		Vetor alunos=new Vetor();
		alunos.adiciona(a1);
		alunos.adiciona(a2);
		alunos.adiciona(a3);
		alunos.adiciona(a4);
		
		alunos.getLista();
		System.out.println("\n"+alunos.remove(2));
		alunos.getLista();
		
		System.out.println("\n"+alunos.remove(4));
		
		Aluno x=alunos.getAlunoP(2);
		if (x!=null) {
			System.out.println("\n"+x);
		}else {
			System.out.println("Posição Inválida!");
		}	
	}

}
