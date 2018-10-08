package app.entities.pets;

import app.entities.Kind;

import java.util.Objects;

public class Pet {

    protected int idUser;
    protected String  kind;
    protected String name;
    protected double weight;
    protected int age;

    public Pet() {
    }

    public Pet(int id_user, String  kind, String name, double weight, int age) {
        this.idUser = id_user;
        this.kind = kind;
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    public int getId_user() {
        return idUser;
    }

    public void setId_user(int id_user) {
        this.idUser = id_user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String  getKind() {
        return kind;
    }

    public void setKind(String  kind) {
        this.kind = kind;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "id_user=" + idUser +
                ", kind='" + kind + '\'' +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return idUser == pet.idUser &&
                Double.compare(pet.weight, weight) == 0 &&
                age == pet.age &&
                Objects.equals(kind, pet.kind) &&
                Objects.equals(name, pet.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idUser, kind, name, weight, age);
    }
}
