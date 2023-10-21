package service;

import model.Aluno;

public class ReprovadoPorFalta extends Situacao {
    @Override
    public String processarSituacao(Aluno aluno) {
        if (aluno.getFrequencia() < 75) {
            return "Reprovado por falta";
        }
        return chamarProximo(aluno);
    }
}