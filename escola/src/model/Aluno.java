package model;

public class Aluno {
    private int id;
    private String nome;
    private String turma;
    private double nota;
    private int frequencia;

    public Aluno() {
    }

    public static class AlunoBuilder {
        private int id;
        private String nome;
        private String turma;
        private double nota;
        private int frequencia;

        public AlunoBuilder setId(int id) {
            this.id = id;
            return this;
        }

        public AlunoBuilder setNome(String nome) {
            this.nome = nome;
            return this;
        }

        public AlunoBuilder setTurma(String turma) {
            this.turma = turma;
            return this;
        }

        public AlunoBuilder setNota(double nota) {
            this.nota = nota;
            return this;
        }

        public AlunoBuilder setFrequencia(int frequencia) {
            this.frequencia = frequencia;
            return this;
        }

        public Aluno build() {
            return new Aluno(id, nome, turma, nota, frequencia);
        }
    }

    public Aluno(int id, String nome, String turma, double nota, int frequencia) {
        this.id = id;
        this.nome = nome;
        this.turma = turma;
        this.nota = nota;
        this.frequencia = frequencia;
    }

    public void setId(int id) {
		this.id = id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setTurma(String turma) {
		this.turma = turma;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	public void setFrequencia(int frequencia) {
		this.frequencia = frequencia;
	}

	public int getFrequencia() {
        return frequencia;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getTurma() {
        return turma;
    }

    public double getNota() {
        return nota;
    }
}
