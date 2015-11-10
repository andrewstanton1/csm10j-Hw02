/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceDesign;

/**
 *
 * @author andre
 */
public class Bond implements Asset{
    String name;
    int quantity;
    double price;
    
       public Bond(String name, int quantity, double price){
           this.name = name;
           this.quantity = quantity;
           this.price = price;
    }
    
    @Override
    public double getAssetValue(){
        return (price * quantity);
    }
    
    @Override
    public String toString() {
        String className = this.getClass().getSimpleName();
        double totalValue = getAssetValue();
        String notesOwned = String.format("Notes Owned: " + quantity);
        String marketValue = String.format("Price: $%,.2f", price);
        String value = String.format("Value: $%,.2f", totalValue);
        
        return name + ", " + className + ", " + notesOwned + ", " + marketValue + ", " + value;
    }  
}
