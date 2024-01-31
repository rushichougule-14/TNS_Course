package com.goShopping.application;

import com.goShopping.framework.NormalAcc;

public class GSNormalAcc extends NormalAcc
{
    public GSNormalAcc(int accNo, String accName, float charges)
    {
        super(accNo, accName, charges);
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
