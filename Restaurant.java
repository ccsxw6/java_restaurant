package studios.restaurant;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

public class Restaurant {
    public static void main(String[] args) {

        // getting a new date object to pass into our items
        Date today = Calendar.getInstance().getTime();

        // creating menu items array
        MenuItem pizza = new MenuItem("pizza", 10, "good-good stuff", "vegan", true, today);
        MenuItem bread = new MenuItem("bread", 5, "this that bread stuff", "meat", true, today);
        MenuItem juice = new MenuItem("juice", 5, "this that juicy stuff", "meat", true, today);

        ArrayList<MenuItem> startingMenu = new ArrayList<>();

        Menu ourLaunchMenu = new Menu(today, startingMenu);

        ourLaunchMenu.addItem(pizza);
        ourLaunchMenu.addItem(bread);
        ourLaunchMenu.addItem(juice);


        ourLaunchMenu.printMenu();
//        ourLaunchMenu.printItem(pizza);
        ourLaunchMenu.removeItem(juice);
        ourLaunchMenu.printMenu();
    }
}
