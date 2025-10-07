/*Implement the following functionality into the store:

  instance variables: 
    profit: how much money the store has made
    items:  instance variable (could be an array or LinkedList or ArrayList of one of the other classes)

  methods:
    showItems: displays all items available for sale
    addItem: adds an item for sale
    sellItem(itemName): removes the item from the store and adds its price to profit
    creator(itemName): displays who created the item in question

    You will need to include the following information to be stored in the inheritance heiarchy using the other classes:
      name of thing being sold
      price for things that are on sale
      names of creators of movies and books
      date of birth of book authors
      date that things are placed on sale
      duration of movies
      publisher of books

    Where these variables are stored and how to name them is up to you!
*/

import java.util.ArrayList;

public class Store
{
  private Double profit;
  private ArrayList<ItemForSale> items;

  public Store(ArrayList<ItemForSale> i, Double p){
    items = i;
    profit = p;
  }


  public String showItems() {
    String s = "";
    for (ItemForSale item : items) {
      s += item.getName() + " by " + item.getCreator() + " ($" + item.getPrice() +") \n";
    }
    return s;
  }


  public void addItem(ItemForSale e) {
    items.add(e);
  }

  public void sellItem(ItemForSale e) {
    if (items.remove(e)) {
      profit += e.getPrice();
    }
  }

  public Double getProfit() {
    return profit;
  }

  public void setProfit(Double profit) {
    this.profit = profit;
  }

  public ArrayList<ItemForSale> getItems() {
    return items;
  }

  public void setItems(ArrayList<ItemForSale> items) {
    this.items = items;
  }
  }

