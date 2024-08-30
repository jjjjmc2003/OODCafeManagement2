public class Order { //class set up
    private MenuItem item1; //item1 set up, we are declaring that item1 is a variable of MenuItem same with item1-3
    private MenuItem item2;
    private MenuItem item3;
    private double totalAmount; //sets up our total amount calculation which is double because prices have decimals


    // Adding Menu Items
    public void addItem1(MenuItem item1) { //this section of addItems is essentially a setter of the Order class, allows us to add an item to Order
        this.item1 = item1; //Basically just ensures that the item listed in the order is added to the order
    }

    public void addItem2(MenuItem item2) { //same as item1 just allows for another item to be added
        this.item2 = item2;
    }

    public void addItem3(MenuItem item3) { //again same thing allows for 3 items
        this.item3 = item3;
    }

    //Order Total Calculation
    public void calculateTotal() {
        totalAmount = item1.getPrice() + item2.getPrice() + item3.getPrice(); //Here we call in the get price from our getters and setters
        // section of our MenuItem class and use that to get the price of our 3 items being ordered by adding them up for our total amount
    }

    //display Order method
    public void displayOrderDetails() {
        System.out.println("Order: "); //making it user friendly when it prints to clearly define where the order begins
        item1.displayItemInfo(); //displaying the items and their info, displayItemInfo comes from MenuItem so we are calling it here
        item2.displayItemInfo();
        item3.displayItemInfo();
        System.out.println("Order Total:$ " + totalAmount); // Printing out total amount from the calculateTotal method specifically totalAmount
    }
}
