package io.plucen.numbers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("randomService")
public class RandomNumberService implements NumberService {
  private final Integer maximumValue;

  @Autowired
  public RandomNumberService(@Qualifier("maxInteger") Integer maximumValue) {
    this.maximumValue = maximumValue;
  }

  @Override
  public Integer getNumber() {
    return (int) Math.round(Math.random() * maximumValue);
  }
}
