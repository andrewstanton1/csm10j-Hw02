package InterfaceDesign;

import java.util.ArrayList;
import java.util.List;

public class Wealth
{
    private List<Asset> assetList = new ArrayList<Asset>();
    private List<Debt> debtList = new ArrayList<Debt>();
    
    public Wealth(){    
    }
    
    public void addAsset(Asset asset){
    assetList.add(asset);
    }
    
    public void addDebt(Debt debt){
    debtList.add(debt);
    }
    
    public double getNetWorth()
    {
        return ( getTotalAssets() - getTotalDebts() );
    }
    
    public double getTotalAssets()
    {
         double totalAssets = 0;
        
        for (int i = 0; i < assetList.size(); i++)
            totalAssets += assetList.get(i).getAssetValue();
        
        return totalAssets;
    }
    
    public double getTotalDebts()
    {
        double totalDebts = 0;
 
        for (int i = 0; i < debtList.size(); i++)
            totalDebts += debtList.get(i).getDebtAmount();
        
        return totalDebts;
    }
    
    public String getAssetSummary()
    {
        String assetSummary = "";
        
        for (int i = 0; i < assetList.size(); i++) {
            assetSummary += assetList.get(i).toString();
            assetSummary += "\n";
        }
        
        return assetSummary;
    }
    
    @Override
    public String toString(){
        
        String netWorth = String.format("Total NetWorth: $%,.2f;", getNetWorth());
        String assets = String.format("Total Assets: $%,.2f;", getTotalAssets());
        String debts = String.format("Total Debts: $%,.2f;", getTotalDebts());
        
        return ( netWorth + " " + assets + " " + debts );
    
    }
}
