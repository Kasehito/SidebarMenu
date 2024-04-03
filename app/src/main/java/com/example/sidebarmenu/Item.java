package com.example.sidebarmenu;

public class Item {
    String name, desc;
    int images;

    public Item(String name, String desc, int images) {
        this.name = name;
        this.desc = desc;
        this.images = images;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getImages() {
        return images;
    }

    public void setImages(int images) {
        this.images = images;
    }
}
