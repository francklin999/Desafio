package ParteG;

import PartdeD.ProfessorAdjunto;
import PartdeD.ProfessorTitular;
import ParteA.Aluno;
import ParteB.Curso;
import ParteC.Professor;
import ParteE.Matricula;

import java.util.ArrayList;
import java.util.List;

public class DigitalHouseManager {

    List<Aluno> listaDeAlunos = new ArrayList<>();
    List<Matricula> listaDeMatricula = new ArrayList<>();
    List<Curso> listaDeCursos = new ArrayList<>();
    List<Professor> listaDeProfessores = new ArrayList<>();

    public void registrarCurso(String nome, Integer codigoCurso,Integer quantidadeMaximaDeAlunos){
        Curso curso = new Curso(nome,codigoCurso,quantidadeMaximaDeAlunos);
        listaDeCursos.add(curso);
        System.out.println("********Curso adicionado********");
    }

    public void excluirCurso(Integer codigoCurso){
        listaDeCursos.remove(codigoCurso);
        System.out.println("********Curso removido********");
    }

    public void registrarProfessorAdjunto(String nome,String sobrenome, Integer codigoProfessor, Integer quantidadeDeHoras){
        ProfessorAdjunto professorAdjunto = new ProfessorAdjunto(nome,sobrenome,0,codigoProfessor, quantidadeDeHoras);
        listaDeProfessores.add(professorAdjunto);
        System.out.println("********Professor adjunto********");
    }

    public void registrarProfessorTitular(String nome, String sobrenome, Integer codigoProfessor, String especialidade){
        ProfessorTitular professorTitular = new ProfessorTitular(nome,sobrenome,codigoProfessor,especialidade,0);
        listaDeProfessores.add(professorTitular);
        System.out.println("********Professor titular********");
    }

    public void excluirProfessor(Integer codigoProfessor){
        listaDeProfessores.remove(codigoProfessor);
        System.out.println("********Professor titular********");
    }

    public void matricularAluno(String nome, String sobrenome,Integer codigoAluno){
        Aluno aluno = new Aluno(nome,sobrenome,codigoAluno);
        listaDeAlunos.add(aluno);
        System.out.println("********Aluno matriculado********");
    }

    public void matricularAlunoNoCurso(Integer codigoAluno, Integer codigoCurso){
        Aluno aluno = null;
        Curso curso = null;
//        Matricula matricula = null;
        for (Curso index: listaDeCursos) {
            if(index.equals(codigoCurso)  &&  (listaDeCursos.size() < curso.getQtdMaxAlunos() )){
                curso = index;
            }else{
                System.out.println("********Não há vagas no curso********");
            }
        }

        for (Aluno index:listaDeAlunos) {
            if (index.equals(codigoAluno)){
                aluno = index;
            }
        }

        if (aluno != null && curso != null){
            Matricula  matricula = new Matricula(aluno,curso);
            listaDeMatricula.add(matricula);
            listaDeCursos.get().adicionarUmAluno(aluno);
            System.out.println("********Aluno matriculado no curso********");
        }else if (aluno == null){
            System.out.println("********Aluno não encontrado********");
        }else if (curso == null){
            System.out.println("********Curso não encontrado********");
        }

    }

    public void alocarProfessores(Integer codigoCurso, Integer codigoProfessorTitular, Integer codigoProfessorAdjunto) {
        Curso curso ;
        ProfessorTitular professorTitular = null ;
        ProfessorAdjunto professorAdjunto = null;

        for (Professor index : listaDeProfessores) {
            if (index.equals(codigoProfessorTitular) && index.equals(codigoProfessorAdjunto)){
                professorTitular = (ProfessorTitular)index;
                professorAdjunto = (ProfessorAdjunto)index;
            }else {
                System.out.println("********Professor não encontrado********");
            }
        }

        for (Curso index: listaDeCursos){
            if (index.equals(codigoCurso)){
                curso = index;
            }else{
                System.out.println("********Curso não encontrado********");
            }
        }

        if (professorAdjunto != null && professorTitular != null){
            listaDeCursos.get().setProfessorAdjunto(professorAdjunto);
            System.out.println("********Professores adicionados********");
        }else if (professorAdjunto == null){
            System.out.println("********Professor adjunto não encontrado********");
        }else if (professorTitular == null){
            System.out.println("********Professor titular não encontrado********");
        }

    }
}
