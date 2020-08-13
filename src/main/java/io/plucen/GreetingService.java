package io.plucen;

public class GreetingService {

  private final String greeting;

  GreetingService(String greeting) {
    this.greeting = greeting;
  }

  public String getGreeting() {
    return greeting;
  }
}
