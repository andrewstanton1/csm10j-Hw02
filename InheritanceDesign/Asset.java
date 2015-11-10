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
abstract public class Asset {
    
    public String name;
    
    public Asset (String name)
    {
        this.name = name;
    }
    
    public abstract double getAssetValue();
    
    
}
