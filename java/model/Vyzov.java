package model;

import java.util.Date;

public class Vyzov {
    
    private Integer id;
    private Date date;
    private String phone;
    private String otkuda;
    private String kuda;
    private Tarif tarif;
    private DopUsluga dopUsluga;
    private Automobill automobill;
    private Sotrudnik sotrudnik;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getOtkuda() {
        return otkuda;
    }

    public void setOtkuda(String otkuda) {
        this.otkuda = otkuda;
    }

    public String getKuda() {
        return kuda;
    }

    public void setKuda(String kuda) {
        this.kuda = kuda;
    }

    public Tarif getTarif() {
        return tarif;
    }

    public void setTarif(Tarif tarif) {
        this.tarif = tarif;
    }

    public DopUsluga getDopUsluga() {
        return dopUsluga;
    }

    public void setDopUsluga(DopUsluga dopUsluga) {
        this.dopUsluga = dopUsluga;
    }

    public Automobill getAutomobill() {
        return automobill;
    }

    public void setAutomobill(Automobill automobill) {
        this.automobill = automobill;
    }

    public Sotrudnik getSotrudnik() {
        return sotrudnik;
    }

    public void setSotrudnik(Sotrudnik sotrudnik) {
        this.sotrudnik = sotrudnik;
    }

    @Override
    public String toString() {
        return id + " " + otkuda + " " + kuda;
    }
    
    
    
}
