package io.plucen;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan
public class AppConfiguration {
  @Bean("constantInteger")
  public Integer getConstant() {
    return 5;
  }

  @Bean("maxInteger")
  public Integer getMax() {
    return 10;
  }

  @Bean
  @Primary
  public String happyFinalMessage() {
    return "What a great example, this is the end.";
  }
  @Bean
  public String bitterFinalMessage() {
    return "What a stupid example, I'm glad this is over.";
  }
}
