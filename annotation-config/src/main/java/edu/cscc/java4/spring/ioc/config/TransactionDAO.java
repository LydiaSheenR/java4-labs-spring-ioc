package edu.cscc.java4.spring.ioc.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Jeff Anderson
 * @since 2019-01-19
 */
@Component
public class TransactionDAO {

  private String someProperty;


  public String getSomeProperty () {

    return someProperty;
  }


  public void setSomeProperty (String someProperty) {

    this.someProperty = someProperty;
  }

}
