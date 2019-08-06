package com.example.model;

public class Electronics extends Device {
    private String name;
    private int size;
    private String description;

    @Override
    public void turnOn() {
        System.out.println("włączono");
    }

    @Override
    public void turnOff() {
        System.out.println("wyłączono");
    }

    public Electronics() {
    }

    public Electronics(String name, int size, String description) {
        this.name = name;
        this.size = size;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Electronics{" +
                "name='" + name + '\'' +
                ", volume=" + size +
                ", description='" + description + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Electronics)) return false;

        Electronics that = (Electronics) o;

        if (size != that.size) return false;
        if (!name.equals(that.name)) return false;
        return description.equals(that.description);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + size;
        result = 31 * result + description.hashCode();
        return result;
    }
}
