package service;

import model.Aluno;


	public class Exame extends Situacao {
	    @Override
	    public String processarSituacao(Aluno aluno) {
	        if (aluno.getNota() < 7) {
	            return "Exame";
	        }
	        return chamarProximo(aluno);
	    }
	}

