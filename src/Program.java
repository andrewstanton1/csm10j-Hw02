/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csm10jhw02;

import InterfaceDesign.*;

public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Car carObj = new Car("Jaguar XJ", 43000, 37550);
        House houseObj = new House("Boston", 950000, 290000);
        Stock stockObj = new Stock("APPL", 50, 102.4);
        Bond bondObj = new Bond("U.S.", 10, 10000);
        BankAccount bankAccountObj = new BankAccount("BofA", 469393.32);
        Wealth wealthObject = new Wealth();
        wealthObject.addAsset(houseObj);
        wealthObject.addDebt(houseObj);//only for interface design
        wealthObject.addAsset(carObj);
        wealthObject.addDebt(carObj); //only for interface design
        wealthObject.addAsset(stockObj);
        wealthObject.addAsset(bondObj);
        wealthObject.addAsset(bankAccountObj);
        
        
        
System.out.println(wealthObject);
System.out.println(wealthObject.getAssetSummary()); //.getSummary when used for inheritance design
System.out.println(bankAccountObj);
System.out.println(stockObj);
System.out.println(bondObj);
System.out.println(houseObj);
System.out.println(carObj);



    }
    
}
