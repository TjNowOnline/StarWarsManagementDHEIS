//Laver superklassen Character
public class Character {
    private String name;
    private int age;
    //Laver konstruktøren med navnet og alderen
    public Character(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //Laver getters og setters
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    //Laver metoder for navn og alder
    public void showAge() {
        System.out.println("Age: " + age);
    }

    public void action() {
        System.out.println("This character does something.");
    }
}
