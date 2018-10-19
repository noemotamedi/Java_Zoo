import java.util.ArrayList;

public class Zookeeper {
    String name;
    String newLine = System.getProperty("line.separator");


    public Zookeeper(String name){
        this.name=name;
    }

    public void feedAnimals(Animal[] animalsToFeed, String food){
        System.out.print(name+" is feeding "+food+" to "+ animalsToFeed.length+" of "+Animal.population+" total animals"+newLine);
        for(int i=0;i<animalsToFeed.length;i++){
            animalsToFeed[i].eat(food);
        }
    }
}