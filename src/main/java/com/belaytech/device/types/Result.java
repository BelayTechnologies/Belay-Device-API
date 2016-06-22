/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.belaytech.device.types;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;

/**
 *
 * @author Joshua
 */
public enum Result {
    PASS(1, "Pass"),
    FAIL(2, "Fail"),
    CRITICAL(3, "Critical"),
    AGENT_ERROR(4, "Agent Error"),
    ABORTED(5, "Aborted"),
    UNKNOWN(6, "Unknown");

    private final int code;
    private final String desc;

    private Result(int resultCode, String resultDesc) {
        this.code = resultCode;
        this.desc = resultDesc;
    }

    public int getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

    public static class Deserializer implements JsonDeserializer<Result> {

        @Override
        public Result deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
            return Result.values()[json.getAsInt() - 1];
        }
    }

    public static class Serializer implements JsonSerializer<Result> {

        @Override
        public JsonElement serialize(Result src, Type typeOfSrc, JsonSerializationContext context) {
            return new JsonPrimitive(src.getCode());
        }
    }
}
