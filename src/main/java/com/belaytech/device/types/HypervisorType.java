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
public enum HypervisorType {
    VSPHERE(1, "VSphere"),
    VMWKS(2, "VMWKS"),
    VBOX(3, "VBox");

    private final int code;
    private final String desc;

    private HypervisorType(int hypervisorCode, String hypervisorDesc) {
        this.code = hypervisorCode;
        this.desc = hypervisorDesc;
    }

    public int getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

    public static class Deserializer implements JsonDeserializer<HypervisorType> {

        @Override
        public HypervisorType deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
            return HypervisorType.values()[json.getAsInt() - 1];
        }
    }

    public static class Serializer implements JsonSerializer<HypervisorType> {

        @Override
        public JsonElement serialize(HypervisorType src, Type typeOfSrc, JsonSerializationContext context) {
            return new JsonPrimitive(src.getCode());
        }
    }
}
