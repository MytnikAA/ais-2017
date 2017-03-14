package model;

import java.util.Date;

public class Passport {
    private Integer seriya;
    private Integer nomer;
    private Date dataVydachi;

    public Integer getSeriya() {
        return seriya;
    }

    public void setSeriya(Integer seriya) {
        this.seriya = seriya;
    }

    public Integer getNomer() {
        return nomer;
    }

    public void setNomer(Integer nomer) {
        this.nomer = nomer;
    }

    public Date getDataVydachi() {
        return dataVydachi;
    }

    public void setDataVydachi(Date dataVydachi) {
        this.dataVydachi = dataVydachi;
    }

    @Override
    public String toString() {
        return seriya + " " + nomer;
    }

    
    
}
