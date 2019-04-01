package edu.cscc.java4.spring.ioc.config;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author Jeff Anderson
 * @since 2019-01-19
 */
@Component
@Service
public class TransactionService {

  TransactionDAO transactionDAO;

  public TransactionService (TransactionDAO transactionDAO) {

    this.transactionDAO = transactionDAO;
  }


  public TransactionDAO getTransactionDAO () {

    return transactionDAO;
  }

}
