/*
 * Copyright (C) 2016 Belay Technologies
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
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
