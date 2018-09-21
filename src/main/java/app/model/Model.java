package app.model;

import app.entities.User;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Model {
    private static Model instance = new Model();
    private List<User> model;

    public static Model getInstance(){
        return instance;
    }

    private Model(){
        model = new ArrayList<>();
    }

    public void add(User user){
        model.add(user);
    }

    public List<String> list(){
        return model.stream().map(User::getName).collect(Collectors.toList());
    }

    public boolean find(String string){
        for (User user : model) {
            if (user.getName().equals(string)){
                return true;
            }
        }
        return false;
    }

    public void update(String name, String newName, String pass){
        for (User user : model) {
            if (user.getName().equals(name)){
                user.setName(newName);
                user.setPassword(pass);
            }
        }
    }

    public void del(String name){
        Iterator<User> iterator = model.iterator();
        while (iterator.hasNext()){
            if(iterator.next().getName().equals(name)){
                iterator.remove();
                break;
            }
        }
    }
}
