package app.bd;

import app.entities.user.SavedUser;
import app.entities.user.User;

import java.util.List;

public interface Repository {
    void addUser(User addUser);
    void updateUser(int id, User updateUser);
    int findUser(String name);
    void deleteUser(int id);
    void deleteAll();
    List<SavedUser> listUser();
}
