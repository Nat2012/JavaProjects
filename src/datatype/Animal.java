package datatype;

import java.util.Objects;

public class Animal {
    private String species;

    private int height2;

    private int age2;

    private String gender2;

    public Animal(String species, int height2, int age2, String gender2) {
        this.species = species;
        this.height2 = height2;
        this.age2 = age2;
        this.gender2 = gender2;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getHeight2() {
        return height2;
    }

    public void setHeight2(int height2) {
        this.height2 = height2;
    }

    public int getAge2() {
        return age2;
    }

    public void setAge2(int age2) {
        this.age2 = age2;
    }

    public String getGender2() {
        return gender2;
    }

    public void setGender2(String gender2) {
        this.gender2 = gender2;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "species='" + species + '\'' +
                ", height=" + height2 +
                ", age=" + age2 +
                ", gender='" + gender2 + '\'' +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return height2 == animal.height2 && age2 == animal.age2 && Objects.equals(species, animal.species) && Objects.equals(gender2, animal.gender2);
    }

    @Override
    public int hashCode() { return Objects.hash(species, height2, age2, gender2); }
}

