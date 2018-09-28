package app.bd;

import app.entities.User;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.setName("Test");
        user.setPassword("TestTest");

        RepositoryImpl base = new RepositoryImpl();
        //base.addUser(user);
        base.updateUser(3,user);
        System.out.println(base.findUser("Name1"));
        System.out.println(base.findUser("Test"));
        System.out.println(base.findUser("oN"));
        System.out.println(base.listUser());
    }
}
