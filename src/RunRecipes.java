public class RunRecipes {
    Recipes recipes;
    public static void main(String[] args) {
        new RunRecipes().run();
    }

    private void run() {
        recipes = new Recipes();
        recipes.initializeRecipes();
        recipes.menuIntro();
    }

}
