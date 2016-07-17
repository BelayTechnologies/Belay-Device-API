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
