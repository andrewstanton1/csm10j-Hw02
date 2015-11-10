
package InheritanceDesign;

abstract public class Property extends Asset 
{
    private double totalValue;
    private double totalDebt;
    
    public Property (String name, double totalValue, double totalDebt)
    {
        super (name);
        this.totalValue = totalValue;
        this.totalDebt = totalDebt;
    }
 
    public double getDebtAmount(){
       return totalDebt;
    }
    
    public double getValueAmount() {
        return totalValue;
    }
}
