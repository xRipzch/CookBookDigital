public class Recipes {


    void Bolognesse() {
        String name = "Bolognesse";
        String ingredients = "Pasta, 500G Meat, Canned Tomato";
        int estimatedTime = 30;
        printBolognesse(name, ingredients, estimatedTime);
    }


    void Lasagne() {
        String name = "Lasagne";
        String ingredients = "Pasta, 500G Meat, Canned Tomato, Cheese";
        int estimatedTime = 45;
    }


    void Pancakes() {
        String name = "Pancakes";
        String ingredients = "Flour, Milk, Eggs, Butter";
        int estimatedTime = 60;
    }


    void BlueberryCheese () {
        String name = "Blueberry Cheesecake";
        String ingredients = "Flour, Milk, Eggs, Butter, Blueberries, Cream Cheese";
        int estimatedTime = 60;

    }

    void curryMeatballs() {
        String name = "Curry Meatballs";
        String ingredients = "Meat, Curry, Rice, Coconut Milk, Onion, Garlic";
        int estimatedTime = 30;

    }

    void printBolognesse(String name, String ingredient, int estimated) {
        System.out.println(name + "\n" + ingredient + "\n" + estimated);
    }


}
