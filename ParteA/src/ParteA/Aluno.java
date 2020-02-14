package ParteA;

import ParteB.Curso;

public class Aluno {
    private Curso curso;
    private String nome;
    private String sobrenome;
    private int codigoDoAluno;

    public Aluno(String nome, String sobrenome, int codigoDoAluno) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.codigoDoAluno = codigoDoAluno;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getCodigoDoAluno() {
        return codigoDoAluno;
    }

    public void setCodigoDoAluno(int codigoDoAluno) {
        this.codigoDoAluno = codigoDoAluno;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;

        return codigoDoAluno == aluno.codigoDoAluno;
    }
}
