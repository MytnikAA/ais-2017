package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Automobill;

public class AutomobillDAO implements DAO<Automobill> {

    private final Connection con;

    public AutomobillDAO(Connection con) {
        this.con = con;
    }

    @Override
    public Integer create(Automobill entity) {

        String sql = "INSERT INTO `automibil` (`mark`,`reg_number`,`kuzov`,`engine`,`emitted`,`odometr`,`driver`,`last_to`,`mech`,`specials`) VALUES (?,?,?,?,?,?,?,?,?,?);";
        try (PreparedStatement stmt = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);) {
            stmt.setInt(1, entity.getMarka().getId());
            stmt.setString(2, entity.getRegNomer());
            stmt.setString(3, entity.getNomerKuzova());
            stmt.setString(4, entity.getNomerDvigatelia());
            stmt.setDate(5, new java.sql.Date(
                    entity.getDataVypuska().getTime()));
            stmt.setInt(6, entity.getProbeg());
            stmt.setInt(7, entity.getDriver().getId());
            stmt.setDate(8, new java.sql.Date(
                    entity.getDataPoslednegoTO().getTime()));
            stmt.setInt(9, entity.getMehanik().getId());
            stmt.setString(10, entity.getOtmetki());
            stmt.execute();
            ResultSet keys = stmt.getGeneratedKeys();
            Integer id = null;
            if (keys.next()) {
                id = keys.getInt(1);
            }
            keys.close();
            return id;
        } catch (SQLException ex) {
            Logger.getLogger(AutomobillDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public Automobill read(Integer id) {
        Automobill auto = null;
        String sql = "SELECT * FROM automibil;";
        try (PreparedStatement st = con.prepareStatement(sql);
                ResultSet rs = st.executeQuery();) {
            if (rs.next()) {
                auto.setId(rs.getInt("id"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(AutomobillDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return auto;
    }

    @Override
    public List<Automobill> readAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Automobill entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Automobill entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
