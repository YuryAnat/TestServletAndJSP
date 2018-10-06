package app.bd;

import app.entities.user.SavedUsers;
import app.entities.user.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserRepositoryImpl implements Repository{
    private final String ADD_USER = "insert into \"user\".\"Users\" (name,password) values (?, ?);";
    private final String FIND_USER = "select id from \"user\".\"Users\" where name = ?";
    private final String UPDATE_USER = "update \"user\".\"Users\" set name=?, password=? where id=?";
    private final String DELETE_USER = "delete from \"user\".\"Users\" where id=?";
    private final String DELETE_ALL = "delete from \"user\".\"Users\"";
    private final String LIST_USER = "select * from \"user\".\"Users\"";



    @Override
    public void addUser(User addUser) {
        try(Connection con = new ConnectionPostgresql().getConnection()) {
             PreparedStatement prst = con.prepareStatement(ADD_USER);
             prst.setString(1, addUser.getName());
             prst.setString(2,addUser.getPassword());
             prst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public int findUser(String name) {
        try(Connection con = new ConnectionPostgresql().getConnection()) {
            PreparedStatement prst = con.prepareStatement(FIND_USER);
            prst.setString(1, name);
            ResultSet resultSet = prst.executeQuery();
            if (resultSet.next()){
                return resultSet.getInt("id");
            }else {
                return -1;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return -1;
        }
    }

    @Override
    public void updateUser(int id, User updateUser) {
        try(Connection con = new ConnectionPostgresql().getConnection()){
            PreparedStatement prst = con.prepareStatement(UPDATE_USER);
            prst.setString(1, updateUser.getName());
            prst.setString(2, updateUser.getPassword());
            prst.setInt(3, id);
            prst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void deleteUser(int id) {
        try(Connection con = new ConnectionPostgresql().getConnection()){
            PreparedStatement prst = con.prepareStatement(DELETE_USER);
            prst.setInt(1, id);
            prst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteAll() {
        try(Connection con = new ConnectionPostgresql().getConnection()){
            PreparedStatement prst = con.prepareStatement(DELETE_ALL);
            prst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<SavedUsers> listUser() {
        try(Connection con = new ConnectionPostgresql().getConnection()){
            PreparedStatement prst = con.prepareStatement(LIST_USER);
            ResultSet resultSet = prst.executeQuery();
            List<SavedUsers> list = new ArrayList();
            while (resultSet.next()){
                SavedUsers savedUsers = new SavedUsers();
                savedUsers.setId(resultSet.getInt("id"));
                savedUsers.setName(resultSet.getString("name").trim());
                savedUsers.setPassword("nope");
                list.add(savedUsers);
            }
                return list;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
