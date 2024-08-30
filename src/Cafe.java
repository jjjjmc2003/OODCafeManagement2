public class Cafe { //cafe class set up

    private MenuItem menuItem1; //again declaring menu Items, rather than menuItem attributes these will be our actual menu Items that can be ordered this being the first
    private MenuItem menuItem2; // second menuItem available to be ordered
    private MenuItem menuItem3; // Third menuItem to be ordered this is the reason we make classes public so they can be called in again
    private Order currentOrder; // This calls in the Order class to declare currentOrder, an object

    // Add Menu Items Method
    public void addMenuItem1(MenuItem item1) {this.menuItem1 = item1;}
    //so basically we are redoing what we did in Order, this is the setters for addMenuItems, meaning that whatever item is selected for
    // menuItem1 it will be that item
    public void addMenuItem2(MenuItem item2) {  //same thing here but for the second menu item 3rd menuItem "setter"
        this.menuItem2 = item2;
    } //same for items 2 and 3
    public void addMenuItem3(MenuItem item3) { //same thing here but for third menu item, 3rd menuItem "setter"
        this.menuItem3 = item3;
    }
    // placeOrder Method
    public void placeOrder(Order order) { //the place order method is again a setter which is why we do Order
        this.currentOrder = order; //setter part
        order.calculateTotal(); // Calls in our calculate total method from Order to iterate through items in order and to add
        order.displayOrderDetails();// them up to get order total
    }

    // Method to display the cafe's menu
    public void displayMenu() {
        System.out.println("Menu:"); //Defining Menu
         menuItem1.displayItemInfo(); // displaying menu Items
         menuItem2.displayItemInfo();
         menuItem3.displayItemInfo();

    }
}
