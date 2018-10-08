package app.entities.pets;

import app.entities.Kind;

public class SavedPets extends Pet{
    private int id;

    public SavedPets(){
    }

    public SavedPets(int id) {
        this.id = id;
    }

    public SavedPets(int idUser, String kind, String name, double weight, int age, int id) {
        super(idUser, kind, name, weight, age);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_user() {
        return idUser;
    }

    public void setId_user(int idUser) {
        this.idUser = idUser;
    }
}
