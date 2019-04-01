package edu.cscc.java4.spring.ioc.config;

import org.springframework.beans.factory.annotation.Value;

/**
 * @author Jeff Anderson
 * @since 2019-01-19
 */
public class TransactionDAO {
  @Value("someValue")
  private String someProperty;


  public String getSomeProperty () {

    return someProperty;
  }


  public void setSomeProperty (String someProperty) {

    this.someProperty = someProperty;
  }

}
