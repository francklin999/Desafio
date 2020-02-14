package ParteE;

import ParteA.Aluno;
import ParteB.Curso;

import java.util.Date;

public class Matricula {

    private Aluno aluno;
    private Curso curso;
    private Date data;

    public Matricula(Aluno aluno, Curso curso, Date data) {
        this.aluno = aluno;
        this.curso = curso;
        this.data = data;
    }

    public Matricula(Aluno aluno, Curso curso) {
        this.aluno = aluno;
        this.curso = curso;
    }

//    Date dataDoDia = new Date(); criar no main
}
