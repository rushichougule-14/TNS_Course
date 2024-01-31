package com.goShopping.application;

import com.goShopping.framework.NormalAcc;
import com.goShopping.framework.PrimeAcc;
import com.goShopping.framework.ShopFactory;

import java.awt.image.ShortLookupTable;

public class GSShopFactory extends ShopFactory {

    @Override
    public PrimeAcc getNewPrimeAcc(int accNo, String accName, float charges, boolean isPrime) {
        return null;
    }

    @Override
    public NormalAcc getNewNormalAcc(int accNo, String accName, float charges, float deliveryCharges) {
        return null;
    }
}
