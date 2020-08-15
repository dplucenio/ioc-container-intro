package io.plucen;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class AppConfiguration {
  @Bean("constantInteger")
  public Integer getConstant() {
    return 5;
  }

  @Bean("maxInteger")
  public Integer getMax() {
    return 10;
  }
}
