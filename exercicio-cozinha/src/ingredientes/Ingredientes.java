package ingredientes;

import java.time.LocalDate;

public class Ingredientes {
  private final String name;
  private final LocalDate expirationDate;

  public Ingredientes(String name, LocalDate expirationDate) {
    this.name = name;
    this.expirationDate = expirationDate;
  }

  public String getName() {
    return name;
  }

  public LocalDate getExpirationDate() {
    return expirationDate;
  }

}
