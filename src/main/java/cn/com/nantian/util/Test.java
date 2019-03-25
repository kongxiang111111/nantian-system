package cn.com.nantian.util;

import java.util.Date;

/**
 * @Description:
 * @Author：Fly
 * @Date: 2019/3/22 16:19
 * @Version：1.0
 */
public class Test {

    public static void main(String[]args){
        AAA aaa=new AAA();
        aaa.setPriceId(2);
        aaa.setCustType("F");
        aaa.setLeavePrice(25.0);
        aaa.setProjectBegdate(new Date());
        AAA aa=new AAA();
        aa.setPriceId(2);
        aa.setCustType("F");
        aa.setLeavePrice(25.0);
        aa.setProjectBegdate(new Date());

        boolean isok=ClassCompareUtil.compareObject(aaa,aa);
        System.out.println(isok);
    }
}
