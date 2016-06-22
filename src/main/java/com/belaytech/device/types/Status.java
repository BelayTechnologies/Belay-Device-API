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
public enum Status {
    DOWN(1, "Down"),
    UP(2, "Up"),
    SUBMITTED(3, "Submitted"),
    QUEUED(4, "Queued"),
    COMPLETE(5, "Complete"),
    RUNNING(6, "Running"),
    CANCELLED(7, "Cancelled"),
    STARTING_UP(8, "Starting Up"),
    SHUTTING_DOWN(9, "Shutting Down"),
    ASSIGNED(10, "Assigned");

    private final int code;
    private final String desc;

    private Status(int statusCode, String statusDesc) {
        this.code = statusCode;
        this.desc = statusDesc;
    }

    public int getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

    public static class Deserializer implements JsonDeserializer<Status> {

        @Override
        public Status deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
            return Status.values()[json.getAsInt() - 1];
        }
    }

    public static class Serializer implements JsonSerializer<Status> {

        @Override
        public JsonElement serialize(Status src, Type typeOfSrc, JsonSerializationContext context) {
            return new JsonPrimitive(src.getCode());
        }
    }
}
