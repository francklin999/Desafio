package ParteC;

import java.util.Objects;

public class Professor {
    private String nomeProf;
    private String sobrenomeProf;
    private int tempoDeCasa;
    private int codigoProf;

    public Professor(String nomeProf, String sobrenomeProf, int tempoDeCasa, int codigoProf) {
        this.nomeProf = nomeProf;
        this.sobrenomeProf = sobrenomeProf;
        this.tempoDeCasa = tempoDeCasa;
        this.codigoProf = codigoProf;
    }

    public String getNomeProf() {
        return nomeProf;
    }

    public void setNomeProf(String nomeProf) {
        this.nomeProf = nomeProf;
    }

    public String getSobrenomeProf() {
        return sobrenomeProf;
    }

    public void setSobrenomeProf(String sobrenomeProf) {
        this.sobrenomeProf = sobrenomeProf;
    }

    public int getTempoDeCasa() {
        return tempoDeCasa;
    }

    public void setTempoDeCasa(int tempoDeCasa) {
        this.tempoDeCasa = tempoDeCasa;
    }

    public int getCodigoProf() {
        return codigoProf;
    }

    public void setCodigoProf(int codigoProf) {
        this.codigoProf = codigoProf;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Professor professor = (Professor) o;
        return codigoProf == professor.codigoProf;
    }
}
