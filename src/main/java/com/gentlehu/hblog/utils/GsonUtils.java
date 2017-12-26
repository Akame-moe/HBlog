package com.gentlehu.hblog.utils;

import com.google.gson.*;

import java.lang.reflect.Type;
import java.text.ParseException;
import java.util.Date;

/**
 * Created by gentle-hu on 2017/12/8 16:02.
 * Email:gentle-hu@qq.com
 */
public class GsonUtils {
    private static Gson gson = null;

    public static String toJson(Object obj){
        if(gson == null){
            gson = new GsonBuilder().serializeNulls().disableHtmlEscaping()
                    .registerTypeAdapter(Date.class, new DateAdapter()).create();
        }
        return gson.toJson(obj);
    }
    static class DateAdapter implements JsonSerializer<Date>,JsonDeserializer {

        @Override
        public Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            if(jsonElement == null) return null;
            String str = jsonElement.getAsString();
            try {
                return DateUtils.parse(str);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            return null;
        }

        @Override
        public JsonElement serialize(Date dateTime, Type type, JsonSerializationContext jsonSerializationContext) {
            String s = DateUtils.format(dateTime);
            return new JsonPrimitive(s);
        }
    }
}
