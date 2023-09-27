public class RunRecipes {

    public static void main(String[] args) {
        new RunRecipes().run();
    }

    private void run() {

        Recipes recipes = new Recipes(); // Dette er bare en test for at se at metoderne i Recipes er tilgængelige.
        recipes.curryMeatballs();
        recipes.bolognesse();
        recipes.blueberryCheese();
        recipes.lasagne();
        recipes.pancakes();
    }
}
