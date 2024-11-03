//Importerer ArrayList funktionen til programmet
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Laver ny ArrayList som indeholder karaktererne i programmet
        ArrayList<Character> characters = new ArrayList<>();
        //Tilføjer karakterer til ArrayListen "characters"
        characters.add(new Jedi("Obi-Wan Kenobi", 57));
        characters.add(new Sith("Darth Vader", 45));
        characters.add(new Droid("R2-D2", 35));
        //Kører funktionen "action" for hver karakter i ArrayListen
        for (Character character : characters) {
            character.action();
            character.showAge();
        }
    }
}
