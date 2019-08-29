package com.entity;

import javax.persistence.*;

@Entity
@Table(name = "LABEL")
public class label {
    @Id
    @Column(name = "ID")
    private int id;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "USER_ID")
    private User user_id;
    @Column(name = "NAME")
    private String name;
    @Column(name = "NUMBER_OF_ITEMS")
    private int number_of_items;

    public label(int id, String name, int number_of_items) {
        this.id = id;
        this.name = name;
        this.number_of_items = number_of_items;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser_id() {
        return user_id;
    }

    public void setUser_id(User user_id) {
        this.user_id = user_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber_of_items() {
        return number_of_items;
    }

    public void setNumber_of_items(int number_of_items) {
        this.number_of_items = number_of_items;
    }
    public label(){

    }
}
