package principlesOfOOP.polymorphAndInheritence;

import java.util.ArrayList;
import java.util.List;

public class Drinks extends Item implements IMenu {
    @Override
    public void menu() {
        System.out.print("I`m Drinks Menu: ");
    }

    List<Item> listDrinksMenu;
    public Drinks(){
        listDrinksMenu = new ArrayList<>();
    }
}
