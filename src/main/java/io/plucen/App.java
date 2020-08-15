package io.plucen;

import external.NumberService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
  private static final AnnotationConfigApplicationContext context =
      new AnnotationConfigApplicationContext(AppConfiguration.class);

  public static void main(String[] args) {
    String profile = context.getEnvironment().getProperty("spring.profiles.active");
    context.getEnvironment().setActiveProfiles(profile);

    GreetingService greetingService = context.getBean(GreetingService.class);
    NumberService numberService = context.getBean(NumberService.class);

    System.out.println(greetingService.getGreeting());
    System.out.println(numberService.getNumber());
  }
}
