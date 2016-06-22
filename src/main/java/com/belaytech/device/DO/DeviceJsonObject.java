/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.belaytech.device.DO;

import com.belaytech.device.types.Result;
import com.belaytech.device.types.Status;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 *
 * @author Joshua
 * @param <T>
 */
public abstract class DeviceJsonObject<T> {

    public String toJson() {
        GsonBuilder gb = new GsonBuilder();
        gb.registerTypeAdapter(Status.class, new Status.Serializer());
        gb.registerTypeAdapter(Result.class, new Result.Serializer());
        Gson gson = gb.create();

        return gson.toJson(this);
    }

    public static <T extends DeviceJsonObject> T fromJson(final String json, Class<T> type) {
        GsonBuilder gb = new GsonBuilder();
        gb.registerTypeAdapter(Status.class, new Status.Deserializer());
        gb.registerTypeAdapter(Result.class, new Result.Deserializer());
        Gson gson = gb.create();
        
        return gson.fromJson(json, type);
    }
}
