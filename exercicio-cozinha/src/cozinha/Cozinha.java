package cozinha;

import funcionario.Funcionario;
import ingredientes.Ingredientes;

import java.time.LocalDate;
import java.util.ArrayList;

public class Cozinha {
  private final int openingTime;
  private final int closingTime;
  private final String mainDish;
  private final String type;
  private final ArrayList<Ingredientes> ingredients;
  private final ArrayList<Funcionario> funcionarios;

  public Cozinha(int openingTime, int closingTime, String mainDish, String type) {
    this.openingTime = openingTime;
    this.closingTime = closingTime;
    this.mainDish = mainDish;
    this.type = type;
    this.ingredients = new ArrayList<>();
    this.funcionarios = new ArrayList<>();
  }

  public String getType() {
    return type;
  }

  public ArrayList<Ingredientes> getIngredients() {
    return ingredients;
  }

  public ArrayList<Funcionario> getFuncionarios() {
    return funcionarios;
  }

  public void setIngredientToCuisine(String name, LocalDate expirationDate){
    Ingredientes ingrediente = new Ingredientes(name, expirationDate);
    this.ingredients.add(ingrediente);
  }

  public void setWorkerToCuisine(String name, String activity) {
    Funcionario funcionario = new Funcionario(name, activity);
    this.funcionarios.add(funcionario);
  }

  public void showCuisineData() {

    System.out.println("Restaurante especializado em Cozinha " + this.getType() + "\n");
    System.out.println("Ingredientes:");
    ArrayList<Ingredientes> ingredientes = this.getIngredients();
    ingredientes.forEach(ingrediente -> System.out.println("Nome: " + ingrediente.getName() + " | Data de Validade: " + ingrediente.getExpirationDate()));
    System.out.println("");
    System.out.println("Funcionários:");
    ArrayList<Funcionario> funcionarios = this.getFuncionarios();
    funcionarios.forEach(funcionario -> System.out.println("Nome: " + funcionario.getName() + " | Função: " + funcionario.getActivity()));
    System.out.println("-------------------------------------\n");

  }

}
