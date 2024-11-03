//Laver en underklasse som arver fra klassen Character
public class Droid extends Character {
    //Laver en konstruktør ved brug af superklassens konstruktør
    public Droid(String name, int age) {
        super(name, age);
    }
    //Bruger override funktionen for at lave en ny metode specifikt til denne underklasse
    @Override
    public void action() {
        System.out.println(getName() + " follows orders.");
    }
    //Bruger override funktionen for at lave en ny metode specifikt til denne underklasse
    public void showAge() {
        System.out.println(getName() + " is " + getAge() + " years old.");
    }
}