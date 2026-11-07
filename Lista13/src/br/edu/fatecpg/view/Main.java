package br.edu.fatecpg.view;

import java.util.ArrayList;
import java.util.List;

import br.edu.fatecpg.controller.AlunoController;
import br.edu.fatecpg.javalista.model.Aluno;

public class Main {

	 public static void main(String[] args) {

	        AlunoController ac = new AlunoController();

	        Aluno a1 = new Aluno(10, "Ale", "DSH", 5);

	        ac.setAluno(a1);
	        ac.setAluno(new Aluno(40, "Aline", "ADS", 6));
	        ac.setAluno(new Aluno(20, "Ana", "DSH", 1));
	        ac.setAluno(new Aluno(80, "Maria", "COMEX", 2));

	        System.out.println("LISTA DE ALUNOS:");
	        System.out.println(ac.mostrarAlunos());

	        System.out.println("INDEX DA MATRICULA 20:");
	        System.out.println(ac.localizarIndex(20));

	        ac.removerAluno(1);

	        System.out.println("LISTA APOS REMOVER:");
	        System.out.println(ac.mostrarAlunos());

	        ac.virarSemestre();

	        System.out.println("LISTA APOS VIRADA DE SEMESTRE:");
	        System.out.println(ac.mostrarAlunos());

	        ac.limparLista();

	        System.out.println("LISTA APOS LIMPAR:");
	        System.out.println(ac.mostrarAlunos());

	    }
}
