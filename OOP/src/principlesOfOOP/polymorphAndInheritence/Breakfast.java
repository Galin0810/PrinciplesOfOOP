package principlesOfOOP.polymorphAndInheritence;

import java.util.ArrayList;
import java.util.List;

public class Breakfast  extends Item implements IMenu {
    @Override
    public void menu() {
        System.out.print("I`m breakfast Menu: ");
    }

    List<Item> listBreakfast;
    public Breakfast(){
        listBreakfast = new ArrayList<>();
    }

}