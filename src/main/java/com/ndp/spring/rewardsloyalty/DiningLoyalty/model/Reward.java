package com.ndp.spring.rewardsloyalty.DiningLoyalty.model;

import com.sun.javafx.beans.IDProperty;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name="T_REWARD")
public class Reward {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID")
    private Long id;

    @Column(name="CONFIRMATION_NUMBER")
    private String confirmation_number;

    @Column(name="REWARD_AMOUNT")
    private BigDecimal reward_amount;

    @Column(name="REWARD_DATE")
    private Date reward_date;

    @Column(name="ACCOUNT_NUMBER")
    private String account_number;

    @Column(name="DINING_AMOUNT")
    private BigDecimal dining_amount;

    @Column(name="DINING_MERCHANT_NUMBER")
    private String dining_merchantt_number;

    @Column(name="DINING_DATE")
    private Date dining_date;

    public Reward() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getConfirmation_number() {
        return confirmation_number;
    }

    public void setConfirmation_number(String confirmation_number) {
        this.confirmation_number = confirmation_number;
    }

    public BigDecimal getReward_amount() {
        return reward_amount;
    }

    public void setReward_amount(BigDecimal reward_amount) {
        this.reward_amount = reward_amount;
    }

    public Date getReward_date() {
        return reward_date;
    }

    public void setReward_date(Date reward_date) {
        this.reward_date = reward_date;
    }

    public String getAccount_number() {
        return account_number;
    }

    public void setAccount_number(String account_number) {
        this.account_number = account_number;
    }

    public BigDecimal getDining_amount() {
        return dining_amount;
    }

    public void setDining_amount(BigDecimal dining_amount) {
        this.dining_amount = dining_amount;
    }

    public String getDining_merchantt_number() {
        return dining_merchantt_number;
    }

    public void setDining_merchantt_number(String dining_merchantt_number) {
        this.dining_merchantt_number = dining_merchantt_number;
    }

    public Date getDining_date() {
        return dining_date;
    }

    public void setDining_date(Date dining_date) {
        this.dining_date = dining_date;
    }
}
