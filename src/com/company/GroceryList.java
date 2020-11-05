package com.company;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryItem = new ArrayList<>();

    /*public GroceryList(ArrayList groceryItem){
        this.groceryItem = groceryItem;
    }*/
    public void addGroceryItem(String item){
        this.groceryItem.add(item);
    }
    public ArrayList<String> getGroceryItem(){
        return this.groceryItem;
    }
    public void printGroceryList(){
        System.out.println("You have " + this.groceryItem.size() + " items in your grocery list");
        for(String item : this.groceryItem){
            System.out.println(item);
        }
    }

    public void modifyGroceryItem(String currentItem, String newItem){
        for(int i = 0;i<this.groceryItem.size();i++){
            if(this.groceryItem.get(i).equals(currentItem)){
                this.groceryItem.set(i,newItem);
                System.out.println("Grocery item " + (i+1) + " has been modified.");
            }
        }
    }

    public void removeGroceryItem(String item){
        for(int i=0;i<this.groceryItem.size();i++){
            if(this.groceryItem.get(i).equals(item)){
                this.groceryItem.remove(item);
                System.out.println("Grocery item " + (i+1) + " has been deleted.");
            }
        }
    }
    private int findItem(String searchItem){
        return this.groceryItem.indexOf(searchItem);
    }
    public boolean onListItem(String searchItem){
        int position = findItem(searchItem);
        if (position >= 0){
            return true;
        }
        else{
            return false;
        }
    }


}
