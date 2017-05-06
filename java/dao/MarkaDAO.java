package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Marka;

public class MarkaDAO implements DAO<Marka>{
    
    private final Connection con;

    public MarkaDAO(Connection con) {
        this.con = con;
    }
    
    

    @Override
    public Integer create(Marka entity) {
        String sql = "INSERT INTO `taxopark`.`auto_mark` (`name`, `harakteristiki`, `price`, `specials`) VALUES (?, ?, ?, ?);";
        try (PreparedStatement st = con.prepareStatement(sql)) {
            st.setString(1, entity.getName());
            st.setString(2, entity.getXarakteristiki());
            st.setFloat(3, entity.getStoimost());
            st.setString(4, entity.getSpecifika());
            st.execute();
            ResultSet keys = st.getGeneratedKeys();
            Integer id = null;
            if (keys.next()) {
                id = keys.getInt(1);
            }
            keys.close();
            return id;
        } catch (SQLException ex) {
            Logger.getLogger(MarkaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public Marka read(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Marka> readAll() {
        List<Marka> marks = new ArrayList<>();
        String sql = "select * from auto_mark";
        try (Statement st = con.createStatement()){
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                Marka marka = new Marka();
                marka.setId(rs.getInt("id"));
                marka.setName(rs.getString("name"));
                marka.setSpecifika(rs.getString("specials"));
                marka.setStoimost(rs.getFloat("price"));
                marka.setXarakteristiki(rs.getString("harakteristiki"));
                marks.add(marka);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return marks;
    }

    @Override
    public void update(Marka entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Marka entity) {
        String sql = "DELETE FROM auto_mark WHERE id = ?";
        try (PreparedStatement st = con.prepareStatement(sql);){
            st.setInt(1, entity.getId());
            st.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
