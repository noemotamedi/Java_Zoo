class Zoo{

    public static void main(String[] args) {
        //either make a new instance of a zoo
        //to call the non-static sleep method....
        Tiger tigger = new Tiger("Tigger");
        tigger.eat( "meat");

        Bear pooh = new Bear("Pooh");
        pooh.eat("fish");
        pooh.eat("meat");

        Unicorn rarity=new Unicorn("rarity");
        rarity.eat("marshmallows");
        rarity.sleep();

        Giraffe gemma=new Giraffe("Gemma");
        gemma.eat("meat");
        gemma.eat("leaves");

        Bee stinger=new Bee("Stinger");
        stinger.eat("ice cream");
        stinger.eat("pollen");

        Animal[] animalsToFeed= {tigger,pooh,rarity,gemma,stinger};

        Zookeeper zoebot=new Zookeeper("Zoebot");
        zoebot.feedAnimals(animalsToFeed, "The People at Liberty University");
    }
}