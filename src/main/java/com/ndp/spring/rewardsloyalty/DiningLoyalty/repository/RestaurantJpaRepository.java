package com.ndp.spring.rewardsloyalty.DiningLoyalty.repository;

import com.ndp.spring.rewardsloyalty.DiningLoyalty.model.Restaurant;
import com.ndp.spring.rewardsloyalty.DiningLoyalty.model.Reward;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RestaurantJpaRepository extends JpaRepository<Restaurant,Long> {

    public List<Restaurant> findAll();

}
