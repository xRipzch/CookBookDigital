import java.util.List;
import java.util.Scanner;

public class Recipes {
    Scanner in = new Scanner(System.in);
    // Todo Lav en liste som kan tage i mod opskrifter og en liste hvor man kan søge
    // Todo Find ud af hvor mange klasser som er nødvendig

   public void bolognesse() {
        String name = "Bolognesse";
        String ingredients = "Pasta, 500G Meat, Canned Tomato";
        int estimatedTime = 30;
        printBolognesse(name, ingredients, estimatedTime);

    }


   public void lasagne() {
        String name = "Lasagne";
        String ingredients = "Pasta, 500G Meat, Canned Tomato, Cheese";
        int estimatedTime = 45;
        printLasagne(name, ingredients, estimatedTime);

    }


   public void pancakes() {
        String name = "Pancakes";
        String ingredients = "Flour, Milk, Eggs, Butter";
        int estimatedTime = 60;
        printPancakes(name, ingredients, estimatedTime);

    }


    public void blueberryCheese() {
        String name = "Blueberry Cheesecake";
        String ingredients = "Flour, Milk, Eggs, Butter, Blueberries, Cream Cheese";
        int estimatedTime = 60;
        printBlueberryCheese(name, ingredients, estimatedTime);

    }

    public void curryMeatballs() {
        String name = "Curry Meatballs";
        String ingredients = "Meat, Curry, Rice, Coconut Milk, Onion, Garlic";
        int estimatedTime = 30;
        printCurryMeatBalls(name, ingredients, estimatedTime);

    }

    public void oatMeal() {
       String name = "Oat meal";
       String ingredients = "Oats, milk";
       int estimatedTime = 1;
       printOatMeal(name, ingredients, estimatedTime);
    }

    public void cornFlakes() {
       String name = "Corn flakes";
       String ingredients = "Corn flakes, milk";
       int estimatedTime = 1;
        printCornflakes(name, ingredients, estimatedTime);
    }

    public void sandwich() {
       String name = "Sandwich";
       String ingredients = "Bread, mayo, cucumber, tomato, chicken";
       int estimatedTime = 10;
       printSandwich(name, ingredients, estimatedTime);
    }

    public void fitnessDish() {
       String name = "Fitness dish";
       String ingredients = "Chicken, rice, broccoli";
       int estimatedTime = 20;
       printFitnessDish(name, ingredients, estimatedTime);
    }

    public void printFitnessDish(String name, String ingredient, int estimated) {
        System.out.println(name + "\n" + ingredient + "\n" + estimated);
    }

    public void printSandwich(String name, String ingredient, int estimated) {
        System.out.println(name + "\n" + ingredient + "\n" + estimated);
    }


    public void printBolognesse(String name, String ingredient, int estimated) {
        System.out.println(name + "\n" + ingredient + "\n" + estimated);
    }

    public void printLasagne(String name, String ingredient, int estimated) {
        System.out.println(name + "\n" + ingredient + "\n" + estimated);

    }

    public void printPancakes(String name, String ingredient, int estimated) {
        System.out.println(name + "\n" + ingredient + "\n" + estimated);

    }

    public void printBlueberryCheese(String name, String ingredient, int estimated) {
        System.out.println(name + "\n" + ingredient + "\n" + estimated);
    }

    public void printCurryMeatBalls(String name, String ingredient, int estimated) {
        System.out.println(name + "\n" + ingredient + "\n" + estimated);

    }

    public void printOatMeal(String name, String ingredient, int estimated) {
        System.out.println(name + "\n" + ingredient + "\n" + estimated);
    }

    private void printCornflakes(String name, String ingredient, int estimated) {
        System.out.println(name + "\n" + ingredient + "\n" + estimated);
    }

    public void breakfastRecipes() {
        System.out.println("Type '1' for: Oatmeal");
        System.out.println("Type '2' for: Cornflakes");
        System.out.println("Type '0' to go back to the menu");
        breakfastAction();
    }

    public void lunchRecipes() {
        System.out.println("Type '1' for: Sandwich");
        System.out.println("Type '2' for: Fitness dish");
        System.out.println("Type '0' to go back to the menu");
        lunchAction();
    }


    public void dinnerRecipes() {
        System.out.println("Type '1' for: Bolognesse");
        System.out.println("Type '2' for: Lasaagne");
        System.out.println("Type '3' for: curryMeatBalls");
        System.out.println("Type '0' to go back to the menu");
        dinnerAction();
    }

    public void dessertRecipes() {
        System.out.println("Type '1' for: Pancakes");
        System.out.println("Type '2' for: blueberry cheesecake");
        System.out.println("Type '0' to go back to the menu");
        dessertAction();

    }

    public void breakfastAction() {
       int i = in.nextInt();
       switch (i) {
           case 1 -> oatMeal();
           case 2 -> cornFlakes();
           case 0 -> menuIntro();
           default -> breakfastAction();
       }
   }

    public void lunchAction() {
        int i = in.nextInt();
        switch (i) {
            case 1 -> sandwich();
            case 2 -> fitnessDish();
            case 0 -> menuIntro();
            default -> lunchAction();
        }

    }
    public void dinnerAction() {
       int i = in.nextInt();
       switch (i) {
           case 1 -> bolognesse();
           case 2 -> lasagne();
           case 3 -> curryMeatballs();
           case 0 -> menuIntro();
           default -> dinnerAction();
       }
    }

    public void dessertAction() {
       int i = in.nextInt();
       switch (i) {
           case 1 -> pancakes();
           case 2 -> blueberryCheese();
           case 0 -> menuIntro();
           default -> dessertAction();
       }
    }

    public void menuIntro() {
        System.out.println("Hello and welcome to the digital recipe book menu\nWould you like to:\n");
        System.out.println("See breakfast recipes. Type '1'");
        System.out.println("See lunch recipes. Type '2'");
        System.out.println("See dinner recipes. Type '3'");
        System.out.println("See dessert recipes. Type '4'");
        System.out.println("Search after a recipe. Type '5'");
        System.out.println("Create your own recipe. Type '6'");
        System.out.println("Delete one of the recipes. Type '7'");
        System.out.println("Exit the recipe book. Type '0'");
        menu();
    }
    public void menu() {
        int i = in.nextInt();
       switch (i) {
           case 1 -> breakfastRecipes();
           case 2 -> lunchRecipes();
           case 3 -> dinnerRecipes();
           case 4 -> dessertRecipes();


       }
    }
}
