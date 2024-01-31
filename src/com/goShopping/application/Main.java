package com.goShopping.application;
import com.goShopping.framework.NormalAcc;
import com.goShopping.framework.PrimeAcc;
import com.goShopping.framework.ShopFactory;

public class Main
{
    public static void main(String[] args)
    {
        ShopFactory sf = new GSShopFactory();

        PrimeAcc pac = new GSPrimeAcc(202,"Rushi",100,true);
        pac.bookProduct(100);
        pac.toString();


        NormalAcc nac = new GSNormalAcc(222,"Soham",400);
        nac.bookProduct(400);
        nac.toString();



    }
}
