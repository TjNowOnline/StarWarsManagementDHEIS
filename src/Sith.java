//Laver underklasse som arver fra character superklassen
public class Sith extends Character {
    //Laver konstruktør med superklassens navn og alder
    public Sith(String name, int age) {
        super(name, age);
    }
    //Overskriver metoden action i superklassen
    @Override
    public void action() {
        System.out.println(getName() + " uses the Force for evil.");
    }
    //Overskriver metoden showAge i superklassen
    public void showAge() {
        System.out.println(getName() + " is " + getAge() + " years old.");
    }
}