package eus.ehu.bum1_fx.business_logic;

public interface ExchangeCalculator {

    String[] getCurrencyLongNames();

    double getChangeValue(String origin, String end, double amount) throws Exception;

    double calculateCommission(double amount, String origCurrency);

}
