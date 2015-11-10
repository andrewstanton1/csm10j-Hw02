/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InheritanceDesign;

/**
 *
 * @author andrew
 */
public class Stock extends Security{
    
    
    public Stock(String name, int quantity, double price){
        super(name, price, quantity);
        
    }
    
    @Override
    public double getAssetValue(){
        return (price * quantity);
    }
    
     @Override
    public String toString() {
        String className = this.getClass().getSimpleName();
        double totalValue = getAssetValue();
        String sharesOwned = String.format("Shares Owned: " + quantity);
        String marketValue = String.format("Price: $%,.2f", price);
        String value = String.format("Value: $%,.2f", totalValue);
        
        return name + ", " + className + ", " + sharesOwned + ", " + marketValue + ", " + value;
    }  
    
}
