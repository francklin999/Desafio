package PartdeD;

import ParteC.Professor;

public class ProfessorAdjunto extends Professor {
    private int horasDeMonitoria;

    public ProfessorAdjunto(String nomeProf, String sobrenomeProf, int tempoDeCasa, int codigoProf,int horasDeMonitoria) {
        super(nomeProf, sobrenomeProf, tempoDeCasa, codigoProf);
        this.horasDeMonitoria = horasDeMonitoria;
    }

    public int getHorasDeMonitoria() {
        return horasDeMonitoria;
    }

    public void setHorasDeMonitoria(int horasDeMonitoria) {
        this.horasDeMonitoria = horasDeMonitoria;
    }
}
