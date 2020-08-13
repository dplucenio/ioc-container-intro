package io.plucen;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class AppConfiguration {

  @Bean
  public String getDefaultGreeting() {
    return "Hello I come from the IoC container!";
  }
}
