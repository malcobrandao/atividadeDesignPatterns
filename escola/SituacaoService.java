package service;
import model.Aluno;
	public class SituacaoService {
	    private Situacao situacaoChain;

	    public SituacaoService() {
	        buildChainOfResponsibility();
	    }

	    private void buildChainOfResponsibility() {
	        situacaoChain = new ReprovadoPorFalta();
	        Situacao reprovadoPorNota = new ReprovadoPorNota();
	        Situacao exame = new Exame();
	        Situacao aprovado = new Aprovado();

	        situacaoChain.setProximo(reprovadoPorNota);
	        reprovadoPorNota.setProximo(exame);
	        exame.setProximo(aprovado);
	    }

	    public String processarSituacao(Aluno aluno) {
	        return situacaoChain.processarSituacao(aluno);
	    }
	}

