package ifsc;

import java.util.ArrayList;

public class MainPessoa {
	
	
	public static void main(String[] args) {
		ArrayList<Aluno> Alunos  = new ArrayList<>();

		Aluno aluno = new Aluno();
		aluno.setNome("Águida ");
		aluno.setCpf(123456789l);
		
		Alunos.add(aluno);
		
		System.out.println(aluno.getNome());
		System.out.println(aluno.getCpf());
		
	
		ArrayList<Professor> Professor  = new ArrayList<>();
		Professor professor = new Professor();
		professor.setNome("Marta ");
		professor.setCpf(123456789l);
		
		Professor.add(professor);
		
		System.out.println(professor.getNome());
		System.out.println(professor.getCpf());
	
	}

}
	
