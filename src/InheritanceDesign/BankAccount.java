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
public class BankAccount extends Asset{
    private double holding;
    
    public BankAccount(String name, double holding){
        super(name);
        this.holding = holding;
    }
    
    @Override
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
