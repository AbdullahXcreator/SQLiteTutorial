package com.blogspot.codesgram.sqlitetutorial.Model;

public class usermodels {
    int id;
    String name;
    String nilai;

    // contrustor(empty)
    public usermodels() {
    }

    // constructor
    public usermodels(int id, String nilai, String name) {
        this.id = id;
        this.nilai = nilai;
        this.name = name;
    }

    /*Setter and Getter*/

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNilai() {
        return nilai;
    }

    public void setNilai(String nilai) {
        this.nilai = nilai;
    }
}
