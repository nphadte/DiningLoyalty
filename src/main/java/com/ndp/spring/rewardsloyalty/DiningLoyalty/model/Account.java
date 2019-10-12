package com.ndp.spring.rewardsloyalty.DiningLoyalty.model;

import javax.persistence.*;

@Entity
@Table(name="T_ACCOUNT")
public class Account {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="ID")
    private  Long  ID;

    @Column(name="NUMBER")
    private  int NUMBER;

    @Column(name="NAME")
    private  String NAME1;

    public Account(){ }

    public String  toString(){
        return this.ID + this.NUMBER + this.NAME1
                ;
    }
}