package service;

import model.Aluno;


public class ReprovadoPorNota extends Situacao {
    @Override
    public String processarSituacao(Aluno aluno) {
        if (aluno.getNota() < 4) {
            return "Reprovado por nota";
        }
        return chamarProximo(aluno);
    }
}
