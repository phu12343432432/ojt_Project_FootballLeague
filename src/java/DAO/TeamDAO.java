/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DAL.DBContext;
import Model.Team;
import Model.User;
import java.sql.Connection;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Base64;

/**
 *
 * @author uyn26
 */
public class TeamDAO extends DBContext {
    private Connection con;
    private List<User> user;
    PreparedStatement ps;
    ResultSet rs;
    
    public TeamDAO() {
        try{
            con = new DBContext().getConnection();
            System.out.println("Connect Success");
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public Team getTeamById(int _teamId) throws SQLException {
        try{
            String sql = "SELECT * FROM Team WHERE Id = ?";
            ps = con.prepareStatement(sql);
            ps.setInt(1, _teamId);
            rs = ps.executeQuery();
            if (rs.next()) {
                Team _team = new Team();
                int teamId = rs.getInt("Id");
                String Name = rs.getString("Name");
                String ShortName = rs.getString("ShortName");
                String Description = rs.getString("Description");
                int teamSize = rs.getInt("TeamSize");
                byte[] imgData = rs.getBytes("Image");
                String base64Image = Base64.getEncoder().encodeToString(imgData);
                
                _team.setId(teamId);
                _team.setName(Name);
                _team.setShortName(ShortName);
                _team.setDescription(Description);
                _team.setTeamSize(teamSize);
                _team.setImage(base64Image);
                return _team;
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public Team getTeamByUserId(int userId) {
        try {
            String sql = "SELECT * FROM Team WHERE UserId = ?";
            ps = con.prepareStatement(sql);
            ps.setInt(1, userId);
            rs = ps.executeQuery();
            if (rs.next()) {
                Team _team = new Team();
                int teamId = rs.getInt("Id");
                String Name = rs.getString("Name");
                String ShortName = rs.getString("ShortName");
                String Description = rs.getString("Description");
                int teamSize = rs.getInt("TeamSize");
                byte[] imgData = rs.getBytes("Image");
                String base64Image = Base64.getEncoder().encodeToString(imgData);
                
                _team.setId(teamId);
                _team.setName(Name);
                _team.setShortName(ShortName);
                _team.setDescription(Description);
                _team.setTeamSize(teamSize);
                _team.setImage(base64Image);
                return _team;         
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
