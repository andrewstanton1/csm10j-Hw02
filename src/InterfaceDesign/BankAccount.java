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
public class BankAccount implements Asset{
    
     private double holding;
     private String name;
    
    public BankAccount(String name, double holding){
        this.name = name;
        this.holding = holding;
    }
    
    public double getAssetValue(){
        return holding;
    }
    
         @Override
    public String toString() {
        String className = this.getClass().getSimpleName();
        double totalValue = getAssetValue();
        String totalHolding = String.format("Account Value: $%,.2f", holding);
        
        return name + ", " + className + ", " + totalHolding;
    }  
    
}
