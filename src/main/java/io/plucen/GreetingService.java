package io.plucen;

public class GreetingService {

  private final String greeting;

  public GreetingService(String greeting) {
    this.greeting = greeting;
  }

  public String getGreeting() {
    return greeting;
  }
}
