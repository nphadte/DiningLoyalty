package com.ndp.spring.rewardsloyalty.DiningLoyalty.repository;

import com.ndp.spring.rewardsloyalty.DiningLoyalty.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AccountJpaRepository extends JpaRepository<Account, Long> {

    public List<Account> findAll();

    public Optional<Account> findById(Long id);
}
