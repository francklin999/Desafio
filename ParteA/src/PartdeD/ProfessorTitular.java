package PartdeD;

import ParteC.Professor;

public class ProfessorTitular extends Professor {
    private String especialidade;

    public ProfessorTitular(String nomeProf, String sobrenomeProf, int codigoProf, String especialidade, int tempoDeCasa) {
        super(nomeProf, sobrenomeProf, tempoDeCasa, codigoProf);
        this.especialidade = especialidade;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
