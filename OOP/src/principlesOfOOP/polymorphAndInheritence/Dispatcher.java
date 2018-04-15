package principlesOfOOP.polymorphAndInheritence;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
 /* Поліморфізм - реалізація завдань однієї і тієї  ідеї різним способом.
Наслідування - здатність об'єкту або класу базуватися на іншому об'єкті або класі.
+++ Це особисто-експерементальний приклад з використанням різних колекцій , вкладень ,
нових функцій java8 та просто трохи фантазії.
Також тут зустрічається один з принципу SOLID(Interface Segregation)- розділення на інтерфейси
(в даному прикладі тільки 1 інтерфейс , але можна було код поділити і на більше )
*/
public class Dispatcher {

    public static void main(String[] args) {

        Breakfast breakfast = new Breakfast();
        breakfast.menu();

        breakfast.listBreakfast.add(new Item("porridge",true,3.99));
        breakfast.listBreakfast.add(new Item("yawner",false,8.99));
        breakfast.listBreakfast.add(new Item("toasts",true,2.66));

        breakfast.listBreakfast.forEach(System.out::print);
        System.out.println();

        Dinner dinner = new Dinner();
        dinner.menu();
        dinner.listDinnerMenu.add(new Item("bruschetta",false,34.99));
        dinner.listDinnerMenu.add(new Item("calzonne",false,44.99));
        dinner.listDinnerMenu.add(new Item("pilaf with mushrooms",true,32.66));

        dinner.listDinnerMenu.forEach(System.out::print);

        System.out.println();


        Drinks drinks = new Drinks();
        drinks.menu();
        drinks.listDrinksMenu.add(new Item("wine",true,30.00));
        drinks.listDrinksMenu.add(new Item("juice",true,10.00));
        drinks.listDrinksMenu.add(new Item("coffee",true,15.00));

        drinks.listDrinksMenu.forEach(System.out::print);
        System.out.println();

        Client client1 = new Client("Sergio");
        Client client2 = new Client("Igor");

        Map<Client,List<Item>> map = new HashMap<>();
        Map<Client, List<Item>> map2 = new HashMap<>();

        map.put(client1, Collections.singletonList(drinks.listDrinksMenu.get(1)));
        map2.put(client2, Collections.singletonList(dinner.listDinnerMenu.get(2)));

        for(Client c: map.keySet()) {
            System.out.println(c + " - " + map.get(c));
        }
        System.out.println();

        for(Client c: map2.keySet()) {
            System.out.println(c + " - " + map2.get(c));
        }


    }}
