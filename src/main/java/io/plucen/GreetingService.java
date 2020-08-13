package io.plucen;

import org.springframework.stereotype.Component;

@Component
public class GreetingService {

  private final String greeting;

  public GreetingService(String greeting) {
    this.greeting = greeting;
  }

  public String getGreeting() {
    return greeting;
  }
}
