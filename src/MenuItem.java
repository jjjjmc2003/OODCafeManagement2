public class MenuItem{ // class set up
    private String name; //declaring name object, sets up name of item
    private double price; // declaring price, sets up ability to add price of item
    private String category; // declaring category, will allow us to add item to a specific category

    //Constructor
    public MenuItem(String name, double price, String category){ //sets the framework ie ensures that every time MenuItem is called it must have 3 items name, price, and category
        this.name = name; //this ensures that when a name is given to constructor it stores it
        this.price = price; // same thing with price as name
        this.category = category; // same thing with category as name
    }

    //Getters and Setters
    //Purpose of Getters and Setters is to access private info , or the private strings and double above, so that they can be changed
    public String getName() { //getter for name means that the data type is a String and that it as the name suggests gets the name
        return name; // retrieves the name
    }
    public void setName(String name) { // this sets the name essentially allowing us to change the name, which will be important later
        this.name = name; // changing name to our input
    }

    public double getPrice(){ // same process as get Name however with double, important to declare data type
        return price; // returns price
    }

    public void setPrice(double price){ //Setter for price essentially the same as name, however different data type so important to declare
        this.price = price; // as the name suggests sets the price of the item allowing us to input whatever price we desire
    }
    public String getCategory(){ // category getter and setter is the exact same as name as they are both strings, so same process different name
        return category; // retrieves category
    }
    public void setCategory(String category){ // allowing us to change category
        this.category = category; // setting category
    }

    // Method of Displaying Info

    public void displayItemInfo() { //So with this it is important to remember the void thing, void is there to state that nothing is being returned only printed in this case but can be used for other stuff such as storage or data updates but again nothing being returned
        System.out.println("\nName of Item: " + name); // this will print the name that was input
        System.out.println("\nPrice of Item:$ " +  price); // this will print the price
        System.out.println("\nItem's Category: " + category); // this will print out category of item
        System.out.println("_______________________________"); // I added this to make it easier on the eyes when it prints out the different items
    }
}