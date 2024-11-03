//Laver underklasse som arver fra character superklassen
public class Jedi extends Character {
    //Laver konstruktør med navn og alder og bruger superklassens konstruktør
    public Jedi(String name, int age) {
        super(name, age);
    }
    //Overskriver superklassens metode action
    @Override
    public void action() {
        System.out.println(getName() + " uses the Force for good.");
    }
    //Overskriver superklassens metode showAge
    public void showAge() {
        System.out.println(getName() + " is " + getAge() + " years old.");
    }
}