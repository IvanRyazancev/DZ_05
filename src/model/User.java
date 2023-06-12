package model;

public abstract class User {
    public String name;
    public Integer BornYear;

    public User(String name, Integer bornYear) {
        this.name = name;
        BornYear = bornYear;
    }

    public User() {
        this.name = "";
        BornYear = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getBornYear() {
        return BornYear;
    }

    public void setBornYear(Integer bornYear) {
        BornYear = bornYear;
    }


    @Override
    public String toString() {
        return name + " " + BornYear;
    }
}