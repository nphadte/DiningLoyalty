package com.ndp.spring.rewardsloyalty.DiningLoyalty.controller;

import com.ndp.spring.rewardsloyalty.DiningLoyalty.DiningLoyaltyApplication;
import com.ndp.spring.rewardsloyalty.DiningLoyalty.model.Account;
import com.ndp.spring.rewardsloyalty.DiningLoyalty.repository.AccountJpaRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/DinersClub")
public class DiningRewards {

    private static final Logger log = LoggerFactory.getLogger(DiningRewards.class);

    @Autowired
    AccountJpaRepository accountJpaRepository;

    @GetMapping(value="/status")
    public String  addMember() {
        String  accountstr = accountJpaRepository.findAll().toString();
        return accountstr;
    }

    /*@GetMapping(value="/Account/{Id}", @PathVariable Long id )
    public Optional<Account>  addMember(@PathVariable Long id) {
        Optional<Account> myaccount = accountJpaRepository.findById(id);
        return myaccount;
    }*/


}