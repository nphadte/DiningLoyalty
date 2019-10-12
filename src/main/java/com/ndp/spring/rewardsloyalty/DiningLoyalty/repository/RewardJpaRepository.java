package com.ndp.spring.rewardsloyalty.DiningLoyalty.repository;

import com.ndp.spring.rewardsloyalty.DiningLoyalty.DiningLoyaltyApplication;
import com.ndp.spring.rewardsloyalty.DiningLoyalty.model.Reward;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RewardJpaRepository extends JpaRepository<Reward,Long> {

    public  List<Reward>  findAll();

}