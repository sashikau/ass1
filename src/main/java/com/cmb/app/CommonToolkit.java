package com.cmb.app;

import java.util.Date;

public class CommonToolkit {

    public String convertToEnglishFormat(String number){

        String englishText=null;

        if(number!=null){

            englishText = number.replace(",",".");

        }else{
            System.out.println("Null");
        }

        return englishText;
    }

    public String getNextDoesTime(Date previousDoesTime, String duration){
        return null;
    }

    public String getSwedidhText(String textWithUnicode){
        return null;
    }

}
