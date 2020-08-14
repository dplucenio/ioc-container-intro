package external;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class NumberService {

  private Integer number;

  @Autowired
  public void setNumber(Integer number) {
    this.number = number;
  }

  public Integer getNumber() {
    return number;
  }
}
