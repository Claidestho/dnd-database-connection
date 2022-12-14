package com.dnd.microdnd.model;

import javax.persistence.*;

@Entity(name = "hero")
public class Hero {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int hp;
    private String type;
    private int position;
    private int attack;


    //constructeur
    public Hero() {
    }

    public Hero(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public Hero(int id, String name, String type, int hp) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.hp = hp;
    }

    //Getters - Setters
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }



    //Adaption à nos besoin du toString
    @Override
    public String toString() {
        return "Champion{" +
                "id=" + id +
                ", nom='" + name + '\'' +
                ", pdv=" + hp +
                ", classe=" + type +
                '}';
    }
}


