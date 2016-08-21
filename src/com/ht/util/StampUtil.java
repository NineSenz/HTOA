package com.ht.util;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by GMB on 2016/8/12.
 */
public class StampUtil {
    private static String stamp;
    /*
     * 将时间转换为时间戳
     */
    public static String dateToStamp(String s) throws ParseException {
        String res;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = simpleDateFormat.parse(s);
        long ts = date.getTime();
        res = String.valueOf(ts);
        return res;
    }
    /*
     * 将时间戳转换为时间
     */
    public static String stampToDate(String s){
        String res;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        long lt = new Long(s);
        Date date = new Date(lt);
        res = simpleDateFormat.format(date);
        return res;
    }
    public static  String getStamp(){
        Date cld = Calendar.getInstance().getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date = sdf.format(cld);
        try {
            stamp = dateToStamp(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return stamp;
    }
    public static  String getDate(){
        Date cld = Calendar.getInstance().getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date = sdf.format(cld);
        return date;
    }
    @Test
    public void testStamp(){
        Calendar cld = Calendar.getInstance();
        System.out.println(cld);
        try {
            System.out.println(StampUtil.dateToStamp("2016-8-12 12:20:45"));
            System.out.println(StampUtil.stampToDate("1470975645000"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
