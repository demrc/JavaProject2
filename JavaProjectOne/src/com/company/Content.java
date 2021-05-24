package com.company;

public class Content {
    private int id;
    private String name;
    private String genre;

    public Content(int id,String name,String genre){
        this.setId(id);
        this.setName(name);
        this.setGenre(genre);
    }

    public Content() {

    }


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

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
