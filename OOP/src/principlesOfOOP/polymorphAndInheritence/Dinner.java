package principlesOfOOP.polymorphAndInheritence;

import java.util.ArrayList;
import java.util.List;

public class Dinner extends Item implements IMenu {
    @Override
    public void menu() {
        System.out.print("I`m Dinner Menu: ");
    }

    List<Item> listDinnerMenu;
    public Dinner(){
        listDinnerMenu = new ArrayList<>();
    }

}