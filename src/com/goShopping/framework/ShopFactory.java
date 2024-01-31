package com.goShopping.framework;

public abstract class ShopFactory
{
    public abstract PrimeAcc getNewPrimeAcc(int accNo,String accName,float charges,boolean isPrime );

    public abstract NormalAcc getNewNormalAcc(int accNo,String accName,float charges,float deliveryCharges);


}
