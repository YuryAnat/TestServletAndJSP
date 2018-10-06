package app.entities.pets;

import app.entities.Kind;

public class Pet {

    protected Kind kind;
    protected String name;
    protected double weight;
    protected int age;

    public Pet() {
    }

    public Pet(String name, double weight, int age, Kind kind) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.kind = kind;
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

    public Kind getKind() {
        return kind;
    }

    public void setKind(Kind kind) {
        this.kind = kind;
    }
}
