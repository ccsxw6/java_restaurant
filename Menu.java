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

    // getters/setters
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


    public ArrayList<MenuItem> addItem(MenuItem item){
        for(int i = 0; i<items.size(); i++){
            if(items.get(i).equals(item)){
                System.out.println(item.getName() + " is already on the menu");
            }
        }
        this.items.add(item);
        return this.items;
    }

    public ArrayList<MenuItem> removeItem(MenuItem item){
        // setting it to -1 will not remove anything from the array if item is not in the array
        int toBeRemoved = -1;
        for(int i = 0; i<items.size(); i++){
            if(items.get(i).equals(item)){
                toBeRemoved = i;
            }
        }
        this.items.remove(toBeRemoved);
        System.out.println("Remove item method: " + this.items);
        return this.items;
    }

    public String menuUpdated(){
        return "The menu was last updated on " + this.lastUpdated;
    }

    public void printItem(MenuItem item){
        System.out.println("Single item description: " + item.getDescription());
    }

    public void printMenu(){
        for(int i = 0; i < items.size(); i++){
            // items.get(i) is same as JS items[i]
            System.out.println("Name of item: " + items.get(i).getName() + " Description of item: " + items.get(i).getDescription());
        }
    }

}

