import java.util.*;

public class Thanos {

    public static void main(String[] args) {
        // TODO 1 : Create an empty heroes list
        ArrayList<Hero> heroes = new ArrayList<>();

        // TODO 2 : Add those heroes to the list
        Hero blackWidow = new Hero("Black Widow", 34);
        heroes.add(blackWidow);
        Hero captainAmerica = new Hero("Captain America", 100);
        heroes.add(captainAmerica);
        Hero vision = new Hero("Vision", 3);
        heroes.add(vision);
        Hero ironMan = new Hero("Iron Man", 48);
        heroes.add(ironMan);
        Hero scarletWitch = new Hero("Scarlet Witch", 29);
        heroes.add(scarletWitch);
        Hero thor = new Hero("Thor", 1500);
        heroes.add(thor);
        Hero spiderMan = new Hero("Spider-Man", 49);
        heroes.add(spiderMan);
        Hero hulk = new Hero("Hulk", 49);
        heroes.add(hulk);
        Hero doctorStrange = new Hero("Doctor Strange", 42);
        heroes.add(doctorStrange);

        // TODO 3 : It's Thor birthday, now he's 1501
        thor.setAge(1501);

        // TODO 4 : Shuffle the heroes list
        Collections.shuffle(heroes);

        // TODO 5 : Keep only the half of the list
        List<Hero> halfHeroes = heroes.subList(0, heroes.size()/2);

        // TODO 6 : Loop throught the list and display the name of the remaining heroes
        for (Hero hero : halfHeroes) {
            System.out.println(hero.getName());
        }
    }
}