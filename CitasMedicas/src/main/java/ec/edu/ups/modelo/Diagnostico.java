/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

/**
 *
 * @author Damián Sumba
 */
public class Diagnostico {
    
    public int codigoDiagnostico;
    public String enfermedadActual;
    public String boca;
    public String torax;
    public String abdomen;
    public String extremidades;
    public String regionPerineal;
    public String valoracionNeurologica;
    public String ice10;
    public String tratamientos;

    public Diagnostico() {
    }

    public int getCodigoDiagnostico() {
        return codigoDiagnostico;
    }

    public void setCodigoDiagnostico(int codigoDiagnostico) {
        this.codigoDiagnostico = codigoDiagnostico;
    }

    public String getEnfermedadActual() {
        return enfermedadActual;
    }

    public void setEnfermedadActual(String enfermedadActual) {
        this.enfermedadActual = enfermedadActual;
    }

    public String getBoca() {
        return boca;
    }

    public void setBoca(String boca) {
        this.boca = boca;
    }

    public String getTorax() {
        return torax;
    }

    public void setTorax(String torax) {
        this.torax = torax;
    }

    public String getAbdomen() {
        return abdomen;
    }

    public void setAbdomen(String abdomen) {
        this.abdomen = abdomen;
    }

    public String getExtremidades() {
        return extremidades;
    }

    public void setExtremidades(String extremidades) {
        this.extremidades = extremidades;
    }

    public String getRegionPerineal() {
        return regionPerineal;
    }

    public void setRegionPerineal(String regionPerineal) {
        this.regionPerineal = regionPerineal;
    }

    public String getValoracionNeurologica() {
        return valoracionNeurologica;
    }

    public void setValoracionNeurologica(String valoracionNeurologica) {
        this.valoracionNeurologica = valoracionNeurologica;
    }

    public String getIce10() {
        return ice10;
    }

    public void setIce10(String ice10) {
        this.ice10 = ice10;
    }

    public String getTratamientos() {
        return tratamientos;
    }

    public void setTratamientos(String tratamientos) {
        this.tratamientos = tratamientos;
    }

    @Override
    public String toString() {
        return "Diagnostico{" + "codigoDiagnostico=" + codigoDiagnostico + ", enfermedadActual=" + enfermedadActual + ", boca=" + boca + ", torax=" + torax + ", abdomen=" + abdomen + ", extremidades=" + extremidades + ", regionPerineal=" + regionPerineal + ", valoracionNeurologica=" + valoracionNeurologica + ", ice10=" + ice10 + ", tratamientos=" + tratamientos + '}';
    }
    
    
    
}
