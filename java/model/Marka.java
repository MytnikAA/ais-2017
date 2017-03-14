package model;

public class Marka {
    
    private Integer id;
    private String name;
    private String xarakteristiki;
    private Float stoimost;
    private String specifika;

    public Marka() {
    }

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

    public String getXarakteristiki() {
        return xarakteristiki;
    }

    public void setXarakteristiki(String xarakteristiki) {
        this.xarakteristiki = xarakteristiki;
    }

    public Float getStoimost() {
        return stoimost;
    }

    public void setStoimost(Float stoimost) {
        this.stoimost = stoimost;
    }

    public String getSpecifika() {
        return specifika;
    }

    public void setSpecifika(String specifika) {
        this.specifika = specifika;
    }

    @Override
    public String toString() {
        return id + " " +  name;
    }
    
    
}
