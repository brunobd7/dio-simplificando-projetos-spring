package com.usingioc;

public class PurchaseOrder {

    public static void main(String[] args) {

        PurchaseOrder order = new PurchaseOrder();

        //SEND ORDER TO CLASS EMAIL TO SEND SUCESS CONFIRMATION AT THIS ORDER
        order.saveRequestPurchaseOrder();
    }


    private SendEmails sendEmails;

    public void saveRequestPurchaseOrder(){
        this.sendEmails = new SendEmails("smtp","contact.@gmail.com", "xxxxxxx");
        this.sendEmails.returnMessage("Purchase order finished sucessfull");
    }
}
