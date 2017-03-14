package model;

import java.util.Date;

public class Sotrudnik {

    private Integer id;
    private String fio;
    private Date dataRozhdenia;
    private Pol pol;
    private String address;
    private String phone;
    private Passport passport;
    private Dolzhnost dolzhnost;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        if (id >= 0) {
            this.id = id;
        }
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public Date getDataRozhdenia() {
        return dataRozhdenia;
    }

    public void setDataRozhdenia(Date dataRozhdenia) {
        this.dataRozhdenia = dataRozhdenia;
    }

    public Pol getPol() {
        return pol;
    }

    public void setPol(Pol pol) {
        this.pol = pol;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Passport getPassport() {
        return passport;
    }

    public void setPassport(Passport passport) {
        this.passport = passport;
    }

    public Dolzhnost getDolzhnost() {
        return dolzhnost;
    }

    public void setDolzhnost(Dolzhnost dolzhnost) {
        this.dolzhnost = dolzhnost;
    }

    @Override
    public String toString() {
        return fio;
    }

}
