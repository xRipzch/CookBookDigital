public class RunRecipes {

    public static void main(String[] args) {
        new RunRecipes().run();
    }

    private void run() {
        Recipes recipes = new Recipes();
        recipes.menuIntro();

    }
}
