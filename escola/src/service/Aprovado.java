package service;

import model.Aluno;

public class Aprovado extends Situacao {
    @Override
    public String processarSituacao(Aluno aluno) {
        return "Aprovado";
    }
}
