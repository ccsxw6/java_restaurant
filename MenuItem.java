package studios.restaurant;

import java.util.Date;
import java.util.Objects;

public class MenuItem {
    private double price;
    private String description;
    private String category;
    private boolean isNew;

    public MenuItem(double p, String d, String c, boolean iN) {
        this.price = p;
        this.description = d;
        this.category = c;
        this.isNew = iN;
    }

    // Method: tell if a menu item is new.
    // String isMenuNew() -> if it's newer than 2020
    public void isMenuNew(Date objectDate){
        // create a new date, and then can compare this new date with the date of the menu

        Date currentDate = new Date();
        // boolean after(Date date) : Tests if current date is after the given date.
        // if the current date is after the old date, then the menu is new
        if(currentDate.after(objectDate)){
            this.isNew = true;
            System.out.println("This item is new!!");
        } else {
            this.isNew = false;
            System.out.println("This item is old :(");
        }
    }

    public double getPrice() {return price;}
    public void setPrice(double price) {
        this.price = price;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public boolean isNew() {
        return isNew;
    }
    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    @Override
    public String toString() {
        return ("Item description: " + this.getDescription() +
                " Item price: " + this.getPrice() +
                " Item Category: "+ this.getCategory() +
                " Item is new: " + this.isNew) + " NEXT ITEM: ";
    }

    // determine if two menu items are equal or not - if they have the same description they're the equal mkay
    @Override
    public boolean equals(Object o) {
        // reference check
        if (this == o) return true;
        // making sure object passed in is of same class type MenuItem
        if (!(o instanceof MenuItem)) return false;
        // Casting! Making a field called menuItem and setting it the passed object o. Then making o MenuItem type.
        MenuItem menuItem = (MenuItem) o;

        return menuItem.getDescription() == getDescription();
    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(getPrice(), getDescription(), getCategory(), isNew());
//    }
}
