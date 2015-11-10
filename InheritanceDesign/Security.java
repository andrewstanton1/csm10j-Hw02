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
abstract public class Security extends Asset{
    public double price;
    public int quantity;
    
    public Security (String name, double price, int quantity)
    {
        super(name);
        this.price = price;
        this.quantity = quantity;
    }
}
