import java.util.Scanner;

public class Start {

    public static void main(String[] args) {

        Bird bird1 = new Bird();
        Bird bird2 = new Bird();
        Bird bird3 = new Bird();
        Bird bird4 = new Bird();
        Bird bird5 = new Bird();
        Bird bird6 = new Bird();

        bird1.setColor("gray");
        bird1.setFlight(true);
        bird1.setSpecies("swallow");
        bird1.setWeight(10);

        bird2.setColor("white");
        bird2.setFlight(false);
        bird2.setSpecies("chicken");
        bird2.setWeight(50);

        bird3.setColor("brown");
        bird3.setFlight(true);
        bird3.setSpecies("hawk");
        bird3.setWeight(100);

        bird4.setColor("green");
        bird4.setFlight(true);
        bird4.setSpecies("pigeon");
        bird4.setWeight(20);

        bird5.setColor("pink");
        bird5.setFlight(true);
        bird5.setSpecies("flamingo");
        bird5.setWeight(200);

        bird6.setColor("brown-gray");
        bird6.setFlight(false);
        bird6.setSpecies("kiwi");
        bird6.setWeight(5);


        Bird[] birds = new Bird[6];

        birds[0] = bird1;
        birds[1] = bird2;
        birds[2] = bird3;
        birds[3] = bird4;
        birds[4] = bird5;
        birds[5] = bird6;

        System.out.print("Give me a bird type:");
        Scanner

                keyboard = new Scanner(System.in);
        String input = keyboard.nextLine();
        for (int i=0; i<birds.length; i++){
            if(birds[i].getSpecies().equalsIgnoreCase(input)){
                System.out.println("We've got that!");
            } else if (i==birds.length-1 && !birds[i].getSpecies().equalsIgnoreCase(input)){
                System.out.println("sorry...");
            }
        }
        }

    }