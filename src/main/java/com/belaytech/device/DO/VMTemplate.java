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

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 *
 * @author Joshua
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class VMTemplate extends DeviceJsonObject<VMTemplate> {

    private int id;
    private String name;
    @SerializedName("os")
    private String operatingSystem;
    @SerializedName("os_type")
    private String operatingSystemType;
    @SerializedName("os_version")
    private String operatingSystemVersion;
    @SerializedName("os_service_pack")
    private String operatingSystemServicePack;
    @SerializedName("os_arch")
    private String operatingSystemArchitecture;
    @SerializedName("os_user_name")
    private String operatingSystemUserName;
    @SerializedName("os_user_pwd")
    private String operatingSystemPassword;
}
