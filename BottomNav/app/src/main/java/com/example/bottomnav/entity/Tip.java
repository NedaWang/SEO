package com.example.bottomnav.entity;

public class Tip {

    private int id;
    private String name;
    private String description;
    private String why;
    private String how;
    private String image;
    private String video;

    public Tip(){

    }

    public Tip(int id, String name, String description, String why, String how){
        this.id = id;
        this.name = name;
        this.description = description;
        this.why = why;
        this.how = how;
    }

    public Tip(int id, String name) {
        this.id = id;
        this.name = name;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getWhy() {
        return why;
    }

    public void setWhy(String why) {
        this.why = why;
    }

    public String getHow() {
        return how;
    }

    public void setHow(String how) {
        this.how = how;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }
}
