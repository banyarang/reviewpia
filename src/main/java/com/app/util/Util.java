package com.app.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Calendar;

public class Util {
	
	public static String encryptionSHA(String password)
    {
        StringBuffer sb = new StringBuffer();
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            md.update(password.getBytes());
            byte byteData[] = md.digest();
 
            for (int i = 0; i < byteData.length; i++) {
                sb.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1));
            }
        } catch (NoSuchAlgorithmException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return sb.toString();
    }
 
    public static String encryptionSHAF(String password)
    {
 
        int factor = 0;
        Calendar cal = Calendar.getInstance();
        factor = cal.get(Calendar.DATE);
 
        String temStr = "";
        if(password.length()==64){
            temStr = password;
        }else{
            temStr = encryptionSHA(password);
        }
        //System.out.println("temStr -> "+temStr);
 
        StringBuffer sb = new StringBuffer();
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            md.update((temStr+Integer.toString(factor)).getBytes());
            byte byteData[] = md.digest();
 
            for (int i = 0; i < byteData.length; i++) {
                sb.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1));
            }
        } catch (NoSuchAlgorithmException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
 
        return sb.toString();
    }
	
}