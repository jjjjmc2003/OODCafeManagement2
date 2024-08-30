public class Test {
    public static void main(String[] args) {

        //So to test our code first we have to have our 3 Menu Items so let's make our three items I'm feeling coffee, pastry, and pizza
        MenuItem coffee = new MenuItem("Coffee", 1.00, "Breakfast");
        MenuItem pastry = new MenuItem("Pastry", 3.50, "Breakfast");
        MenuItem pizza = new MenuItem("Pizza", 5.00, "Lunch");

        //Now that we have some items lets make a menu

        Cafe cafe = new Cafe();     // so the reason we have new here and in front of MenuItem and Order is because when we are calling
        cafe.addMenuItem1(coffee);  // a class in we have to say new to make a new instance of the class essentially meaning new lets us
        cafe.addMenuItem2(pastry); // use the class
        cafe.addMenuItem3(pizza);  // here I added the Menu Items to the cafe Menu Items so that we can
        cafe.displayMenu();         // display the Menu

        //Now that we have our menu let's fill out an order

        Order order = new Order(); // again calling in the class to use it
        order.addItem1(coffee);
        order.addItem2(pastry); // This customer felt like ordering a coffee pastry and pizza
        order.addItem3(pizza);

        cafe.placeOrder(order); // now that we have an order we can utilize that placeOrder method we set up

    }
}
