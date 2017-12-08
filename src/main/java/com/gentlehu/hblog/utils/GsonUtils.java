package com.gentlehu.hblog.utils;

import com.google.gson.*;
/**
 * Created by gentle-hu on 2017/12/8 16:02.
 * Email:gentle-hu@qq.com
 */
public class GsonUtils {
    private static Gson gson = null;

    public static String toJson(Object obj){
        if(gson == null){
            gson = new GsonBuilder().serializeNulls().disableHtmlEscaping().create();
        }
        return gson.toJson(obj);
    }
}
