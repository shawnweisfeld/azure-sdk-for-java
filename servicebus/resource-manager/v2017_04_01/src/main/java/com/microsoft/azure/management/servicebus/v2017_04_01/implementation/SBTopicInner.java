/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.servicebus.v2017_04_01.implementation;

import org.joda.time.DateTime;
import com.microsoft.azure.management.servicebus.v2017_04_01.MessageCountDetails;
import org.joda.time.Period;
import com.microsoft.azure.management.servicebus.v2017_04_01.EntityStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * Description of topic resource.
 */
@JsonFlatten
public class SBTopicInner extends ProxyResource {
    /**
     * Size of the topic, in bytes.
     */
    @JsonProperty(value = "properties.sizeInBytes", access = JsonProperty.Access.WRITE_ONLY)
    private Long sizeInBytes;

    /**
     * Exact time the message was created.
     */
    @JsonProperty(value = "properties.createdAt", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime createdAt;

    /**
     * The exact time the message was updated.
     */
    @JsonProperty(value = "properties.updatedAt", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime updatedAt;

    /**
     * Last time the message was sent, or a request was received, for this
     * topic.
     */
    @JsonProperty(value = "properties.accessedAt", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime accessedAt;

    /**
     * Number of subscriptions.
     */
    @JsonProperty(value = "properties.subscriptionCount", access = JsonProperty.Access.WRITE_ONLY)
    private Integer subscriptionCount;

    /**
     * Message count details.
     */
    @JsonProperty(value = "properties.countDetails", access = JsonProperty.Access.WRITE_ONLY)
    private MessageCountDetails countDetails;

    /**
     * ISO 8601 Default message timespan to live value. This is the duration
     * after which the message expires, starting from when the message is sent
     * to Service Bus. This is the default value used when TimeToLive is not
     * set on a message itself.
     */
    @JsonProperty(value = "properties.defaultMessageTimeToLive")
    private Period defaultMessageTimeToLive;

    /**
     * Maximum size of the topic in megabytes, which is the size of the memory
     * allocated for the topic. Default is 1024.
     */
    @JsonProperty(value = "properties.maxSizeInMegabytes")
    private Integer maxSizeInMegabytes;

    /**
     * Value indicating if this topic requires duplicate detection.
     */
    @JsonProperty(value = "properties.requiresDuplicateDetection")
    private Boolean requiresDuplicateDetection;

    /**
     * ISO8601 timespan structure that defines the duration of the duplicate
     * detection history. The default value is 10 minutes.
     */
    @JsonProperty(value = "properties.duplicateDetectionHistoryTimeWindow")
    private Period duplicateDetectionHistoryTimeWindow;

    /**
     * Value that indicates whether server-side batched operations are enabled.
     */
    @JsonProperty(value = "properties.enableBatchedOperations")
    private Boolean enableBatchedOperations;

    /**
     * Enumerates the possible values for the status of a messaging entity.
     * Possible values include: 'Active', 'Disabled', 'Restoring',
     * 'SendDisabled', 'ReceiveDisabled', 'Creating', 'Deleting', 'Renaming',
     * 'Unknown'.
     */
    @JsonProperty(value = "properties.status")
    private EntityStatus status;

    /**
     * Value that indicates whether the topic supports ordering.
     */
    @JsonProperty(value = "properties.supportOrdering")
    private Boolean supportOrdering;

    /**
     * ISO 8601 timespan idle interval after which the topic is automatically
     * deleted. The minimum duration is 5 minutes.
     */
    @JsonProperty(value = "properties.autoDeleteOnIdle")
    private Period autoDeleteOnIdle;

    /**
     * Value that indicates whether the topic to be partitioned across multiple
     * message brokers is enabled.
     */
    @JsonProperty(value = "properties.enablePartitioning")
    private Boolean enablePartitioning;

    /**
     * Value that indicates whether Express Entities are enabled. An express
     * topic holds a message in memory temporarily before writing it to
     * persistent storage.
     */
    @JsonProperty(value = "properties.enableExpress")
    private Boolean enableExpress;

    /**
     * Get size of the topic, in bytes.
     *
     * @return the sizeInBytes value
     */
    public Long sizeInBytes() {
        return this.sizeInBytes;
    }

    /**
     * Get exact time the message was created.
     *
     * @return the createdAt value
     */
    public DateTime createdAt() {
        return this.createdAt;
    }

    /**
     * Get the exact time the message was updated.
     *
     * @return the updatedAt value
     */
    public DateTime updatedAt() {
        return this.updatedAt;
    }

    /**
     * Get last time the message was sent, or a request was received, for this topic.
     *
     * @return the accessedAt value
     */
    public DateTime accessedAt() {
        return this.accessedAt;
    }

    /**
     * Get number of subscriptions.
     *
     * @return the subscriptionCount value
     */
    public Integer subscriptionCount() {
        return this.subscriptionCount;
    }

    /**
     * Get message count details.
     *
     * @return the countDetails value
     */
    public MessageCountDetails countDetails() {
        return this.countDetails;
    }

    /**
     * Get iSO 8601 Default message timespan to live value. This is the duration after which the message expires, starting from when the message is sent to Service Bus. This is the default value used when TimeToLive is not set on a message itself.
     *
     * @return the defaultMessageTimeToLive value
     */
    public Period defaultMessageTimeToLive() {
        return this.defaultMessageTimeToLive;
    }

    /**
     * Set iSO 8601 Default message timespan to live value. This is the duration after which the message expires, starting from when the message is sent to Service Bus. This is the default value used when TimeToLive is not set on a message itself.
     *
     * @param defaultMessageTimeToLive the defaultMessageTimeToLive value to set
     * @return the SBTopicInner object itself.
     */
    public SBTopicInner withDefaultMessageTimeToLive(Period defaultMessageTimeToLive) {
        this.defaultMessageTimeToLive = defaultMessageTimeToLive;
        return this;
    }

    /**
     * Get maximum size of the topic in megabytes, which is the size of the memory allocated for the topic. Default is 1024.
     *
     * @return the maxSizeInMegabytes value
     */
    public Integer maxSizeInMegabytes() {
        return this.maxSizeInMegabytes;
    }

    /**
     * Set maximum size of the topic in megabytes, which is the size of the memory allocated for the topic. Default is 1024.
     *
     * @param maxSizeInMegabytes the maxSizeInMegabytes value to set
     * @return the SBTopicInner object itself.
     */
    public SBTopicInner withMaxSizeInMegabytes(Integer maxSizeInMegabytes) {
        this.maxSizeInMegabytes = maxSizeInMegabytes;
        return this;
    }

    /**
     * Get value indicating if this topic requires duplicate detection.
     *
     * @return the requiresDuplicateDetection value
     */
    public Boolean requiresDuplicateDetection() {
        return this.requiresDuplicateDetection;
    }

    /**
     * Set value indicating if this topic requires duplicate detection.
     *
     * @param requiresDuplicateDetection the requiresDuplicateDetection value to set
     * @return the SBTopicInner object itself.
     */
    public SBTopicInner withRequiresDuplicateDetection(Boolean requiresDuplicateDetection) {
        this.requiresDuplicateDetection = requiresDuplicateDetection;
        return this;
    }

    /**
     * Get iSO8601 timespan structure that defines the duration of the duplicate detection history. The default value is 10 minutes.
     *
     * @return the duplicateDetectionHistoryTimeWindow value
     */
    public Period duplicateDetectionHistoryTimeWindow() {
        return this.duplicateDetectionHistoryTimeWindow;
    }

    /**
     * Set iSO8601 timespan structure that defines the duration of the duplicate detection history. The default value is 10 minutes.
     *
     * @param duplicateDetectionHistoryTimeWindow the duplicateDetectionHistoryTimeWindow value to set
     * @return the SBTopicInner object itself.
     */
    public SBTopicInner withDuplicateDetectionHistoryTimeWindow(Period duplicateDetectionHistoryTimeWindow) {
        this.duplicateDetectionHistoryTimeWindow = duplicateDetectionHistoryTimeWindow;
        return this;
    }

    /**
     * Get value that indicates whether server-side batched operations are enabled.
     *
     * @return the enableBatchedOperations value
     */
    public Boolean enableBatchedOperations() {
        return this.enableBatchedOperations;
    }

    /**
     * Set value that indicates whether server-side batched operations are enabled.
     *
     * @param enableBatchedOperations the enableBatchedOperations value to set
     * @return the SBTopicInner object itself.
     */
    public SBTopicInner withEnableBatchedOperations(Boolean enableBatchedOperations) {
        this.enableBatchedOperations = enableBatchedOperations;
        return this;
    }

    /**
     * Get enumerates the possible values for the status of a messaging entity. Possible values include: 'Active', 'Disabled', 'Restoring', 'SendDisabled', 'ReceiveDisabled', 'Creating', 'Deleting', 'Renaming', 'Unknown'.
     *
     * @return the status value
     */
    public EntityStatus status() {
        return this.status;
    }

    /**
     * Set enumerates the possible values for the status of a messaging entity. Possible values include: 'Active', 'Disabled', 'Restoring', 'SendDisabled', 'ReceiveDisabled', 'Creating', 'Deleting', 'Renaming', 'Unknown'.
     *
     * @param status the status value to set
     * @return the SBTopicInner object itself.
     */
    public SBTopicInner withStatus(EntityStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get value that indicates whether the topic supports ordering.
     *
     * @return the supportOrdering value
     */
    public Boolean supportOrdering() {
        return this.supportOrdering;
    }

    /**
     * Set value that indicates whether the topic supports ordering.
     *
     * @param supportOrdering the supportOrdering value to set
     * @return the SBTopicInner object itself.
     */
    public SBTopicInner withSupportOrdering(Boolean supportOrdering) {
        this.supportOrdering = supportOrdering;
        return this;
    }

    /**
     * Get iSO 8601 timespan idle interval after which the topic is automatically deleted. The minimum duration is 5 minutes.
     *
     * @return the autoDeleteOnIdle value
     */
    public Period autoDeleteOnIdle() {
        return this.autoDeleteOnIdle;
    }

    /**
     * Set iSO 8601 timespan idle interval after which the topic is automatically deleted. The minimum duration is 5 minutes.
     *
     * @param autoDeleteOnIdle the autoDeleteOnIdle value to set
     * @return the SBTopicInner object itself.
     */
    public SBTopicInner withAutoDeleteOnIdle(Period autoDeleteOnIdle) {
        this.autoDeleteOnIdle = autoDeleteOnIdle;
        return this;
    }

    /**
     * Get value that indicates whether the topic to be partitioned across multiple message brokers is enabled.
     *
     * @return the enablePartitioning value
     */
    public Boolean enablePartitioning() {
        return this.enablePartitioning;
    }

    /**
     * Set value that indicates whether the topic to be partitioned across multiple message brokers is enabled.
     *
     * @param enablePartitioning the enablePartitioning value to set
     * @return the SBTopicInner object itself.
     */
    public SBTopicInner withEnablePartitioning(Boolean enablePartitioning) {
        this.enablePartitioning = enablePartitioning;
        return this;
    }

    /**
     * Get value that indicates whether Express Entities are enabled. An express topic holds a message in memory temporarily before writing it to persistent storage.
     *
     * @return the enableExpress value
     */
    public Boolean enableExpress() {
        return this.enableExpress;
    }

    /**
     * Set value that indicates whether Express Entities are enabled. An express topic holds a message in memory temporarily before writing it to persistent storage.
     *
     * @param enableExpress the enableExpress value to set
     * @return the SBTopicInner object itself.
     */
    public SBTopicInner withEnableExpress(Boolean enableExpress) {
        this.enableExpress = enableExpress;
        return this;
    }

}