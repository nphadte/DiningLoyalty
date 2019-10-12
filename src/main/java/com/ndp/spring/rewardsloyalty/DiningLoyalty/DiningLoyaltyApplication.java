package com.ndp.spring.rewardsloyalty.DiningLoyalty;

import com.ndp.spring.rewardsloyalty.DiningLoyalty.model.Account;
import com.ndp.spring.rewardsloyalty.DiningLoyalty.repository.AccountJpaRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;
import com.ndp.spring.rewardsloyalty.DiningLoyalty.repository.AccountJpaRepository;
import java.util.List;


@EnableAutoConfiguration(exclude= SecurityAutoConfiguration.class)
//@EnableAspectJAutoProxy
@SpringBootApplication()
//@Import(SecurityConfig.class)
public class DiningLoyaltyApplication {

	private static final Logger log = LoggerFactory.getLogger(DiningLoyaltyApplication.class);

	@Autowired
	private AccountJpaRepository  accountJpaRepository;

	public static void main(String[] args) {

		ApplicationContext  ctx = SpringApplication.run(DiningLoyaltyApplication.class, args);

		/*AccountJpaRepository accountJpaRepository = (AccountJpaRepository) ctx.getAutowireCapableBeanFactory().getBean("AccountJpaRepository");
		List<Account>   acctlist = accountJpaRepository.findAll();

		for ( Account a : acctlist ){
			log.info( a.toString());
		}*/
	}
}