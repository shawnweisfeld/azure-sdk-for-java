/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * <p>
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.storage.queue.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

/**
 * A Message object which can be stored in a Queue.
 */
@JacksonXmlRootElement(localName = "QueueMessage")
public final class QueueMessage {
    /**
     * The content of the message.
     */
    @JsonProperty(value = "MessageText", required = true)
    private String messageText;

    /**
     * Get the messageText value.
     *
     * @return the messageText value.
     */
    public String messageText() {
        return this.messageText;
    }

    /**
     * Set the messageText value.
     *
     * @param messageText
     *         the messageText value to set.
     *
     * @return the QueueMessage object itself.
     */
    public QueueMessage withMessageText(String messageText) {
        this.messageText = messageText;
        return this;
    }
}
