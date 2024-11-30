package org.example;

public class Member {
    private String name;
    private int id;

    public Member(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Member{" + "name='" + name + '\'' + ", id=" + id + '}';
    }
}

