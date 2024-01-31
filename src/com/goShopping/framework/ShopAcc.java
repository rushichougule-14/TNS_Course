package com.goShopping.framework;

public abstract class ShopAcc
{
    private int accNo;
    private String accName;

    private  float charges;

    public ShopAcc(int accNo,String accName,float charges)
    {
        super();
        this.accNo = accNo;
        this.accName = accName;
        this.charges = charges;
    }

    public int getAccNo() {
        return accNo;
    }

    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }

    public String getAccNm() {
        return accName;
    }

    public void setAccNm(String accNm) {
        this.accName = accName;
    }

    public float getCharges() {
        return charges;
    }

    public void setCharges(float charges) {
        this.charges = charges;
    }


    public void bookProduct (float charges)
    {
        System.out.println("Your total charges for book Product is :"+this.charges);

    }

    public void items(float charges)
    {
        System.out.println("Items delivered charges are :"+this.charges);
    }

    @Override
    public String toString()
    {
        return "ShopAcc [accNo=" + accNo + ", accName=" + accName + ", charges=" + charges + ", getAccNo()=" + getAccNo()
                + ", getAccNm()=" + getAccNm() + ", getCharges()=" + getCharges() + ", getClass()=" + getClass()
                + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
    }
}
