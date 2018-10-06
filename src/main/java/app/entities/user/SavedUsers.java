package app.entities.user;

public class SavedUsers extends User{
    private int id;

    public SavedUsers() {
    }

    public SavedUsers(int id) {
        this.id = id;
    }

    public SavedUsers(String name, String password, int id) {
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
