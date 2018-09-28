package app.bd;

import app.entities.User;

import java.util.List;

public interface Repository {
    public void addUser(User addUser);
    public void updateUser(int id, User updateUser);
    public int findUser(String name);
    public void deleteUser(int id);
    public void deleteAll();
    public List<String> listUser();
}
