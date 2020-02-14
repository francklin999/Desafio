package ParteB;

import PartdeD.ProfessorAdjunto;
import PartdeD.ProfessorTitular;
import ParteA.Aluno;

import java.util.List;


public class Curso {
    private ProfessorTitular professorTitular;
    private ProfessorAdjunto professorAdjunto;
    private String nomeDoCurso;
    private int codigoDoCurso;
    private int qtdMaxAlunos;
    List<Aluno> listaDeAlunos;

    public Curso(String nomeDoCurso, int codigoDoCurso, int qtdMaxAlunos) {
        this.nomeDoCurso = nomeDoCurso;
        this.codigoDoCurso = codigoDoCurso;
        this.qtdMaxAlunos = qtdMaxAlunos;
    }

    public Curso(int codigoDoCurso, ProfessorTitular codigoTitular,ProfessorAdjunto codigoAdjunto) {
        this.codigoDoCurso = codigoDoCurso;
    }

    public Curso(String nomeDoCurso, int codigoDoCurso, ProfessorTitular professorTitular, ProfessorAdjunto professorAdjunto, int quantidadeMaxima) {
        this.nomeDoCurso = nomeDoCurso;
        this.codigoDoCurso = codigoDoCurso;
        this.qtdMaxAlunos = quantidadeMaxima;
    }

    public ProfessorTitular getProfessorTitular() {
        return professorTitular;
    }

    public void setProfessorTitular(ProfessorTitular professorTitular) {
        this.professorTitular = professorTitular;
    }

    public ProfessorAdjunto getProfessorAdjunto() {
        return professorAdjunto;
    }

    public void setProfessorAdjunto(ProfessorAdjunto professorAdjunto) {
        this.professorAdjunto = professorAdjunto;
    }

    public int getQtdMaxAlunos() {
        return qtdMaxAlunos;
    }

    public void setQtdMaxAlunos(int qtdMaxAlunos) {
        this.qtdMaxAlunos = qtdMaxAlunos;
    }

    public String getNomeDoCurso() {
        return nomeDoCurso;
    }

    public void setNomeDoCurso(String nomeDoCurso) {
        this.nomeDoCurso = nomeDoCurso;
    }

    public int getCodigoDoCurso() {
        return codigoDoCurso;
    }

    public void setCodigoDoCurso(int codigoDoCurso) {
        this.codigoDoCurso = codigoDoCurso;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Curso curso = (Curso) o;
        return codigoDoCurso == curso.codigoDoCurso;
    }

    public Boolean adicionarUmAluno(Aluno umAluno){
        if ( listaDeAlunos.size() > getQtdMaxAlunos()){
           return false;
        }
        System.out.println("********Aluno adicionado********");
        return listaDeAlunos.add(umAluno);
    }

    public void excluirAluno(Aluno umAluno){
        listaDeAlunos.remove(umAluno);
        System.out.println("********Aluno Removido********");
    }
}
