package principlesOfOOP.encapsulation;

public class Hero {
    //змінні доступні тільки в межах цього класу
    private String name = "Tatsumi";
    private int age = 20;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    //за допомогою цього методу в іншому класі ми зможемо дотягнутись до наших приватних полів (або об'єктів)
    public void kill(String name){
        System.out.print(getName()+" Destroy "+ name);
    }

    @Override
    public String toString() {
        return "Hero:" +
                "name='" + this.name + '\'' +
                ", age=" + this.age ;
    }
}
