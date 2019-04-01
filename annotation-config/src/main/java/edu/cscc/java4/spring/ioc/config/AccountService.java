package edu.cscc.java4.spring.ioc.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author Jeff Anderson
 * @since 2019-01-19
 */
@Component
@Service
public class AccountService {

  AccountDAO accountDAO;


  public AccountDAO getAccountDAO () {

    return accountDAO;
  }

  @Autowired
  public void setAccountDAO (AccountDAO accountDAO) {

    this.accountDAO = accountDAO;
  }

}
