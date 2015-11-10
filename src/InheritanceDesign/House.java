/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InheritanceDesign;

public class House extends Property{
    
    public House(String name, double marketValue, double mortgage){
        super(name, marketValue, mortgage);
    }

   @Override
    public double getAssetValue(){
        return getValueAmount();
    }  
   
      
    @Override
    public String toString() {
        String className = this.getClass().getSimpleName();
        double totalValue = getValueAmount();
        double totalDebt = getDebtAmount();
        String value = String.format("Value: $%,.2f", totalValue);
        String financed = String.format("Debt: $%,.2f", totalDebt);
        
        return name + ", " + className + ", " + value + ", " + financed;
    }  
}
