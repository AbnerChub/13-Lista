package br.edu.fatecpg.controller;

import java.util.ArrayList;
import java.util.List;

import br.edu.fatecpg.javalista.model.Aluno;


public class AlunoController {
	
	 private List<Aluno> listaAlunos;

	    public AlunoController() {
	        listaAlunos = new ArrayList<>();
	    }

	    public void setAluno(Aluno a) {
	        listaAlunos.add(a);
	    }

	    public Aluno getAluno(int index) {
	        return listaAlunos.get(index);
	    }

	    public String mostrarAlunos() {
	        StringBuilder sb = new StringBuilder();

	        for (Aluno a : listaAlunos) {
	            sb.append(a.toString() + "\n");
	        }

	        return sb.toString();
	    }

	    public void removerAluno(int index) {
	        listaAlunos.remove(index);
	    }

	    public int localizarIndex(int matricula) {
	        for (int i = 0; i < listaAlunos.size(); i++) {

	            if (listaAlunos.get(i).getMatricula() == matricula) {
	                return i;
	            }
	        }

	        return -1;
	    }

	    public void limparLista() {
	        listaAlunos.clear();
	    }

	    public void virarSemestre() {
	        for (Aluno a : listaAlunos) {
	            a.setCiclo(a.getCiclo() + 1);
	        }
	    }

}
