package com.ndp.spring.rewardsloyalty.DiningLoyalty.model;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name="T_RESTAURANT")
public class Restaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;

    @Column(name="MERCHANT_NUMBER")
    private String  merchant_number;

    @Column(name="NAME")
    private String  name;

    @Column(name="BENEFIT_PERCENTAGE")
    private BigDecimal benefit_percentage;

    @Column(name="BENEFIT_AVAILABILITY_POLICY")
    private String  benefit_availability_policy;

    public Restaurant(){}

    public Restaurant(Long ID, String merchant_number, String name, BigDecimal benefit_percentage, String benefit_availability_policy) {
        this.ID = ID;
        this.merchant_number = merchant_number;
        this.name = name;
        this.benefit_percentage = benefit_percentage;
        this.benefit_availability_policy = benefit_availability_policy;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getMerchant_number() {
        return merchant_number;
    }

    public void setMerchant_number(String merchant_number) {
        this.merchant_number = merchant_number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getBenefit_percentage() {
        return benefit_percentage;
    }

    public void setBenefit_percentage(BigDecimal benefit_percentage) {
        this.benefit_percentage = benefit_percentage;
    }

    public String getBenefit_availability_policy() {
        return benefit_availability_policy;
    }

    public void setBenefit_availability_policy(String benefit_availability_policy) {
        this.benefit_availability_policy = benefit_availability_policy;
    }
}
