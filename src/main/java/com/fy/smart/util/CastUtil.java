package com.fy.smart.util;

import org.apache.commons.lang3.StringUtils;

/**
 * @Author: fangya
 * @Description: 类型转换工具类
 * @Date: Created on 2017/11/5
 */
public class CastUtil {

    /**
     * 转换为String类型
     * */
    public static String castString(Object obj){
        return castString(obj, "");
    }

    public static String castString(Object obj, String defaultValue){
        return obj != null ? String.valueOf(obj) : defaultValue;
    }

    /**
     * 转换为Double类型
     * */
    public static double castDouble(Object obj){
        return castDouble(obj, 0);
    }

    public static double castDouble(Object obj, double defaultValue){
        double doubleValue = defaultValue;
        if (obj != null){
            String strValue = castString(obj);
            if (StringUtils.isNotEmpty(strValue)){
                try {
                    doubleValue = Double.parseDouble(strValue);
                } catch (NumberFormatException e){
                    doubleValue = defaultValue;
                }
            }
        }
        return doubleValue;
    }

    /**
     * 转换为long类型
     * */
    public static long castLong(Object obj){
        return castLong(obj, 0);
    }

    public static long castLong(Object obj, long defaultValue){
        long longValue = defaultValue;
        if (obj != null){
            String strValue = castString(obj);
            if (StringUtils.isNotEmpty(strValue)){
                try {
                    longValue = Long.parseLong(strValue);
                } catch (NumberFormatException e){
                    longValue = defaultValue;
                }
            }
        }
        return longValue;
    }

    /**
     * 转换为int类型
     * */
    public static int castInt(Object obj){
        return castInt(obj, 0);
    }

    public static int castInt(Object obj, int defaultValue){
        int intValue = defaultValue;
        if (obj != null){
            String strValue = castString(obj);
            if (StringUtils.isNotEmpty(strValue)){
                try {
                    intValue = Integer.parseInt(strValue);
                } catch (NumberFormatException e){
                    intValue = defaultValue;
                }
            }
        }
        return intValue;
    }

    /**
     * 转换为boolean类型
     * */
    public static boolean castBoolean(Object obj){
        return castBoolean(obj, false);
    }

    public static boolean castBoolean(Object obj, boolean defaultValue){
        boolean booleanValue = defaultValue;
        if (obj != null){
            String strValue = castString(obj);
            if (StringUtils.isNotEmpty(strValue)){
                try {
                    booleanValue = Boolean.parseBoolean(strValue);
                } catch (NumberFormatException e){
                    booleanValue = defaultValue;
                }
            }
        }
        return booleanValue;
    }
}
