class Tiger {
    String name;
    String favoriteFood = "meat";
    String newLine = System.getProperty("line.separator");

        public Tiger(String name) {

            this.name = name;

        }
        public void eat(String food) {
            System.out.print(name + " eats " +food+newLine);
            if (food.equals(favoriteFood)) {
                System.out.print("YUM!!! " + name + " wants more " + food+newLine);
            }
        }

        public void sleep() { System.out.print(name + " sleeps for 8 hours"+newLine);}

    }


