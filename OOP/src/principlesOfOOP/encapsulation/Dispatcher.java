package principlesOfOOP.encapsulation;

public class Dispatcher {
    /* Інкапсуляція - розміщення одного
    об'єкту або класу в іншому для розмежування доступу до них.
     */
    public static void main(String[] args) {

        Hero hero = new Hero();
        System.out.println(hero.toString());
        hero.kill("Akame");


    }
}
