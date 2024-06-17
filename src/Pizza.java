public class Pizza {
    public int price;
    public boolean veg;

    public int extraCheesePrice = 100;
    public int extraToppingsPrice = 150;
    public int backPackPrice = 20;

    public int basePizzaPrice;

    private boolean isExtraCheeseAdded = false;
    private boolean isExtraToppingAdded = false;
    private boolean isOptedForTakeAway = false;

    public Pizza(boolean veg) {
        this.veg = veg;
        if (this.veg) {
            this.price = 300;
        } else {
            this.price = 400;
        }
        basePizzaPrice = this.price;
    }

    public void addExtraCheese() {
        isExtraCheeseAdded = true;
       // System.out.println("Extra cheese added ");
        this.price += extraCheesePrice;
    }

    public void addExtraToppings() {
        isExtraToppingAdded = true;
         System.out.println("Extra topping added");
        this.price += extraToppingsPrice;
    }

    public void takeAway() {
        isOptedForTakeAway = true;
        // System.out.println("Take away opted");
        this.price += backPackPrice;
    }

    public void getBill() {
        String bill = "";
        System.out.println("Pizza: " + basePizzaPrice);
        if (isExtraCheeseAdded) {
            bill += "Extra cheese added: " +extraCheesePrice + "\n";

        }
        if (isExtraToppingAdded) {
            bill += "Extra Topping added: " +extraToppingsPrice + "\n";

        }
        if (isOptedForTakeAway) {
            bill += "Take away : " + backPackPrice + "\n ";

        }
        bill += "Bill :" + this.price + "\n";
        System.out.println(bill);


    }

}
