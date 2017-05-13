package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Dolzhnost;

public class DolzhnostDAO implements DAO<Dolzhnost> {
    
    private final Connection con;

    public DolzhnostDAO(Connection con) {
        this.con = con;
    }

    @Override
    public Integer create(Dolzhnost entity) {
        String sql = "INSERT INTO `taxopark`.`dolzhnost` (`name`, `oklad`, `obiazannost`, `trebovania`) VALUES (?, ?, ?, ?);";
        try (PreparedStatement st = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);) {
            st.setString(1, entity.getName());
            st.setFloat(2, entity.getOklad());
            st.setString(3, entity.getObiazannosti());
            st.setString(4, entity.getTrebovania());
            st.execute();
            ResultSet keys = st.getGeneratedKeys();
            keys.next();
            return keys.getInt(1);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    @Override
    public Dolzhnost read(Integer id) {
        Dolzhnost d = null;
        String sql = "SELECT * FROM dolzhnost WHERE id = ?;"; 
        try (PreparedStatement st = con.prepareStatement(sql);) {
            st.setInt(1, id);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                d = new Dolzhnost();
                d.setId(rs.getInt("id"));
                d.setName(rs.getString("name"));
                d.setOklad(rs.getFloat("oklad"));
                d.setObiazannosti(rs.getString("obiazannost"));
                d.setTrebovania(rs.getString("trebovania"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return d;
    }

    @Override
    public List<Dolzhnost> readAll() {
        List<Dolzhnost> dolzhnosti = new ArrayList<>();
        String sql = "SELECT * FROM dolzhnost"; 
        try (Statement st = con.createStatement();) {
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                Dolzhnost d = new Dolzhnost();
                d.setId(rs.getInt("id"));
                d.setName(rs.getString("name"));
                d.setOklad(rs.getFloat("oklad"));
                d.setObiazannosti(rs.getString("obiazannost"));
                d.setTrebovania(rs.getString("trebovania"));
                dolzhnosti.add(d);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dolzhnosti;
    }

    @Override
    public void update(Dolzhnost entity) {
        String sql = "UPDATE `taxopark`.`dolzhnost` SET `name` = ?, `oklad` = ?, `obiazannost` = ?, `trebovania` = ? WHERE id = ?;";
        try (PreparedStatement st = con.prepareStatement(sql);) {
            st.setString(1, entity.getName());
            st.setFloat(2, entity.getOklad());
            st.setString(3, entity.getObiazannosti());
            st.setString(4, entity.getTrebovania());
            st.setInt(5, entity.getId());
            st.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void delete(Dolzhnost entity) {
        String sql = "DELETE FROM dolzhnost WHERE id = ?";
        try (PreparedStatement st = con.prepareStatement(sql);){
            st.setInt(1, entity.getId());
            st.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void save(Dolzhnost d) {
        if (d.getId() == null) {
            create(d);
        } else {
            update(d);
        }
    }
    
}
