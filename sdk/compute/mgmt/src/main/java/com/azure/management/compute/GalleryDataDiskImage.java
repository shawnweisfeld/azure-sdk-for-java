// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.compute;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The GalleryDataDiskImage model.
 */
@Immutable
public final class GalleryDataDiskImage extends GalleryDiskImage {
    /*
     * This property specifies the logical unit number of the data disk. This
     * value is used to identify data disks within the Virtual Machine and
     * therefore must be unique for each data disk attached to the Virtual
     * Machine.
     */
    @JsonProperty(value = "lun", access = JsonProperty.Access.WRITE_ONLY)
    private Integer lun;

    /**
     * Get the lun property: This property specifies the logical unit number of
     * the data disk. This value is used to identify data disks within the
     * Virtual Machine and therefore must be unique for each data disk attached
     * to the Virtual Machine.
     * 
     * @return the lun value.
     */
    public Integer lun() {
        return this.lun;
    }
}
