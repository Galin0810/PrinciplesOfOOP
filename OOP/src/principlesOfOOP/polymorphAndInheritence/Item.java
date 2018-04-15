package principlesOfOOP.polymorphAndInheritence;

public class Item {
    String nameItem;
    boolean vegetarins;
    double price;

    public Item(String nameItem, boolean vegetarins, double price) {
        this.nameItem = nameItem;
        this.vegetarins = vegetarins;
        this.price = price;
    }

    public Item() {

    }

    public String getNameItem() {
        return nameItem;
    }

    public void setNameItem(String nameItem) {
        this.nameItem = nameItem;
    }

    public boolean isVegetarins() {
        return vegetarins;
    }

    public void setVegetarins(boolean vegetarins) {
        this.vegetarins = vegetarins;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {

        return "name: "+nameItem+", "+"vegetarins: "+vegetarins+", "+"price: "+price+"\n";
    }
}
