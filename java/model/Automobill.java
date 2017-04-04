package model;

import java.util.Date;

public class Automobill {
    
    private Integer id;
    private Marka marka;
    private String regNomer;
    private String nomerKuzova;
    private String nomerDvigatelia;
    private Date dataVypuska;
    private Integer probeg;
    private Sotrudnik sotrudnik;
    private Date dataPoslednegoTO;
    private Sotrudnik mehanik;
    private String otmetki;

    public Automobill() {
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Marka getMarka() {
        return marka;
    }

    public void setMarka(Marka marka) {
        this.marka = marka;
    }

    public String getRegNomer() {
        return regNomer;
    }

    public void setRegNomer(String regNomer) {
        this.regNomer = regNomer;
    }

    public String getNomerKuzova() {
        return nomerKuzova;
    }

    public void setNomerKuzova(String nomerKuzova) {
        this.nomerKuzova = nomerKuzova;
    }

    public String getNomerDvigatelia() {
        return nomerDvigatelia;
    }

    public void setNomerDvigatelia(String nomerDvigatelia) {
        this.nomerDvigatelia = nomerDvigatelia;
    }

    public Date getDataVypuska() {
        return dataVypuska;
    }

    public void setDataVypuska(Date dataVypuska) {
        this.dataVypuska = dataVypuska;
    }

    public Integer getProbeg() {
        return probeg;
    }

    public void setProbeg(Integer probeg) {
        this.probeg = probeg;
    }

    public Sotrudnik getDriver() {
        return sotrudnik;
    }

    public void setSotrudnik(Sotrudnik sotrudnik) {
        this.sotrudnik = sotrudnik;
    }

    public Date getDataPoslednegoTO() {
        return dataPoslednegoTO;
    }

    public void setDataPoslednegoTO(Date dataPoslednegoTO) {
        this.dataPoslednegoTO = dataPoslednegoTO;
    }

    public Sotrudnik getMehanik() {
        return mehanik;
    }

    public void setMehanik(Sotrudnik mehanik) {
        this.mehanik = mehanik;
    }

    public String getOtmetki() {
        return otmetki;
    }

    public void setOtmetki(String otmetki) {
        this.otmetki = otmetki;
    }

    @Override
    public String toString() {
        return id + " " + marka + " " + regNomer;
    }
    
    
    
}
