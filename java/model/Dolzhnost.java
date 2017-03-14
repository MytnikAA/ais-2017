package model;

public class Dolzhnost {

    private Integer id;
    private String name;
    private Float oklad;
    private String obiazannosti;
    private String trebovania;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getOklad() {
        return oklad;
    }

    public void setOklad(Float oklad) {
        this.oklad = oklad;
    }

    public String getObiazannosti() {
        return obiazannosti;
    }

    public void setObiazannosti(String obiazannosti) {
        this.obiazannosti = obiazannosti;
    }

    public String getTrebovania() {
        return trebovania;
    }

    public void setTrebovania(String trebovania) {
        this.trebovania = trebovania;
    }

    @Override
    public String toString() {
        return id + " " + name;
    }
    
    
    
}
