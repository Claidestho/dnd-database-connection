package com.dnd.microdnd.model;

import javax.persistence.*;

@Entity(name = "enemy")
public class Enemy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int hp;
    private String type;
    private int position;
    private int attack;



    public Enemy() {}

    public Enemy(int id, String name, String type, int hp, int position, int attack) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.hp = hp;
        this.position = position;
        this.attack = attack;
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

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getAttack(int attack) {return attack;}
    public void setAttack(int attack) {this.attack = attack;}

    @Override
    public String toString() {
        return "Enemy{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", hp=" + hp +
                ", type='" + type + '\'' +
                ", position=" + position +
                '}';
    }


}
