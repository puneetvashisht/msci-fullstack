package com.msci.spring_boot_data_demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;


@Data
@Entity
public class Course {
    public Course(int i, String string, double j) {
        this.id = i;
        this.title = string;
        this.price = j;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String title;
    double price;

    // public Course(){
        
    // }

    // public Course(int id, String title, double price) {
    //     this.id = id;
    //     this.title = title;
    //     this.price = price;
    // }
    
    // public int getId() {
    //     return id;
    // }   
    
    // public String getTitle() {
    //     return title;
    // }
    
    // public double getPrice() {
    //     return price;
    // }
    
    // public void setPrice(double newPrice) {
    //     this.price = newPrice;
    // }
    
    // @Override
    // public String toString() {
    //     return "Course [id=" + id + ", title=" + title + ", price=" + price + "]";
    // }
}
