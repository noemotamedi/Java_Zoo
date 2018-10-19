class Animal {
    String name;
    String favoriteFood;
    String newLine = System.getProperty("line.separator");
    static int population = 0;

    public Animal(String name, String favoriteFood) {
        this.name = name;
        this.favoriteFood = favoriteFood;
        population++;
    }

    public void eat(String food) {
        System.out.print(name + " eats " + food + newLine);
        if (food.equals(favoriteFood)) {
            System.out.print("YUM!!! " + name + " wants more " + food + newLine);
        } else {
            sleep();
        }
    }

    public void sleep() {
        System.out.print(name + " sleeps for 8 hours" + newLine);
    }

}
