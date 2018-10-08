package app.entities.user;

public class SavedUser extends User{
    private int id;

    public SavedUser() {
    }

    public SavedUser(int id) {
        this.id = id;
    }

    public SavedUser(String name, String password, int id) {
        super(name, password);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
