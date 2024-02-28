/*
 *
 * You can use the following import statements
 * 
 * import javax.persistence.*;
 * 
 */

// Write your code here
package com.example.nxttrendz2.model;

import javax.persistence.*;

@Entity
@Table(name="product")
public class Product{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name="name")
    private String name;
    @Column(name="description")
    private String description;
    @Column(name="price")
    private double price;
    @ManyToOne
    @JoinColumn(name="categoryid")
    private Category category;

    public Product(){}
    public Product(int id, String name, String description, double price, Category category){
        this.id=id;
        this.name=name;
        this.description=description;
        this.price=price;
        this.category=category;
    }

    public void setId(int id){
        this.id=id;
    }

    public int getId(){
        return this.id;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return this.name;
    }

    public void setDescription(String description){
        this.description=description;
    }

    public String getDescription(){
        return this.description;
    }

    public void setPrice(double price){
        this.price=price;
    }

    public double getPrice(){
        return this.price;
    }

    public void setCategory(Category category){
        this.category=category;
    }

    public Category getCategory(){
        return this.category;
    }

}