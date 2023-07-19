package com.rable.examplePJ.main;

import java.text.SimpleDateFormat;
import java.util.Date;

public class GetTime {

    public static SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss:SSS z");
    public static Date date = new Date(System.currentTimeMillis());

    public static String getTime(){
        date = new Date(System.currentTimeMillis());
        return (formatter.format(date));
    }
}
