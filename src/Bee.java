public class Bee extends Animal {
    public Bee(String name) {
        super(name, "pollen");
    }
    public void eat(String food) {
        System.out.print(name + " eats " +food+newLine);
        if (food.equals(favoriteFood)) {
            System.out.print("YUM!!! " + name + " wants more " + food+newLine);
            sleep();
        }else{
            System.out.print("YUCK!!! "+ name +" will not eat " +food+newLine);
        }
    }
    public void sleep() { System.out.print(name + " never sleeps"+newLine);}
}