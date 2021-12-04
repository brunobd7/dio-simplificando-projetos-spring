package com.usingioc;

public class SendEmails {

    public SendEmails(String type, String andress , String password) {

    }

    public void returnMessage(String message){
        System.out.println(message);
    }


    public static SendEmails getEmailData(){
        return new SendEmails("smtp","contact.@gmail.com", "xxxxxxx");
    }
}
