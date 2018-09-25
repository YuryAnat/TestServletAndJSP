package app.dataBase;

import app.dataBase.BaseRepository;
import app.entities.User;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.setName("Test");
        user.setPassword("TestTest");

        BaseRepository base = new BaseRepository();
        base.addUser(user);
    }
}
