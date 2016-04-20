package com.cddaka.springmvcDemo.util;

import com.google.gson.Gson;

import java.util.Date;
import java.util.Map;
import java.util.Random;

/**
 * Created by LHL on 2016/2/22.
 */
public class CommMethods {

    /**
     * 系统自动生成流水编号
     * @param type 类型    0:充值   1:提现  2：投资  3:债权转让  4: 转账  5:其他
     * @return
     * @author LHL
     */
    public static String GenerateSerialNumber(int type){

        Date date=new Date();
        String endVal="";
        long longVal=date.getTime();
        Random random=new Random();
        String rand=String.valueOf(random.nextInt(90) +10);
        if(type==0){
            endVal="CZ"+longVal;
        }else if(type==1){
            endVal="TX"+longVal;
        }else if(type==2){
            endVal="TZ"+longVal;
        }else if(type==3){
            endVal="ZQ"+longVal;
        }else if(type==4){
            endVal="ZZ"+longVal;
        }else if(type==5){
            endVal="LS"+longVal;
        }else{
            endVal="TS"+longVal;
        }
        endVal=endVal+rand;
        return endVal;
    }

    /**
     * 转化json字符串  到map集合
     * @param jsonStr  json字符串
     * @return map集合
     * 例子：得到其中字段的值：map.get("ams_userId")
     * @author 刘虎林
     */
    public static Map<String,String> conversionJsonToObj(String jsonStr){

        Map<String,String> map=null;

        if(jsonStr!=null && !jsonStr.equals("")){

            Gson gs=new Gson();

            map=gs.fromJson(jsonStr, Map.class);

        }

        return map;
    }

}
