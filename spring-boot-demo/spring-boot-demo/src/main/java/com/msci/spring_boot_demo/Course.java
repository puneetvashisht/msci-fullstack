package com.msci.spring_boot_demo;

public class Course {
    int id;
    String title;
    double price;

    public Course(){
        
    }

    public Course(int id, String title, double price) {
        this.id = id;
        this.title = title;
        this.price = price;
    }
    
    public int getId() {
        return id;
    }   
    
    public String getTitle() {
        return title;
    }
    
    public double getPrice() {
        return price;
    }
    
    public void setPrice(double newPrice) {
        this.price = newPrice;
    }
    
    @Override
    public String toString() {
        return "Course [id=" + id + ", title=" + title + ", price=" + price + "]";
    }
}
