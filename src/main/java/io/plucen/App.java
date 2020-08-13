package io.plucen;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
  private static final AnnotationConfigApplicationContext context =
      new AnnotationConfigApplicationContext(AppConfiguration.class);

  public static void main(String[] args) {
    GreetingService greetingService = context.getBean(GreetingService.class);
    System.out.println(greetingService.getGreeting());
  }
}
