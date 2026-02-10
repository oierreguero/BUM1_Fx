package eus.ehu.bum1_fx.business_logic;

public class BarcenaysCalculator implements ExchangeCalculator{

    @Override
    public String[] getCurrencyLongNames() {
        return Currency.longNames();
    }

    @Override
    public double getChangeValue(String origCurrency, String endCurrency, double amount) throws Exception {

        ForexOperator forex = new ForexOperator(origCurrency, amount, endCurrency);
        return forex.getChangeValue();
    }

    @Override
    public double calculateCommission(double amount, String origCurrency){


        CommissionCalculator comision = new CommissionCalculator(amount, origCurrency);

        try{
            return comision.calculateCommission();
        }
        catch(Exception e){
            return -1;
        }
    }

}
