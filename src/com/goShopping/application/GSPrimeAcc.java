package com.goShopping.application;

import com.goShopping.framework.PrimeAcc;

public class GSPrimeAcc extends PrimeAcc
{
    private static final float Charges = 0.0f;
    public GSPrimeAcc(int accNo, String accName, float charges,boolean isPrime)
    {
        super(accNo, accName, charges,isPrime);

    }

    @Override
    public void bookProduct(float charges) {
        super.bookProduct(charges);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
