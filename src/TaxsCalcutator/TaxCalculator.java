package TaxsCalcutator;

import TaxsCalcutator.Tax;

public class TaxCalculator implements Tax {
    private final double taxinCome;
    public TaxCalculator(double taxinCome) {
        this.taxinCome = taxinCome;
    }
    @Override
    public double calculateTax(){
        if (taxinCome <= 10000) {
            return taxinCome * 0.1;
        } else if (taxinCome <= 30000) {
            return taxinCome * 0.2;
        } else if (taxinCome <= 100000) {
            return taxinCome * 0.3;
        } else {
            return taxinCome * 0.4;
        }
    }
}
