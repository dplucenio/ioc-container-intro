package io.plucen;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {

  @Bean
  public String getDefaultGreeting() {
    return "Hello I come from the IoC container!";
  }

  @Bean
  public GreetingService getGreetingService(String greeting) {
    return new GreetingService(greeting);
  }
}
