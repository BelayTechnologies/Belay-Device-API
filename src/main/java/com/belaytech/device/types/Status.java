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

    public static Status fromInt(int i) {
        return Status.values()[i - 1];
    }

    public static class Deserializer implements JsonDeserializer<Status> {

        @Override
        public Status deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
            return Status.fromInt(json.getAsInt());
        }
    }

    public static class Serializer implements JsonSerializer<Status> {

        @Override
        public JsonElement serialize(Status src, Type typeOfSrc, JsonSerializationContext context) {
            return new JsonPrimitive(src.getCode());
        }
    }
}
