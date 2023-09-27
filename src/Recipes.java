public class Recipes {


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
}
