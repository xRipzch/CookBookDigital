import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Recipes {
    private List<String> shoppingList;

    Scanner in = new Scanner(System.in);

    private ArrayList<Recipes> recipeList;

    private String name;

    private int rating;

    public Recipes(String name) {
        this.name = name;
       // this.recipeList = new ArrayList<>();



    }

    public void initializeRecipes() {
        recipeList.add(new Recipes("Oat_meal"));
        recipeList.add(new Recipes("Corn_flakes"));
        recipeList.add(new Recipes("Sandwich"));
        recipeList.add(new Recipes("Fitness dish"));
        recipeList.add(new Recipes("Bolognesse"));
        recipeList.add(new Recipes("Lasagne"));
        recipeList.add(new Recipes("Curry Meatballs"));
        recipeList.add(new Recipes("Pancakes"));
        recipeList.add(new Recipes("Blueberry Cheesecake"));
    }

    public Recipes() {

        shoppingList = new ArrayList<>();
        this.recipeList = new ArrayList<>();
    }


    public Recipes(String name, String ingredients, int estimatedTime) {
    }


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
        wouldYouLikeToAddItem();
    }

    public void printSandwich(String name, String ingredient, int estimated) {
        System.out.println(name + "\n" + ingredient + "\n" + estimated);
        wouldYouLikeToAddItem();
    }


    public void printBolognesse(String name, String ingredient, int estimated) {
        System.out.println(name + "\n" + ingredient + "\n" + estimated);
        wouldYouLikeToAddItem();
    }

    public void printLasagne(String name, String ingredient, int estimated) {
        System.out.println(name + "\n" + ingredient + "\n" + estimated);
        wouldYouLikeToAddItem();

    }

    public void printPancakes(String name, String ingredient, int estimated) {
        System.out.println(name + "\n" + ingredient + "\n" + estimated);
        wouldYouLikeToAddItem();

    }

    public void printBlueberryCheese(String name, String ingredient, int estimated) {
        System.out.println(name + "\n" + ingredient + "\n" + estimated);
        wouldYouLikeToAddItem();
    }

    public void printCurryMeatBalls(String name, String ingredient, int estimated) {
        System.out.println(name + "\n" + ingredient + "\n" + estimated);
        wouldYouLikeToAddItem();

    }

    public void printOatMeal(String name, String ingredient, int estimated) {
        System.out.println(name + "\n" + ingredient + "\n" + estimated);
        wouldYouLikeToAddItem();
    }

    private void printCornflakes(String name, String ingredient, int estimated) {
        System.out.println(name + "\n" + ingredient + "\n" + estimated);
        wouldYouLikeToAddItem();
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
        in.nextLine();
        switch (i) {
            case 1 -> oatMeal();
            case 2 -> cornFlakes();
            case 0 -> menuIntro();
            default -> breakfastAction();
        }
    }

    public void lunchAction() {
        int i = in.nextInt();
        in.nextLine();
        switch (i) {
            case 1 -> sandwich();
            case 2 -> fitnessDish();
            case 0 -> menuIntro();
            default -> lunchAction();
        }

    }

    public void dinnerAction() {
        int i = in.nextInt();
        in.nextLine();
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
        in.nextLine();
        switch (i) {
            case 1 -> pancakes();
            case 2 -> blueberryCheese();
            case 0 -> menuIntro();
            default -> dessertAction();
        }
    }

    public void wouldYouLikeToAddItem() {
        System.out.println("Would you like to add an item to your list? Type (y/n)");
        String yesOrNo = in.nextLine();
        if (yesOrNo.equalsIgnoreCase("y")) {
            addItem();
        }
        else {
            menuIntro();
        }
    }

    private void addItem() {
        System.out.println("Please write the item you want added");
        String item = in.nextLine();
        System.out.println(item + " has been added to your list");
        shoppingList.add(item);
        wouldYouLikeToAddItem();
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
        System.out.println("Check you shopping list. Type '8'");
        System.out.println("Rate a recipe. Type 9");
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
            case 5 -> search();
            case 6 -> createRecipe();
            case 8 -> printShoppingList();
            case 9 -> rateRecipe();


        }
    }
    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void rateRecipe(){
        System.out.println("Type in the name of the recipe you are looking for:");
        String searchTerm = in.next();
        in.nextLine();
        Recipes foundRecipe = searchRecipeByName(searchTerm);
        if (foundRecipe == null) {
            System.out.println("Recipe not found.");
            menuIntro();
        } else {
            System.out.println("Recipe found:");
            System.out.println(foundRecipe.getName());
            System.out.println("What do you want to rate "+foundRecipe.getName()+"? (from 1 to 10)");
            int rating = in.nextInt();

            if(rating >= 1 && rating <= 10) {
                foundRecipe.setRating(rating);
                System.out.println(foundRecipe.getName() + " has been rated: " + rating);
            } else {
                System.out.println("Please provide a valid rating between 1 and 10.");
            }
            menuIntro();
        }
    }


    public void createRecipe() {
        System.out.println("Type in the name of the recipe you want to create");
        String name = in.next();
        System.out.println("Type in the ingredients of the recipe you want to create");
        in.nextLine();
        String ingredients = in.next();
        System.out.println("Type in the estimated time of the recipe you want to create");
        in.nextLine();
        int estimatedTime = in.nextInt();
        recipeList.add(new Recipes(name, ingredients, estimatedTime));
        System.out.println("Recipe created");
        System.out.println();
        menuIntro();

    }

    public void search() {
        System.out.println("Type in the name of the recipe you are looking for:");
        String searchTerm = in.next();
        in.nextLine();
        Recipes foundRecipe = searchRecipeByName(searchTerm);
        if (foundRecipe == null) {
            System.out.println("Recipe not found.");
        } else {
            System.out.println("Recipe found:");
            System.out.println("Rating "+foundRecipe.getRating());
            System.out.println(foundRecipe.getName());
        }
    }

    public String getName() {
        return name;
    }
    public List<String> getShoppinglist() {
        return this.shoppingList;
    }

    public void printShoppingList() {
        for (int i = 0; i < shoppingList.size(); i++) {
            System.out.println(shoppingList.get(i));
        }
    }

    public Recipes searchRecipeByName(String searchTerm) {
        for (Recipes recipe : recipeList) {
            if (recipe.getName().equalsIgnoreCase(searchTerm)) {
                return recipe;
            }
        }
        return null; // Recipe not found.
    }

}