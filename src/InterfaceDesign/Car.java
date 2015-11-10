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
public class Car implements Asset, Debt{
    
    private String name;
    private double price, financed;
    
    
      public Car(String name, double price, double financed){
        this.name = name;
        this.price = price;
        this.financed = financed;
    }
    
    @Override
    public double getAssetValue(){
        return price;
    }
    
        @Override
    public double getDebtAmount() {
        return financed;
    }
    
    @Override
    public String toString() {
        String className = this.getClass().getSimpleName();
        double totalValue = getAssetValue();
        double totalDebt = getDebtAmount();
        String value = String.format("Value: $%,.2f", totalValue);
        String financed = String.format("Debt: $%,.2f", totalDebt);
        
        return name + ", " + className + ", " + value + ", " + financed;
    }
    
}
