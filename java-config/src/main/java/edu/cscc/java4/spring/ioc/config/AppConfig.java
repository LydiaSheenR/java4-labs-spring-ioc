package edu.cscc.java4.spring.ioc.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public AccountDAO accountDAO(){
        return new AccountDAO();
    }

    @Bean({"accountService","accountServiceAlternateName"})
    public AccountService accountService(){
        AccountService accountService = new AccountService();
        accountService.setAccountDAO(accountDAO());
        return accountService;
    }

    @Bean
    public TransactionDAO transactionDAO(){

        return new TransactionDAO();
    }



    @Bean
    public TransactionService transactionService(){
        return new TransactionService(transactionDAO());
    }
}
