package model;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class Dolzhnost {

    private Integer id;
    private String name;
    private Float oklad;
    private String obiazannosti;
    private String trebovania;
    private PropertyChangeSupport prop;

    public Dolzhnost() {
        this.prop = new PropertyChangeSupport(this);
    }
    
    public void addPropertyChangeListener
        (PropertyChangeListener listener) {
        prop.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener
        (PropertyChangeListener listener) {
        prop.removePropertyChangeListener(listener);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer old = this.id;
        this.id = id;
        prop.firePropertyChange("id", old, id);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String old = this.name;
        this.name = name;
        prop.firePropertyChange("name", old, name);
    }

    public Float getOklad() {
        return oklad;
    }

    public void setOklad(Float oklad) {
        Float old = this.oklad;
        this.oklad = oklad;
        prop.firePropertyChange("oklad", old, oklad);
    }

    public String getObiazannosti() {
        return obiazannosti;
    }

    public void setObiazannosti(String obiazannosti) {
        String old = this.obiazannosti;
        this.obiazannosti = obiazannosti;
        prop.firePropertyChange("obiazannosti", old, obiazannosti);
    }

    public String getTrebovania() {
        return trebovania;
    }

    public void setTrebovania(String trebovania) {
        String old = this.trebovania;
        this.trebovania = trebovania;
        prop.firePropertyChange("trebovania", old, trebovania);
    }

    @Override
    public String toString() {
        return id + " " + name;
    }
    
    
    
}
