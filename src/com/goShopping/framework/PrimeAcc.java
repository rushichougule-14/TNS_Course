package com.goShopping.framework;

public abstract class PrimeAcc extends ShopAcc
{
    private boolean  isPrime;
    private  static  final float deliveryCharges = 0.0f;

    public PrimeAcc(int accNo, String accName, float charges, boolean isPrime)
    {
        super(accNo, accName, charges);

    }

    public  void bookProduct(float charges)
    {
        System.out.println("The Total charges for PrimeAcc is : "+ deliveryCharges);

    }

    @Override
    public String toString()
    {
        return super.toString();
    }

}
