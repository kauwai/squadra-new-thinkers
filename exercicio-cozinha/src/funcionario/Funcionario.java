package funcionario;

public class Funcionario {
  private String name;

  public Funcionario(String name, String activity) {
    this.name = name;
    this.activity = activity;
  }

  private String activity;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getActivity() {
    return activity;
  }

  public void setActivity(String activity) {
    this.activity = activity;
  }
}
