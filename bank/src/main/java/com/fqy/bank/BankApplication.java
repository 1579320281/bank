package com.fqy.bank;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.fqy.bank.entity.Phone;
import com.fqy.bank.repository.IdCardRep;
import com.fqy.bank.repository.PhoneRep;

@SpringBootApplication
public class BankApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankApplication.class, args);
	}
	//@Bean
//	public CommandLineRunner a(BeanFactory factory) {
//		
//		return new CommandLineRunner() {
//			
//			@Override
//			public void run(String... args) throws Exception {
//				
//				IdCardRep idCardRep= factory.getBean(IdCardRep.class);
//				PhoneRep phoneRep = factory.getBean(PhoneRep.class) ;
//				System.out.println(phoneRep.findById(12345678900L).get().getIdCard().getName());
//				
//				System.out.println(idCardRep.findById(110002199911116666L).get().getName());
//				//System.out.println(idCardRep.findById(110002199911116666L).get().getPhone().size());
//			}
//			
//		};
//		
//	}
}
