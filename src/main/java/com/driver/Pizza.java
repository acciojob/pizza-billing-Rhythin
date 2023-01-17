package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private boolean cheeseAdded;
    private boolean toppingsAdded;
    private boolean isTakeOut;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        toppingsAdded=false;
        cheeseAdded=false;
        isTakeOut=false;

        if(isVeg)price=300;
        else price=400;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!cheeseAdded) {
            price += 80;
            cheeseAdded=true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!toppingsAdded){
            if (isVeg) price += 70;
            else price += 120;

            toppingsAdded=true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!isTakeOut) {
            price+=20;
            isTakeOut = true;
        }
    }

    public String getBill(){
        // your code goes here
        if(isVeg){
            bill="Base Price Of The Pizza: 300\n";
        }
        else {
            bill="Base Price Of The Pizza: 400\n";
        }
        if(cheeseAdded) {
            bill += "Extra Cheese Added: 80\n";
        }
        if (toppingsAdded){
            if(isVeg) {
                bill += "Extra Toppings Added: 70\n";
            }
            else {
                bill += "Extra Toppings Added: 120\n";
            }
        }
        if (isTakeOut) {
            bill += "Paperbag Added: 20\n";
        }

        bill+="Total Price: "+price+"\n";
        return this.bill;
    }
}
