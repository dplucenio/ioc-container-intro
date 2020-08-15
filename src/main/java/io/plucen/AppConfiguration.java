package io.plucen;

import external.NumberService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackageClasses = {AppConfiguration.class, NumberService.class})
@PropertySource("classpath:/application.properties")
@PropertySource("classpath:/other.properties")
public class AppConfiguration {

  @Value("${greetingStart}")
  String greetingStart;

  @Bean
  @Profile("dev")
  public Integer getDevNumber() {
    return 0;
  }

  @Bean
  @Profile("production")
  public Integer getProductionNumber() {
    return 42;
  }

  @Bean
  public String getDefaultGreeting(@Value("${greetingEnd}") String greetingEnd) {
    return greetingStart + " " + greetingEnd;
  }
}
