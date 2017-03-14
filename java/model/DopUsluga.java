package model;

public class DopUsluga {
    private Integer id;
    private String name;
    private String opisanie;
    private Float stoimost;

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

    public String getOpisanie() {
        return opisanie;
    }

    public void setOpisanie(String opisanie) {
        this.opisanie = opisanie;
    }

    public Float getStoimost() {
        return stoimost;
    }

    public void setStoimost(Float stoimost) {
        this.stoimost = stoimost;
    }

    @Override
    public String toString() {
        return name;
    }

    
    
}
