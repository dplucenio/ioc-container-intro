package io.plucen.numbers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("constantService")
public class ConstantNumberService implements NumberService {

  private final Integer constant;

  @Autowired
  public ConstantNumberService(@Qualifier("constantInteger") Integer constant) {
    this.constant = constant;
  }

  @Override
  public Integer getNumber() {
    return constant;
  }
}
