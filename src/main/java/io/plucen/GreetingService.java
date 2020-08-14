package io.plucen;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GreetingService {

  private final String greeting;

  @Autowired
  public GreetingService(String greeting) {
    this.greeting = greeting;
  }

  public String getGreeting() {
    return greeting;
  }
}
