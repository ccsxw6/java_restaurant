package studios.restaurant;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class Restaurant {
    public static void main(String[] args) {

        // creating menu items array
        ArrayList<MenuItem> itemsArrayList = new ArrayList<>();
        MenuItem pizza = new MenuItem(10, "good-good shit", "vegan", true);
        MenuItem bread = new MenuItem(5, "good-good shit", "meat", true);
        itemsArrayList.add(pizza);
        itemsArrayList.add(bread);
        // creating date object
        Date today = new Date(); //
        // instantiating Menu class
        Menu firstMenu = new Menu(today, itemsArrayList);
        System.out.println(firstMenu.getLastUpdated());

        // printing out all the menu items
        ArrayList gettingItems = firstMenu.getItems();
        System.out.println(gettingItems.toString());

        // Printing whole menu method not working
//        printWholeMenu(itemsArrayList);

        // checking if menu is new or not
        Date oldDate = new Date(2021, 11, 21);
        pizza.isMenuNew(oldDate);

        // printing when the menu was last updated
        firstMenu.menuLastUpdate(oldDate);

        // printing one menu item at a time
        firstMenu.printOneItem(0);

        // checking equals method - returns true if descriptions are equal
        System.out.println("Equals method: " + pizza.equals(bread));
    }
}
