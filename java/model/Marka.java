package model;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class Marka {

    private Integer id;
    private String name;
    private String xarakteristiki;
    private Float stoimost;
    private String specifika;

    private PropertyChangeSupport support;

    public Marka() {
        support = new PropertyChangeSupport(this);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer old = this.id;
        this.id = id;
        support.firePropertyChange("id", old, id);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String old = this.name;
        this.name = name;
        support.firePropertyChange("name", old, name);
    }

    public String getXarakteristiki() {
        return xarakteristiki;
    }

    public void setXarakteristiki(String xarakteristiki) {
        String old = this.xarakteristiki;
        this.xarakteristiki = xarakteristiki;
        support.firePropertyChange("xarakteristiki", old, xarakteristiki);
    }

    public Float getStoimost() {
        return stoimost;
    }

    public void setStoimost(Float stoimost) {
        Float old = this.stoimost;
        this.stoimost = stoimost;
        support.firePropertyChange("stoimost", old, stoimost);
    }

    public String getSpecifika() {
        return specifika;
    }

    public void setSpecifika(String specifika) {
        String old = this.specifika;
        this.specifika = specifika;
        support.firePropertyChange("specifika", old, specifika);
    }

    @Override
    public String toString() {
        return id + " " + name;
    }

    public void addPropertyChangeListener
        (PropertyChangeListener listener) {
        support.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener
        (PropertyChangeListener listener) {
        support.removePropertyChangeListener(listener);
    }

}
