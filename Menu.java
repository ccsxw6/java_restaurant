package studios.restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private Date lastUpdated;
    // items is an ArrayList of type MenuItem!
    private ArrayList<MenuItem> items;

    public Menu(Date d, ArrayList<MenuItem> i) {
        this.lastUpdated = d;
        this.items = i;
    }

    // Method: add and remove menu items
    // addMenuItem(String itemToAdd) -> items.put(itemToAdd)
    // same for remove except don't use put!
    public void addMenuItem(MenuItem itemToAdd){
        // check if item to add is in ArrayList
        if(items.contains(itemToAdd)){
            System.out.println("Item already in Menu");
        }
        items.add(itemToAdd);
    }


    //Method: tell when the menu was last updated.
    // just return a string with lastUpdated in it?? sounds a lot like the getter...
    public void menuLastUpdate(Date udpatedDate){
        System.out.println("Menu last updated: " +  udpatedDate);
    }

    //Method: print out both a single menu item and the entire menu. ALREADY PRINTED OUT WHOLE MENU W/ .toString method
    // printMenuItem(itemToSearch) -> search through items, if itemToSearch is items, print out that menu item
    // print an item at specific index
    public void printOneItem(int indexNumber) {
        System.out.println("Here's a single item: " + items.get(indexNumber));
    }

    // trying to print whole menu but not working
//    public void printWholeMenu(ArrayList allItems){
//        System.out.println("Entire Menu: " + allItems.toString());
//    }


    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }
    public Date getLastUpdated() {
        return lastUpdated;
    }
    public ArrayList<MenuItem> getItems() {
        return items;
    }

}

