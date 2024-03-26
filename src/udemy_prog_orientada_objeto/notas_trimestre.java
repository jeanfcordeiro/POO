package udemy_prog_orientada_objeto;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class notas_trimestre {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluno aluno = new Aluno();		
		System.out.println("Aluno: ");
		aluno.nome = sc.nextLine();		
		aluno.nota1 = sc.nextDouble();
		aluno.nota2 = sc.nextDouble();
		aluno.nota3 = sc.nextDouble();
		
		System.out.printf("FINAL GRADE: %.2f%n ", aluno.finalGrade());
	
		if (aluno.finalGrade() > 60) {
			System.out.println("PASS");
		} else {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2F POINTS%n", aluno.pontosFaltantes());
		}
		sc.close();
	}

}
