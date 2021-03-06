/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.batchai.v2018_05_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Manual scale settings for the cluster.
 */
public class ManualScaleSettings {
    /**
     * The desired number of compute nodes in the Cluster.
     * Default is 0. If autoScaleSettings are not specified, then the Cluster
     * starts with this target.
     */
    @JsonProperty(value = "targetNodeCount", required = true)
    private int targetNodeCount;

    /**
     * Determines what to do with the job(s) running on compute node if the
     * Cluster size is decreasing.
     * The default value is requeue. Possible values include: 'requeue',
     * 'terminate', 'waitforjobcompletion'.
     */
    @JsonProperty(value = "nodeDeallocationOption")
    private DeallocationOption nodeDeallocationOption;

    /**
     * Get the targetNodeCount value.
     *
     * @return the targetNodeCount value
     */
    public int targetNodeCount() {
        return this.targetNodeCount;
    }

    /**
     * Set the targetNodeCount value.
     *
     * @param targetNodeCount the targetNodeCount value to set
     * @return the ManualScaleSettings object itself.
     */
    public ManualScaleSettings withTargetNodeCount(int targetNodeCount) {
        this.targetNodeCount = targetNodeCount;
        return this;
    }

    /**
     * Get the nodeDeallocationOption value.
     *
     * @return the nodeDeallocationOption value
     */
    public DeallocationOption nodeDeallocationOption() {
        return this.nodeDeallocationOption;
    }

    /**
     * Set the nodeDeallocationOption value.
     *
     * @param nodeDeallocationOption the nodeDeallocationOption value to set
     * @return the ManualScaleSettings object itself.
     */
    public ManualScaleSettings withNodeDeallocationOption(DeallocationOption nodeDeallocationOption) {
        this.nodeDeallocationOption = nodeDeallocationOption;
        return this;
    }

}
