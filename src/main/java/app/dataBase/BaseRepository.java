package app.dataBase;

import app.entities.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class BaseRepository implements Repository{
    private final String ADD_USER = "insert into \"user\".\"Users\" (name,password) values (?, ?);";
    private final String FIND_USER = "select id from \"user\".\"Users\" where name = ?";
    private final String UPDATE_USER = "update \"user\".\"Users\" set name=? password=?";
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
    public void updateUser(int id, User updateUser) {

    }

    @Override
    public int findUser(String name) {
        return 0;
    }

    @Override
    public void deleteUser(int id) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<User> listUser() {
        return null;
    }
}
