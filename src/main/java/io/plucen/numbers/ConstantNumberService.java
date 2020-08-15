package io.plucen.numbers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("constantService")
public class ConstantNumberService implements NumberService {

  private final Integer constant;

  @Autowired
  public ConstantNumberService(@Qualifier("constantInteger") Integer aa) {
    this.constant = aa;
  }

  @Override
  public Integer getNumber() {
    return 5;
  }
}
