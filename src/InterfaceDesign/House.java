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
public class House implements Debt, Asset{
    
    private String name;
    private double marketValue, mortgage;
    
    public House(String name, double marketValue, double mortgage){
        this.name = name;
        this.marketValue = marketValue;
        this.mortgage = mortgage;
    }

   @Override
    public double getAssetValue(){
        return marketValue;
    }  
    
        @Override
    public double getDebtAmount() {
      return mortgage;
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
