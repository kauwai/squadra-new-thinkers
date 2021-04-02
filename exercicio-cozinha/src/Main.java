import cozinha.Cozinha;

import java.time.LocalDate;

public class Main {

  public static void main(String[] args) {

    Cozinha cozinhaMineira = new Cozinha(14, 20, "Feijoada", "Mineira");
    Cozinha cozinhaChinesa = new Cozinha(10, 21, "Yakissoba", "Chinesa");
    Cozinha cozinhaItaliana = new Cozinha(13, 22, "Spaghetti", "Italiana");

    // Ingredientes da cozinha mineira
    cozinhaMineira.setIngredientToCuisine( "Feijão", LocalDate.of(2021,12,8));
    cozinhaMineira.setIngredientToCuisine( "Farinha", LocalDate.of(2021,6,20));
    cozinhaMineira.setIngredientToCuisine("Arroz", LocalDate.of(2021,5,13));
    cozinhaMineira.setIngredientToCuisine( "Carne de Porco", LocalDate.of(2021,4,15));
    cozinhaMineira.setIngredientToCuisine( "Linguiça", LocalDate.of(2021,4,8));

    // Funcionários da cozinha mineira
    cozinhaMineira.setWorkerToCuisine( "Juscelino", "Dono");
    cozinhaMineira.setWorkerToCuisine("Gilberto", "Cozinheiro");
    cozinhaMineira.setWorkerToCuisine( "Marcos", "Caixa");
    cozinhaMineira.setWorkerToCuisine( "Leopoldo", "Garçom");

    // Ingredientes da cozinha chinesa
    cozinhaChinesa.setIngredientToCuisine( "Champignon", LocalDate.of(2021,6,9));
    cozinhaChinesa.setIngredientToCuisine("Brocólis", LocalDate.of(2021,4,6));
    cozinhaChinesa.setIngredientToCuisine("Macarrão", LocalDate.of(2021,4,16));
    cozinhaChinesa.setIngredientToCuisine( "Carne", LocalDate.of(2021,4,12));

    // Funcionários da cozinha chinesa
    cozinhaChinesa.setWorkerToCuisine( "Lei Siu Long", "Dono");
    cozinhaChinesa.setWorkerToCuisine( "Sing Lung", "Cozinheiro");
    cozinhaChinesa.setWorkerToCuisine( "Li Lianjie", "Caixa");

    // Ingredientes da cozinha italiana
    cozinhaItaliana.setIngredientToCuisine( "Molho", LocalDate.of(2022,1,2));
    cozinhaItaliana.setIngredientToCuisine( "Macarrão", LocalDate.of(2021,5,6));
    cozinhaItaliana.setIngredientToCuisine( "Carne", LocalDate.of(2021,4,12));

    // Funcionários da cozinha italiana
    cozinhaItaliana.setWorkerToCuisine( "Giuseppe", "Dono");
    cozinhaItaliana.setWorkerToCuisine( "Niccolo", "Cozinheiro");

    cozinhaMineira.showCuisineData();
    cozinhaChinesa.showCuisineData();
    cozinhaItaliana.showCuisineData();
  }

}
