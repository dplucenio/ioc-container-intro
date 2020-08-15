package io.plucen;

import io.plucen.numbers.NumberService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
  private static final AnnotationConfigApplicationContext context =
      new AnnotationConfigApplicationContext(AppConfiguration.class);

  public static void main(String[] args) {
    NumberService constantService = context.getBean("constantService", NumberService.class);
    NumberService randomService = context.getBean("randomService", NumberService.class);

    runXTimes(10, () -> System.out.print(constantService.getNumber() + " "));
    System.out.println();
    runXTimes(10, () -> System.out.print(randomService.getNumber() + " "));
    System.out.println();

    System.out.println(
        "constant integer used: " + context.getBean("constantInteger", Integer.class));
    System.out.println("max integer used: " + context.getBean("maxInteger", Integer.class));
  }

  private static void runXTimes(int n, Runnable runnable) {
    for (int i = 0; i < n; i++) {
      runnable.run();
    }
  }
}
