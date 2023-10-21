package service;

import model.Aluno;

public abstract class Situacao {
    protected Situacao proximo;

    public void Proximo(Situacao Proximo) {
        this.proximo = Proximo;
    }

    public abstract String processarSituacao(Aluno aluno);

    protected String chamarProximo(Aluno aluno) {
        if (proximo != null) {
            return proximo.processarSituacao(aluno);
        }
        return null;
    }

	public Situacao getProximo() {
		return proximo;
	}

	public void setProximo(Situacao proximo) {
		this.proximo = proximo;
	}
}


