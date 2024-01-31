package com.goShopping.framework;

public class NormalAcc extends ShopAcc
{
    private final float  deliveryCharges = 80.0f;

    public NormalAcc(int accNo, String accName, float charges)
    {
        super(accNo, accName, charges);
    }

    @Override
    public void bookProduct(float charges)
    {
        float ians = 0;
        ians = charges + deliveryCharges;
        System.out.println("The charges for Normal account for bookproduct is :"+ians);

    }

    @Override
    public String toString() {
        return super.toString();
    }
}
